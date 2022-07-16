package Factories;

import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import Model.Tripulante.Cargo;
import Model.Tripulante.Tripulante;
import fourteam.http.Exception.HttpException;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.any;

public class TripulanteFactory_Test {

    @Before
    public void setup() {
       
    }

    @Test
    public void HandleTripulanteFactory_Ok() throws HttpException {
        //creando tripulante
        UUID keyTest = UUID.randomUUID();
        String nombreTest = "Jose";
        String apellidoTest = "Perez";
        String emailAddressTest = "jose@gmail.com";
        Cargo cargoTest = new Cargo( 2500.0, "asistente");
        Tripulante tripulanteTest = new Tripulante(nombreTest, apellidoTest, emailAddressTest, cargoTest);
      
        TripulanteFactory factoryTest = new TripulanteFactory();
        Tripulante tripulanteDtoTest2 = factoryTest.Create(anyString(),anyString(),anyString(), any(Cargo.class));


    }
}
