package UsesCases.Queries.Tripulante.GetAll;

import Model.Tripulante.Tripulante;
import Repositories.ITripulanteRepository;
import fourteam.mediator.RequestHandler;
import java.util.List;

public class GetAllTripulanteHandler
	implements RequestHandler<GetAllTripulanteQuery, List<Tripulante>> {

	private ITripulanteRepository _tripulanteRepository;

	public GetAllTripulanteHandler(ITripulanteRepository tripulanteRepository) {
		this._tripulanteRepository = tripulanteRepository;
	}

	@Override
	public List<Tripulante> handle(GetAllTripulanteQuery request) {
		return _tripulanteRepository.GetAll();
	}
}
