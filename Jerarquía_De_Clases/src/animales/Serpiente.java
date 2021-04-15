package animales;

/**
 * Subclase Serpiente
 * Versión 1.0
 * @author Euris Alc.
 */
public class Serpiente extends Animal{

    // Constructor con parametros
    public Serpiente(String nombre) 
    {
        // Llamada del constructor de la calse padre.
        super(nombre);
    }

    @Override
    public void desplazarse() {
        System.out.println("Soy una serpiente " + getNombre() +" y repto.");
    }

}
