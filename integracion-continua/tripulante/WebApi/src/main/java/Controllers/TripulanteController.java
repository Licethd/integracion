package Controllers;

import Dto.Tripulante.TripulanteDto;
import Model.Tripulante.*;
import UsesCases.Command.Tripulante.Crear.CrearTripulanteCommand;
import UsesCases.Command.Tripulante.Editar.EditarTripulanteCommand;
import UsesCases.Command.Tripulante.Eliminar.EliminarTripulanteCommand;
import UsesCases.Queries.Tripulante.GetAll.GetAllTripulanteQuery;
import UsesCases.Queries.Tripulante.GetByKey.GetTripulanteByKeyQuery;
import fourteam.http.Exception.HttpException;
import fourteam.http.annotation.*;
import fourteam.mediator.Mediator;
import fourteam.mediator.Response;
import java.util.List;

@RestController
@RequestMapping("/tripulante")
public class TripulanteController {

	private Mediator _mediator;

	public TripulanteController(Mediator mediator) {
		this._mediator = mediator;
	}

	@GetMapping("/")
	public Response<List<Tripulante>> getAll() throws HttpException {
		return _mediator.send(new GetAllTripulanteQuery());
	}

	@GetMapping("/{key}")
	public Response<TripulanteDto> getByKey(
		@PathVariable GetTripulanteByKeyQuery request
	) throws HttpException {
		return _mediator.send(request);
	}

	@PostMapping("/registro")
	public Response<Tripulante> register(
		@RequestBody CrearTripulanteCommand tripulante
	) throws HttpException {
		return _mediator.send(tripulante);
	}

	@PutMapping("/{key}")
	public Response<Tripulante> edit(
		@RequestBody TripulanteDto tripulante,
		@PathVariable EditarTripulanteCommand request
	) throws HttpException {
		request.tripulanteDto.Nombre = tripulante.getNombre();
		request.tripulanteDto.Apellido = tripulante.getApellido();
		request.tripulanteDto.EmailAddress = tripulante.getEmailAddress();
		request.tripulanteDto.Cargo = tripulante.getCargo();
		return _mediator.send(request);
	}

	@DeleteMapping("/{key}")
	public Response<Tripulante> delete(
		@PathVariable EliminarTripulanteCommand request
	) throws HttpException {
		return _mediator.send(request);
	}
}
