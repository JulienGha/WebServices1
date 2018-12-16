package service;

import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import metier.*;
import metier.entities.*;


@Singleton
@Path("/catalog")
@Produces(MediaType.APPLICATION_JSON)
public class CatalogService {
	private Catalog metier;
	
	public CatalogService() {
		metier = new Catalog();
		metier.initializeCatalog();
	}
	
	@GET
	@Path("/films")
	public List<Film> AllFilm(){
		return metier.listFilm();
	}
	
	@GET
	@Path("/film/{id}")
	public Film FilmById(@PathParam (value="id")int id){
		return metier.FilmById(id);
	}
	
	@GET
	@Path("/films/title/keyword")
	public List<Film> ListFilmByKeyWord(@QueryParam(value="keyword")String keyword) {
		return metier.ListFilmByKeyWord(keyword);
	}
	
	@GET
	@Path("/films/keyword")
	public List<Film> ListFilmByKeyWords(@QueryParam(value="keyword")String keyword) {
		return metier.ListFilmByKeyWords(keyword);
	}
	
	
	
	@GET
	@Path("/films/city")
	public Set<Film> ListfilmByCity(@QueryParam(value="city")String city)
	{
		return metier.ListFilmByCity(city);
	}
	
	
	@GET
	@Path("/cinemas")
	public List<Cinema> AllCinema(){
		return metier.listCinema();
	}
	
	@GET
	@Path("/cinema/{id}")
	public Cinema SelectCinemaById(@PathParam (value="id") int id){
		return metier.CinemaById(id);
	}
	
	@GET
	@Path("/cinemas/city")
	public List<Cinema> ListCinemaByCity(@QueryParam(value="city")String city)
	{
		return metier.ListCinemaByCity(city);
	}
	
	
	
	
	/* post */
	
	@POST
	@Path("/film")
	public Film newFilm(Film f)
	{
		return metier.addFilm(f);
	}
	
	
	@POST
	@Path("/seance")
	public Seance newSeance(Seance s, Cinema c)
	{
		return metier.addSeance(s, c);
	}
	
	
	
	
	
	
	
	
}
