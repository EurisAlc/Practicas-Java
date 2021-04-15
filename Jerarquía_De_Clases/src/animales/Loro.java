package animales;

/**
 * Subclase Loro
 * Versión 1.0
 * @author Euris Alc.
 */
public class Loro extends Animal{

    // Constructor con parametro
    public Loro(String nombre) 
    {
        // Llamada del constructor de la calse padre.
        super(nombre);
    }

    @Override
    public void desplazarse() {
        System.out.println("Soy el loro " + getNombre() +" y vuelo.");
    }

}
