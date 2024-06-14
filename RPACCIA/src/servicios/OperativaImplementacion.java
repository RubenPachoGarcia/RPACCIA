package servicios;

import java.time.LocalDate;
import java.util.Scanner;

import controladores.Inicio;
import dtos.PropietarioDto;
import dtos.VehiculoDto;

public class OperativaImplementacion implements OperativaInterfaz{

	FicheroInterfaz fi = new FicheroImplementacion();
	
	//Metodo mediante el cual el usuario introduce una matricula y si es verificada podra cambiar el propietario
	public void ventaVehiculo() {
		
		Scanner sc=new Scanner(System.in);
		
		PropietarioDto propietario=new PropietarioDto();
		
		for(PropietarioDto propietarios: Inicio.listaPropietarios) {
			
			System.out.println(propietarios.toString());
		}
		
		System.out.println("INTRODUZCA LA MATRICULA DEL VEHICULO: ");
		String matriculaAVerificar=sc.next();
		
		for(PropietarioDto propietarios: Inicio.listaPropietarios) {
			
			if(matriculaAVerificar.equals(propietarios.getMatricula())) {
				
				System.out.println("LA MATRICULA HA SIDO VERIFICADA");
				
				System.out.println("INTRODUZCA EL DNI DEL NUEVO PROPIETARIO: ");
				String nuevoDni=sc.next();
				
				for(PropietarioDto propietarios2: Inicio.listaPropietarios) {
					
					propietarios.setDni(nuevoDni);
					
					propietarios.setId(idAutomatico());
					
					LocalDate fechaActual=LocalDate.now();
					propietarios.setFchCompra(fechaActual);
					
					propietarios.setMatricula(matriculaAVerificar);
				}
				
				fi.escribirFicheroLog("MATRICULA VERIFICADA");
			}
			else {
				fi.escribirFicheroLog("MATRICULA NO VERIFICADA");
			}
		}
	}
	
	//Metodo que genera un id automatico decreciente empezando en 100
	private long idAutomatico() {
		
		long idAutomatico=100;
		int tamanioLista=Inicio.listaPropietarios.size();
		
		if(tamanioLista==0) {
			idAutomatico=100;
		}
		else if(tamanioLista<100){
			idAutomatico=tamanioLista-1;
		}
		
		return idAutomatico;
	}
}
