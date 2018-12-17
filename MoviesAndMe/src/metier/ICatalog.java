package metier;

import java.util.List;
import java.util.Set;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import metier.entities.*;

public interface ICatalog {
	
	public Film createMovie(Film f);
	public Cinema createCinema(Cinema c);
	
	
	
	/* GET */
	public List<Film> listFilm();
	public Film FilmById(int id);
	public List<Film> ListFilmByKeyWord(String keyword);
	public List<Film> ListFilmByKeyWords (String keyword);
	public Set<Film> ListFilmByCity(String city);
	
	public Cinema CinemaById(int id);
	public List<Cinema> listCinema();
	public List<Cinema> ListCinemaByCity(String city);
	
	public Set<Seance> ListSeanceByCityFilm(String city, int id);
	public Seance SelectSeanceById(int id);
	
	public Set<String> ListCity();
	/* POST */
	
	public Film addFilm(Film f);
	public Seance addSeance(Seance s, Cinema c);
	public Seance postSeance(Seance s);
	
	
}
