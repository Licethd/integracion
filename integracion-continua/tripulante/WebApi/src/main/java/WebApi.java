import Controllers.TripulanteController;
import fourteam.http.Rest;

public class WebApi {

	public static void AddControllers() {
						Rest.addController(TripulanteController.class);

		Rest.start(8080);
				Rest.createSwagger();
	}

	public static void AddInfraestructure()
	{
		// TODO Auto-generated method stub

	}
}
