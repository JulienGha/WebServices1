package metier;

import java.util.List;
import java.util.Set;

import javax.ws.rs.QueryParam;

import metier.entities.*;

public interface ICatalog {
	
	public Film createMovie(Film f);
	public Cinema createCinema(Cinema c);
	
	
	
	/* GET */
	public List<Film> listFilm();
	public Film FilmById(int id);
	public List<Film> ListFilmByKeyWord(String keyword);
	public Set<Film> ListFilmByCity(String city);
	
	
	public List<Cinema> listCinema();
	public Cinema CinemaById(int id);
	public List<Cinema> ListCinemaByCity(String city);
	
	/* POST */
	
	public Film addFilm(Film f);
	public Seance addSeance(Seance s, Cinema c);
	
	
}
