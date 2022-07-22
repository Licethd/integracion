package Controllers;

import static org.mockito.ArgumentMatchers.any;

import Context.IWriteDbContext;
import Context.MongoDB.WriteDbContext;
import Event.PersonalRegistrado;
import Factories.ITripulanteFactory;
import Model.Tripulante.Cargo;
import Model.Tripulante.Tripulante;
import Repositories.ITripulanteRepository;
import Repository.TripulanteRepository;
import UsesCases.Command.Tripulante.Crear.CrearTripulanteCommand;
import UsesCases.Queries.Tripulante.GetAll.GetAllTripulanteQuery;
import fourteam.db.DbContext;
import fourteam.http.Exception.HttpException;
import fourteam.http.Response;
import fourteam.http.annotation.RequestBody;
import fourteam.mediator.Mediator;
import java.util.List;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TripulanteController_Test {

	ITripulanteFactory tripulanteFactory = Mockito.mock(
		ITripulanteFactory.class
	);
	ITripulanteRepository tripulanteRepository = Mockito.mock(
		ITripulanteRepository.class
	);
	GetAllTripulanteQuery getAllQuery = Mockito.mock(
		GetAllTripulanteQuery.class
	);
	Mediator mediator = Mockito.mock(Mediator.class);

	@Before
	public void setup() {}

	@Test
	public void HandleTripulanteController_Ok() throws HttpException {
		// creando tripulante
		UUID keyTest = UUID.randomUUID();
		String nombreTest = "Jose";
		String apellidoTest = "Perez";
		String emailAddressTest = "jose@gmail.com";
		// Cargo cargoTest = "Piloto";
		Cargo cargoTest = new Cargo(2500.0, "asistente");

		TripulanteController tripulanteController = new TripulanteController(
			any(Mediator.class)
		);
		mediator.send(new GetAllTripulanteQuery());
		//tripulanteController.getAll();

	}
}
