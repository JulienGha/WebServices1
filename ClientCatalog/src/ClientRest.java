
import java.io.IOException;
import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import metier.entities.Film;


public class ClientRest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Client client=Client.create(new DefaultClientConfig());
		URI uri = UriBuilder.fromUri("http://localhost:8080/MoviesAndMe/").build();
		ClientResponse allFilms = client.resource(uri)
				.path("catalog")
				.path("films").get(ClientResponse.class);
		String repHttp = allFilms.getEntity(String.class);
		
		System.out.println(repHttp); // json string
		
		
		// we "remap" the object from the server on the client side
		ObjectMapper mapper = new ObjectMapper();
		Film[] films = mapper.readValue(repHttp, Film[].class);
		for(Film f:films)
		{
			System.out.println(f.get_title());
		}
		
		

	}

}
