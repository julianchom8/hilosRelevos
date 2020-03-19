package unicundi.edu.co.hilosrelevos;

/**
 *
 * @author Julian Medina
 * @author Erika Cortes
 */
public class Equipo extends Thread {

    /**
     * posicion del corredor
     */
    private int posicionA;
    /**
     * posicion del corredor
     */
    private int posicionB;
    /**
     * posicion del corredor
     */
    private int posicionC;
    /**
     * Declaracion Nombre de quipo
     */
    private String nombre;

    /**
     * variable que da empezar al corredor
     */
    private int empezar;
    /**
     * creacion de variable del final del camino
     */
    private int fin;
    /**
     * Son variables de que dan color a la impresion en consola
     */
    public static final String ANSI_RED = "\u001B[31m";
    /**
     * Son variables de que dan color a la impresion en consola
     */
    public static final String ANSI_YELLOW = "\u001B[33m";
    /**
     * Son variables de que dan color a la impresion en consola
     */
    public static final String ANSI_CYAN = "\u001B[36m";
    /**
     * Son variables de que dan color a la impresion en consola
     */
    public static final String ANSI_BLACK= "\u001B[32m";
    /**
     * Constructor de la clase
     *
     * @param nombre
     * @param empezar
     * @param fin
     */
    public Equipo(String nombre, int empezar, int fin) {
        this.nombre = nombre;
        this.empezar = empezar;
        this.fin = fin;
        this.posicionA = 0;
        this.posicionB = 33;
        this.posicionC = 66;
    }

    /**
     * metodo sincronizado que imprime posiciones de los corredores
     *
     * @return
     */
    public synchronized String imprimir() {
        String dezplaza = "Equipo: " + nombre + " ";

        for (int i = empezar; i <= fin; i++) {
            
            if (i == posicionA) {
                
                dezplaza += ANSI_RED + "O";
                
            } else if (i == posicionB) {
                
                dezplaza += ANSI_YELLOW + "+";
                
            } else if (i == posicionC) {
                
                dezplaza += ANSI_CYAN + "#";
                
            } else {
                dezplaza += ANSI_BLACK+".";
            }
        }

        return dezplaza;

    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que recibe
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    public int getEmpezar() {
        return empezar;
    }

    /**
     * Metodo que recibe
     *
     * @param empezar
     */
    public void setEmpezar(int empezar) {
        this.empezar = empezar;
    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    public int getFin() {
        return fin;
    }

    /**
     * Metodo que recibe
     *
     * @param fin
     */
    public void setFin(int fin) {
        this.fin = fin;
    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    public int getPosicionA() {
        return posicionA;
    }

    /**
     * Metodo que recibe
     *
     * @param posicionA
     */
    public void setPosicionA(int posicionA) {
        this.posicionA = posicionA;
    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    public int getPosicionB() {
        return posicionB;
    }

    /**
     * Metodo que recibe
     *
     * @param posicionB
     */
    public void setPosicionB(int posicionB) {
        this.posicionB = posicionB;
    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    public int getPosicionC() {
        return posicionC;
    }

    /**
     * Metodo que recibe
     *
     * @param posicionC
     */
    public void setPosicionC(int posicionC) {
        this.posicionC = posicionC;
    }

}
