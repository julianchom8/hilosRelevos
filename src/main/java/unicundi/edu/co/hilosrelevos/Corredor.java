package com.mycompany.hilosrelevos;

import java.awt.BorderLayout;



public class Corredor extends Thread {

    Equipo equipo;
    private int paso;
    private int fin;
    private String equipo1;
    private String equipo2;
    private String equipo3;
    private int movimientoActual;

    /**
     * Constuctor de la clase
     *
     * @param equipo
     * @param paso
     * @param fin
     */
    public Corredor(Equipo equipo, int paso, int fin) {
        this.equipo = equipo;
        this.paso = paso;
        this.fin = fin;
    }

    /**
     * Metodo de la clase Thread sincronizacion de los hilos para los corredores
     */
    @Override
    public void run() {

        if (paso == 0) {
            while (true) {
                movimientoActual = posicionPasos(1);

                if (movimientoActual >= 33) {

                    equipo.setPosicionA(33);
                    synchronized (equipo) {
                        equipo.notifyAll();
                        paso = 33;
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    System.out.println("Error en el hilo");
                }
            }

        }
        if (paso == 33) {
            while (true) {
                movimientoActual = posicionPasos(2);
                if (movimientoActual >= 66) {
                    equipo.setPosicionB(66);
                    synchronized (equipo) {
                        equipo.notify();
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    System.out.println("Error en el hilo");
                }
            }

        }
        if (paso == 66) {
            while (true) {
                movimientoActual = posicionPasos(3);
                if (movimientoActual >= 100) {
                    equipo.setPosicionC(100);
                    System.out.println("Equipo ganador " + equipo.getNombre());
                    System.exit(0);
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    System.out.println("Error en el hilo");
                }
            }
        }

    }

    /**
     * Metodo que suma pasos al camino recorrido del corredor
     *
     * @param numPosi
     * @return
     */
    public int posicionPasos(int numPosi) {
        int valorAvance; 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo");
        }
         valorAvance = Random.random();
        if (numPosi == 1) {
            
            equipo.setPosicionA(equipo.getPosicionA() + valorAvance);
            
            if (equipo.imprimir().contains("1")) {
                equipo1 = equipo.imprimir();
            } else if (equipo.imprimir().contains("2")) {
                equipo3 = equipo.imprimir();
            } else if (equipo.imprimir().contains("3")) {
                equipo2 = equipo.imprimir();
            }
            if (equipo1 != null) {
                System.out.println(equipo1);
            }
            if (equipo2 != null) {
                System.out.println(equipo2);
            }
            if (equipo3 != null) {
                System.out.println(equipo3);
            }
            return equipo.getPosicionA();
        }
        if (numPosi == 2) {
            
            equipo.setPosicionB(equipo.getPosicionB() + valorAvance);
            
            if (equipo.imprimir().contains("1")) {
                equipo1 = equipo.imprimir();
            } else if (equipo.imprimir().contains("2")) {
                equipo3 = equipo.imprimir();
            } else if (equipo.imprimir().contains("3")) {
                equipo2 = equipo.imprimir();
            }
            if (equipo1 != null) {
                System.out.println(equipo1);
            }
            if (equipo2 != null) {
                System.out.println(equipo2);
            }
            if (equipo3 != null) {
                System.out.println(equipo3);
            }
            return equipo.getPosicionB();
        }
        if (numPosi == 3) {
            
            equipo.setPosicionC(equipo.getPosicionC() + valorAvance);
            
            if (equipo.imprimir().contains("1")) {
                equipo1 = equipo.imprimir();
            } else if (equipo.imprimir().contains("2")) {
                equipo3 = equipo.imprimir();
            } else if (equipo.imprimir().contains("3")) {
                equipo2 = equipo.imprimir();
            }
            if (equipo1 != null) {
                System.out.println(equipo1);
            }
            if (equipo2 != null) {
                System.out.println(equipo2);
            }
            if (equipo3 != null) {
                System.out.println(equipo3);
            }

            return equipo.getPosicionC();
        }
        return 0;
    }
}
