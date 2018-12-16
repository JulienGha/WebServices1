package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import metier.entities.*;

public class Catalog implements ICatalog{

	private Map <Integer,Cinema> _theaters = new HashMap<Integer,Cinema>();
	private Map <Integer,Film> _movies = new HashMap<Integer,Film>();
	private Map <Integer,Address> _adresses = new HashMap<Integer,Address>();
	@Override
	public Film createMovie(Film f) {
		_movies.put(f.get_id(), f);
		return f;
	}

	@Override
	public Cinema createCinema(Cinema c) {
		_theaters.put(c.get_id(), c);
		return c;
	}

	@Override
	public void addSeance(Seance s, Cinema c) {
		_theaters.get(c.get_id()).get_sessions().add(s);
	}
	
	public void initializeCatalog() {
		Cinema c1 =createCinema(new Cinema("Le Napoléon", new Address(1,"Rue du test","Paris","75001",1), 1));
		Cinema c2 =createCinema(new Cinema("Le Louis XIV", new Address(1,"Rue de la monarchie","Paris","75001",2), 2));
		List<String> l1 = new ArrayList<String>();
        l1.add("John Doe");
        List<String> l2 = new ArrayList<String>();
        l2.add("FR");
		Film film1 = createMovie(new Film("star wars 1",60,l2,"Director Test",l1,18,1));
		Film film2 = createMovie(new Film("star wars 2",60,l2,"Director Test",l1,18,2));
		addSeance(new Seance(film1,1,1,2019,15,1),c1);
	}

	@Override
	public List<Film> listFilm() {
		return new ArrayList<Film>(_movies.values());
	} 
	
	@Override
	public Film FilmById(int id) {
		return _movies.get(id);
	}

	@Override
	public List<Cinema> listCinema() {
		return new ArrayList<Cinema>(_theaters.values());
	}

	@Override
	public Cinema CinemaById(int id) {
		return _theaters.get(id);
	}

	@Override
	public List<Film> ListFilmByKeyWord(String keyword) {
		List<Film> film = new ArrayList<Film>();
		for(Film f:_movies.values())
		{
			if(f.get_title().contains(keyword))
				film.add(f);
		}
		return film;
	}


	
	

}
