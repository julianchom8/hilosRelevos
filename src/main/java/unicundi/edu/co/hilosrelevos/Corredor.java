package unicundi.edu.co.hilosrelevos;

import java.awt.BorderLayout;



public class Corredor extends Thread {

    Equipo equipo;
    private int posicion;
    private int fin;
    private String equipo1;
    private String equipo2;
    private String equipo3;
    private int movimientoActual;

    /**
     * Constuctor de la clase
     *
     * @param equipo
     * @param posicion
     * @param fin
     */
    public Corredor(Equipo equipo, int posicion, int fin) {
        this.equipo = equipo;
        this.posicion = posicion;
        this.fin = fin;
    }

    /**
     * Metodo de la clase Thread sincronizacion de los hilos para los corredores
     */
    @Override
    public void run() {

        if (posicion == 0) {
            while (true) {
                movimientoActual = posicionCorredor(1);

                if (movimientoActual >= 33) {

                    equipo.setPosicionA(33);
                    synchronized (equipo) {
                        equipo.notifyAll();
                        posicion = 33;
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
        if (posicion == 33) {
            while (true) {
                movimientoActual = posicionCorredor(2);
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
        if (posicion == 66) {
            while (true) {
                movimientoActual = posicionCorredor(3);
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
     * @param numeroProsicion
     * @return
     */
    public int posicionCorredor(int numeroProsicion) {
        int valorAvance; 
        try {
            Thread.sleep(800);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo");
        }
         valorAvance = Random.Random();
        if (numeroProsicion == 1) {
            
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
        if (numeroProsicion == 2) {
            
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
        if (numeroProsicion == 3) {
            
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
