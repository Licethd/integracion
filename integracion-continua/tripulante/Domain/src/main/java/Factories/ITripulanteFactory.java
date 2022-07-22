package Factories;

import Model.Tripulante.Cargo;
// import Domain.Factories.TripulanteFactory.Cargo;
import Model.Tripulante.Tripulante;

public interface ITripulanteFactory {
	public Tripulante Create(
		String nombre,
		String apellido,
		String emailAddress,
		Cargo cargo
	);
}
