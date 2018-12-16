package metier;

import java.util.List;

import metier.entities.*;

public interface ICatalog {
	public Film createMovie(Film f);
	public Cinema createCinema(Cinema c);
	public void addSeance(Seance s, Cinema c);
	public List<Film> listFilm();
	public Film FilmById(int id);
	public List<Film> ListFilmByKeyWord(String keyword);
	public List<Cinema> listCinema();
	public Cinema CinemaById(int id);
	
}
