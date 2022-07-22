package UsesCases.Queries.Tripulante.GetByKey;

import Dto.Tripulante.TripulanteDto;
import Model.Tripulante.Tripulante;
import Repositories.ITripulanteRepository;
import fourteam.http.Exception.HttpException;
import fourteam.http.HttpStatus;
import fourteam.mediator.RequestHandler;

public class GetTripulanteByKeyHandler
	implements RequestHandler<GetTripulanteByKeyQuery, TripulanteDto> {

	private ITripulanteRepository _tripulanteRepository;

	public GetTripulanteByKeyHandler(
		ITripulanteRepository tripulanteRepository
	) {
		this._tripulanteRepository = tripulanteRepository;
	}

	@Override
	public TripulanteDto handle(GetTripulanteByKeyQuery request)
		throws HttpException {
		Tripulante tripulante = _tripulanteRepository.FindByKey(request.key);
		if (tripulante == null) {
			throw new HttpException(
				HttpStatus.BAD_REQUEST,
				"Tripulante no encontrada"
			);
		}
		TripulanteDto tripulanteDto = new TripulanteDto();
		tripulanteDto.Key = tripulante.key;
		tripulanteDto.Nombre = tripulante.getNombre();
		tripulanteDto.Apellido = tripulante.getApellido();
		tripulanteDto.Cargo = tripulante.getCargo();

		return tripulanteDto;
	}
}
