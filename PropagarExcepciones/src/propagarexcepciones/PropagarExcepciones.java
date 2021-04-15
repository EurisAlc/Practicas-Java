package propagarexcepciones;

/**
 * Versión 1.0
 * @author Euris Alc.
 */
public class PropagarExcepciones {

	/**
	 * Este método validará si un DNI es correcto
	 * @param DNI DNI a validar
	 * @throws DNIException En caso de que el DNI no sea
	 * correcto se lanzará esta excepción.
	 */

    public static void validarDNI(String DNI) throws DNIException
    {
	int DNIsinletra = Integer.valueOf(DNI.substring(0, 8));
	String letra = DNI.substring(8, 9);
	String[] letras = {"T", "R", "w", "A", "G", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
	int resto = DNIsinletra % 23;
		
	if( !letra.equals(letras[resto]))
	{
                throw new DNIException("La letra del DNI no es correcta");
	}

    }
	
    public static void main(String[] args)
    {
	// Validamos un DNI correcto
	
	try
	{
		String DNI = "82365489T";
		validarDNI(DNI);
		System.out.println("El DNI " + DNI + "es correcto");
	}
	catch (DNIException ex)
	{
		System.out.println("Error: " + ex.toString());
	}
		
	// Validar un DNI incorrecto
		
	try
	{
		String DNI = "12365489T";
		validarDNI(DNI);
		System.out.println("El DNI " + DNI + "es correcto");
	}
	catch (DNIException ex)
	{
		System.out.println("Error: " + ex.toString());
	}
    }
}




















