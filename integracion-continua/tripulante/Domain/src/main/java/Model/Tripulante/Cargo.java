package Model.Tripulante;

import core.Entity;
import java.util.UUID;

// import java.util.Date;

public class Cargo extends Entity<UUID> {

	// public abstract class Cargo extends Tripulante {

	private String descripcion;
	private Double sueldo;

	// private Date fecha_ingreso;

	public Cargo() {}

	public Cargo(Double sueldo, String descripcion) {
		// super(nombre, apellido, emailAddress);
		// key = UUID.randomUUID();
		this.descripcion = descripcion;
		this.sueldo = sueldo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	// @Override
	// public String toString() {
	// return "Cargo{" + "descripcion=" + descripcion + ", sueldo=" + sueldo + '}';
	// }

}
