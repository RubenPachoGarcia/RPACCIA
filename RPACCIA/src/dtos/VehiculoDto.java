package dtos;

import java.time.LocalDate;

public class VehiculoDto {

	long id=0;
	String matricula="aaaaa";
	LocalDate fchMatriculacion;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDate getFchMatriculacion() {
		return fchMatriculacion;
	}
	public void setFchMatriculacion(LocalDate fchMatriculacion) {
		this.fchMatriculacion = fchMatriculacion;
	}
	
	public VehiculoDto(long id, String matricula, LocalDate fchMatriculacion) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.fchMatriculacion = fchMatriculacion;
	}
	
	public VehiculoDto() {
		super();
	}
}