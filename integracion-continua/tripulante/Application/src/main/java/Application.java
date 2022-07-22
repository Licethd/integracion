// import UsesCases.Command.Cargo.UpdateCargoWhenTripulanteCreado.UpdateCargoWhenTripulanteCreado;
import Factories.ITripulanteFactory;
import Factories.TripulanteFactory;
import UsesCases.Command.Tripulante.Crear.CrearTripulanteHandler;
import UsesCases.Command.Tripulante.Editar.EditarTripulanteHandler;
import UsesCases.Command.Tripulante.Eliminar.EliminarTripulanteHandler;
import UsesCases.Queries.Tripulante.GetAll.GetAllTripulanteHandler;
import UsesCases.Queries.Tripulante.GetByKey.GetTripulanteByKeyHandler;
import fourteam.extensions.IServiceCollection;
import fourteam.mediator.IMediator;

public class Application {

	public static void AddApplication() {
		// INFO:Usamos el IMediator del SharedKernel en cambio del MediatR de Spring
		IMediator.registerHandler(GetAllTripulanteHandler.class);
		IMediator.registerHandler(GetTripulanteByKeyHandler.class);
		IMediator.registerHandler(CrearTripulanteHandler.class);
		IMediator.registerHandler(EliminarTripulanteHandler.class);
		IMediator.registerHandler(EditarTripulanteHandler.class);

		// IMediator.registerHandler(UpdateCargoWhenTripulanteCreado.class);

		IServiceCollection.AddTransient(
			ITripulanteFactory.class,
			TripulanteFactory.class
		);
	}
}
