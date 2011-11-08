package testrestws.jersey.resources.helloworld;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import testrestws.jersey.model.ro.Person;

@Path("/Person")
public class PersonResource {
	
	@GET 
	@Produces(MediaType.APPLICATION_XML)
	public Person getPersonByName(@DefaultValue("?") @QueryParam("name") String name) {
		Person person = new Person();
		if ( "PAOLO".equalsIgnoreCase(name) ){
			person.setName(name);
			person.setSurname("Ruggiano");
			person.setId(new Long(1));
			person.setCf("aaaa");
		}else{
			person.setName(name);
			person.setSurname("?");
			person.setId(null);
			person.setCf("?");
		}
		return person;
	}

}
