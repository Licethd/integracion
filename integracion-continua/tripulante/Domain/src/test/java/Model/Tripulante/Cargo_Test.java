package Model.Tripulante;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;

import fourteam.http.Exception.HttpException;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Cargo_Test {

	@Before
	public void setup() {}

	@Test
	public void HandleCargo_Ok() throws HttpException {
		// creando tripulante
		UUID keyTest = UUID.randomUUID();
		Double sueldoTest = 3500.99;
		String descripcionTest = "Perez";

		Cargo CargoTest = new Cargo();
		Cargo CargoTest2 = new Cargo(anyDouble(), anyString());

		// tripulanteDtoTest.setKey(keyTest);
		CargoTest.setSueldo(sueldoTest);
		CargoTest.setDescripcion(descripcionTest);

		Assert.assertEquals(sueldoTest, CargoTest.getSueldo());
		Assert.assertEquals(descripcionTest, CargoTest.getDescripcion());
	}
}
