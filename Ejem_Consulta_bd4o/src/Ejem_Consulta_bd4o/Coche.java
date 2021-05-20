package Ejem_Consulta_bd4o;

/**
 * Clase coche
 *
 * @author Euris Alc.
 */
public class Coche {
    
    // Variables
    private String matricula, marca, color;
    private double precio;
    private int puertas, caballos;

    public Coche(String matricula, String marca, String color,
            double precio, int puertas, int caballos) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
        this.puertas = puertas;
        this.caballos = caballos;
    }

    // Métodos get, set y toString
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", precio=" + precio + ", puertas=" + puertas + ", caballos=" + caballos + '}';
    }

}
