package servicios;

import java.io.IOException;

public interface FicheroInterfaz {

	/**
	 * Metodo mediante el cual se realizara la carga incial de datos de manera transparente cuando el usuario inicie la aplicacion
	 * RPG-14062024
	 * @throws IOException
	 */
	public void cargaInicial() throws IOException;
	/**
	 * Metodo mediante el cual se dejara constancia en un fichero log de las opciones que el usuario selecciona, los errores que se producen y cualquier movimiento en la aplicacion
	 * RPG-14062024
	 * @param mensaje
	 */
	public void escribirFicheroLog(String mensaje);
}
