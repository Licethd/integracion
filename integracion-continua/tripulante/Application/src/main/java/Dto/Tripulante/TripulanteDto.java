package Dto.Tripulante;

import Model.Tripulante.Cargo;
import java.util.UUID;

public class TripulanteDto {

	public UUID Key;
	public String Nombre;
	public String Apellido;
	public String EmailAddress;
	public Cargo Cargo;

	public TripulanteDto() {}

	public TripulanteDto(
		UUID key,
		String nombre,
		String apellido,
		String emailAddress,
		Cargo cargo
	) {
		Key = key;
		Nombre = nombre;
		Apellido = apellido;
		EmailAddress = emailAddress;
		Cargo = cargo;
	}

	public void setKey(UUID key) {
		this.Key = key;
	}

	public UUID getKey() {
		return Key;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public Cargo getCargo() {
		return Cargo;
	}

	public void setCargo(Cargo cargo) {
		Cargo = cargo;
	}
}
