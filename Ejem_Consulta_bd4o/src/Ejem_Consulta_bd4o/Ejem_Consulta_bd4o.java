package Ejem_Consulta_bd4o;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;

/**
 * Clase principal Coche
 * Consulta de una base de datos de tipo DB4o 
 * Versión 1.0
 * @author Euris Alc.
 */
public class Ejem_Consulta_bd4o {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ObjectContainer bd = null;

        try {
            // Conexión con bd
            bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "coche.db4o");
            
            /**
            // Agregar coches
            Coche c1 = new Coche("4804CKT", "Renault", "Azul", 17000, 5, 92);
            Coche c2 = new Coche("5862YFT", "Seat", "Blanco", 15500, 5, 75);
            Coche c3 = new Coche("6947XCS", "Nissan", "Negro", 12300, 3, 95);
            bd.store(c1);
            bd.store(c2);
            bd.store(c3);
            **/
            
            // Consulta (1) obtener la lista completa
            Coche consulta1 = new Coche(null, null, null, 0, 0, 0);
            ObjectSet res1 = bd.queryByExample(consulta1);
            System.out.println("Lista de coches");
            while (res1.hasNext())
            {
                System.out.println(res1.next());
            }
                System.out.println("----------------------------------------------------------------------------------------------");

            // Consulta (2) obtener el primer coche después de visualizar todos los datos
            Coche consulta2 = new Coche(null, null, null, 0, 0, 0);
            ObjectSet res2 = bd.queryByExample(consulta2);
            
            // Obtener el primer coche de la bd
            System.out.println(res1.get(0).toString());

        } catch (Db4oIOException | DatabaseFileLockedException | IncompatibleFileFormatException | OldFormatException | DatabaseReadOnlyException ex) {
            System.out.println("Error: " + ex.toString());
        
        // Cierre de la base de datos
        } finally {
            bd.close();
        }
    }

}
































