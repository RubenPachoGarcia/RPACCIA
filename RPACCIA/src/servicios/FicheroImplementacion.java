package servicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.PropietarioDto;
import dtos.VehiculoDto;

public class FicheroImplementacion implements FicheroInterfaz{

	//Metodo mediante el cual se realizara la carga incial de datos de manera transparente cuando el usuario inicie la aplicacion
	public void cargaInicial() throws IOException {
		
		try {
			
			FileReader fr = new FileReader(Inicio.RUTAFICHEROCARGAINICIAL);
			BufferedReader br=new BufferedReader(fr);
			DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			String lineas;
			
			while((lineas = br.readLine()) != null) {
				
				String[] ficheroArray=lineas.split(":");
				
				VehiculoDto vehiculo=new VehiculoDto();
				PropietarioDto propietario=new PropietarioDto();
				
				vehiculo.setMatricula(ficheroArray[0]);
				propietario.setMatricula(ficheroArray[0]);
				
				vehiculo.setFchMatriculacion(LocalDate.parse(ficheroArray[1], formato));
				
				propietario.setDni(ficheroArray[2]);
				
				propietario.setFchCompra(LocalDate.parse(ficheroArray[3], formato));
				
				Inicio.listaVehiculos.add(vehiculo);
				Inicio.listaPropietarios.add(propietario);
			}
		
		} catch (FileNotFoundException ex) {	
			System.out.println("ERROR DETECTADO".concat(ex.toString()));
		}
	}
	
	//Metodo mediante el cual se dejara constancia en un fichero log de las opciones que el usuario selecciona, los errores que se producen y cualquier movimiento en la aplicacion
	public void escribirFicheroLog(String mensaje) {
		
		try {
			
			FileWriter fw=new FileWriter(Inicio.RUTAFICHEROLOG, true);
			BufferedWriter bw=new BufferedWriter(fw);
			fw.write(mensaje.concat("\n"));
			fw.close();
		
		} catch (IOException ex) {
			System.out.println("ERROR DETECTADO".concat(ex.toString()));
		}
	}
}
