package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utilidades {

	public static String nombreFicheroLog() {
		
		LocalDate fechaActual=LocalDate.now();
		DateTimeFormatter fechaFormato=DateTimeFormatter.ofPattern("ddMMyyyy");
		
		String fechaFormateada=fechaActual.format(fechaFormato);
		
		String nombreLog="log-".concat(fechaFormateada).concat(".txt");
		
		return nombreLog;
	}
}

