package dtos;

import java.time.LocalDate;

public class PropietarioDto {

	long id=0;
	String dni="aaaaa";
	LocalDate fchCompra;
	String matricula="aaaaa";
	boolean esHistorico;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFchCompra() {
		return fchCompra;
	}
	public void setFchCompra(LocalDate fchCompra) {
		this.fchCompra = fchCompra;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isEsHistorico() {
		return esHistorico;
	}
	public void setEsHistorico(boolean esHistorico) {
		this.esHistorico = esHistorico;
	}
	
	public PropietarioDto() {
		super();
	}
	
	@Override
	public String toString() {
		
		String objetoString="[VEH] ".concat(this.matricula).concat(" [PRO] ").concat(this.dni);
		return objetoString;
	}
}
