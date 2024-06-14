package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.PropietarioDto;
import dtos.VehiculoDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;
import util.Utilidades;

public class Inicio {

	public static final String RUTACARPETALOGS = "C:\\Users\\ruben\\eclipse-workspace\\recuperacion-java-workspace\\RPACCIA\\logs\\";

	public static final String RUTAFICHEROLOG = RUTACARPETALOGS.concat(Utilidades.nombreFicheroLog());

	public static final String RUTAFICHEROCARGAINICIAL = "C:\\Users\\ruben\\eclipse-workspace\\recuperacion-java-workspace\\RPACCIA\\vehiculosYpropietarios.txt";

	public static List<VehiculoDto> listaVehiculos = new ArrayList<>();

	public static List<PropietarioDto> listaPropietarios = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		OperativaInterfaz oi=new OperativaImplementacion();

		//Variabale opcion con la que el usuario podra interactuar con el menu de lam aplicacion y variable cerrarMenu para controlar el cierre de la aplicacion cuando el usuario lo indique 
		int opcion;
		boolean cerrarMenu = false;

		try {
			fi.escribirFicheroLog("HAS ENTRADO");
			fi.cargaInicial();
			//Bucle que controlara las acciones del usuario durante el uso de la aplicacion
			while (!cerrarMenu) {

				opcion = mi.menuPrincipal();

				switch (opcion) {

				case 0:
					fi.escribirFicheroLog("SE CIERRA EL MENU");
					System.out.println("SE CIERRA EL MENU");
					cerrarMenu = true;
					break;
				case 1:
					fi.escribirFicheroLog("VENTA VEHICULO");
					System.out.println("OPCION 1");
					oi.ventaVehiculo();
					break;
				default:
					fi.escribirFicheroLog("LA OPCION SELECCIONADA NO ES VALIDA O NO EXISTE");
					System.out.println("LA OPCION SELECCIONADA NO ES VALIDA O NO EXISTE");
					break;
				}
			}
		} catch (Exception ex) {
			fi.escribirFicheroLog("ERROR DETECTADO".concat(ex.toString()));
			System.out.println("ERROR DETECTADO".concat(ex.toString()));
		}
	}

}
