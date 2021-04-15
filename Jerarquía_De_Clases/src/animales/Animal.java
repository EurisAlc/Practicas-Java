package animales;

/**
 * Clase Animal de tipo abstracta.
 * Versión 1.0
 * @author Euris Alc.
 */
public abstract class Animal{
    
    // Atributo de tipo String
    private String nombre;
    
    // Constructor con parametros
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    // Métodos Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto llamado desplazarse
    public abstract void desplazarse();
}
