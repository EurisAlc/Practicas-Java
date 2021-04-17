package jerarquía_de_clases;

import animales.Animal;
import animales.Loro;
import animales.Perro;
import animales.Serpiente;
import java.util.ArrayList;

/**
 * Clase Pincipal Abstracta (abstract).
 * Jerarquía de clases. Polimorfismo estático.
 * Uso de la sentencia instaceof.
 * Vesrión 1.0
 * @author Euris Alc.
 */
public class Jerarquía_De_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Métodos principales
        Perro animal1 = new Perro("boby");
        Serpiente animal2 = new Serpiente("Kaathe");
        Loro animal3 = new Loro ("Misi");
        Serpiente animal4 = new Serpiente ("Framp");
        
        // ArrayList que contiene datos de la clase Animal
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(animal1);
        animales.add(animal2);
        animales.add(animal3);
        animales.add(animal4);
        
        // Bucle for-if
        for(Animal ani : animales)
        {
            if(ani instanceof Perro)
            {
                System.out.println("Perro " + ani.getNombre());
            }
            if(ani instanceof Loro)
            {
                System.out.println("Loro " + ani.getNombre());
            }
            if(ani instanceof Serpiente)
            {
                System.out.println("Serpiente " + ani.getNombre());
            }
        }
    }
    
}





