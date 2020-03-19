
package unicundi.edu.co.hilosrelevos;

import com.mycompany.hilosrelevos.Corredor;
import com.mycompany.hilosrelevos.Equipo;

/**
 *
 * @author Julian Medina
 * @author Erika Cortes
 */
public class Main {
    
    public static void main(String[] args) {
    Equipo equipo1 = new Equipo("1", 0, 100);
    
     Corredor atleta1 = new Corredor(equipo1, 0, 33);
     Corredor atleta4 = new Corredor(equipo1, 33, 66);
     Corredor atleta7 = new Corredor(equipo1, 66, 100);
     
    Equipo equipo2 = new Equipo("2", 0, 100);
    
    Corredor atleta2 = new Corredor(equipo2, 0, 33);
    Corredor atleta5 = new Corredor(equipo2, 33, 66);
    Corredor atleta8 = new Corredor(equipo2, 66, 100);
    
    Equipo equipo3 = new Equipo("3", 0, 100);

    Corredor atleta3 = new Corredor(equipo3, 0, 33);
    Corredor atleta6 = new Corredor(equipo3, 33, 66);
    Corredor atleta9 = new Corredor(equipo3, 66, 100);
    
        atleta1.start ();
        atleta2.start ();
        atleta3.start ();
        atleta4.start ();
        atleta5.start ();
        atleta6.start ();
        atleta7.start ();
        atleta8.start ();
        atleta9.start ();
    }
}
