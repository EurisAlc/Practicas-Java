package propagarexcepciones;

/**
 * Esta clase indica si un DNI es correcto o no
 * 
 * Versión 1.0
 * @author EurisAlc
 *
 */

public class DNIException extends Exception {
	
    /**
    * Constructor con parámetros de la clase
    * @param mensaje Mensaje de la excepción
    */
	
    public DNIException(String mensaje) {
        super(mensaje);
	}

}
