package UseCases.Command;

import java.util.UUID;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import UsesCases.Queries.Tripulante.GetAll.GetAllTripulanteHandler;
import UsesCases.Queries.Tripulante.GetAll.GetAllTripulanteQuery;
import Factories.ITripulanteFactory;
import Model.Tripulante.Cargo;
import Model.Tripulante.Tripulante;
import Repositories.ITripulanteRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;

public class GetAllTripulanteHandler_Test {

    ITripulanteFactory tripulanteFactory = Mockito.mock(ITripulanteFactory.class);
    ITripulanteRepository tripulanteRepository = Mockito.mock(ITripulanteRepository.class);
    IUnitOfWork unitOfWork = Mockito.mock(IUnitOfWork.class);
   

    @Before
    public void setup() {
       
    }

    @Test
    public void HandleGetAll_Ok() throws HttpException {

        // creando tripulante
        UUID keyTest = UUID.randomUUID();
        String nombreTest = "Jose";
        String apellidoTest = "Perez";
        String emailAddressTest = "jose@gmail.com";
        Cargo cargoTest = new Cargo( 2500.0, "asistente");


        GetAllTripulanteQuery query = new GetAllTripulanteQuery();
        
        GetAllTripulanteHandler handler = new GetAllTripulanteHandler(tripulanteRepository);
        
        List<Tripulante> listaTripulantes = handler.handle(query);
    }
}
