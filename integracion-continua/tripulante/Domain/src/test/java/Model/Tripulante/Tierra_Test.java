package Model.Tripulante;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fourteam.http.Exception.HttpException;

import static org.mockito.ArgumentMatchers.anyString;


public class Tierra_Test {


    @Before
    public void setup() {

    }

    @Test
    public void HandleTierra_Ok() throws HttpException {

        UUID keyTest = UUID.randomUUID();
        String descripcioncTest = "piloto";

        Tierra TierrraTest2 = new Tierra(anyString());

        TierrraTest2.setDescripcion_c(descripcioncTest);

        Assert.assertEquals(descripcioncTest, TierrraTest2.getDescripcion_c());

    }
}
