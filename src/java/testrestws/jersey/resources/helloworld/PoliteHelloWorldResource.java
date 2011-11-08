package testrestws.jersey.resources.helloworld;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/PoliteHelloWorld")
public class PoliteHelloWorldResource {
	
	@GET 
	@Produces("text/plain")
	public String sayPoliteHello(@DefaultValue("?") @QueryParam("name") String name) {
		return "Hello World "+name;
	}

}
