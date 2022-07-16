package UsesCases.Command.Tripulante.Editar;

import Factories.ITripulanteFactory;
import Model.Tripulante.Tripulante;
import Repositories.ITripulanteRepository;
import Repositories.IUnitOfWork;
import fourteam.http.HttpStatus;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.RequestHandler;

public class EditarTripulanteHandler implements RequestHandler<EditarTripulanteCommand, Tripulante> {

    private ITripulanteFactory _tripulanteFactory;
    private ITripulanteRepository _tripulanteRepository;
    private IUnitOfWork _unitOfWork;

    public EditarTripulanteHandler(ITripulanteFactory tripulanteFactory, ITripulanteRepository tripulanteRepository,
            IUnitOfWork _unitOfWork) {
        this._tripulanteFactory = tripulanteFactory;
        this._tripulanteRepository = tripulanteRepository;
        this._unitOfWork = _unitOfWork;
    }

    @Override
    public Tripulante handle(EditarTripulanteCommand request) throws HttpException {

        // Tripulante tripulante = _tripulanteFactory.Create(request.tripulanteDto.getNombre(),
        //         request.tripulanteDto.getApellido(), request.tripulanteDto.getEmailAddress(),
        //         request.tripulanteDto.getCargo());
        Tripulante tripulante = _tripulanteRepository.FindByKey(request.tripulanteDto.Key);
        if(tripulante == null){
            throw new HttpException(HttpStatus.BAD_REQUEST, "Tripulante no encontrado");
        }
        tripulante.setNombre(request.tripulanteDto.Nombre);
        tripulante.setApellido(request.tripulanteDto.Apellido);
        tripulante.setEmailAddress(request.tripulanteDto.EmailAddress);
        tripulante.setCargo(request.tripulanteDto.Cargo);
        _tripulanteRepository.Update(tripulante);
        // _unitOfWork.commit();
        return tripulante;
    }

}
