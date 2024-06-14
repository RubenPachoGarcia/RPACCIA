package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	//Metodo que muestra el menu principal de la aplicacion y permite al usuario interactuar con el
	public int menuPrincipal() {
		
		Scanner sc=new Scanner(System.in);
		
		int opcionUsuario;
		
		System.out.println("BIENVENIDO");
		System.out.println("-----------------");
		System.out.println("0. CERRAR MENU");
		System.out.println("1. VENTA VEHICULO");
		System.out.println("-----------------");
		System.out.println("SELECCIONE LA OPCION QUE DESEE: ");
		
		opcionUsuario=sc.nextInt();
		
		return opcionUsuario;
	}
}
