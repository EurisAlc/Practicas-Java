package animales;

/**
 * Subclase Perro
 * Versión 1.0
 * @author Euris Alc.
 */
public class Perro extends Animal{
    
    // Constructor con parametro
    public Perro(String nombre) 
    {
        // Llamada del constructor de la calse padre.
        super(nombre);
    }
    
    // Método sobreescrito mediante @Override.
    @Override
    public void desplazarse() {
        System.out.println("Soy un perro " + getNombre() + " y ando.");
    }

}
