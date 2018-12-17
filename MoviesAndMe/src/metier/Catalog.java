package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import metier.entities.*;

public class Catalog implements ICatalog{

	private Map <Integer,Cinema> _cinema = new HashMap<Integer,Cinema>();
	private Map <Integer,Film> _film = new HashMap<Integer,Film>();
	private Map <Integer,Address> _address = new HashMap<Integer,Address>();
	
	@Override
	public Film createMovie(Film f) {
		_film.put(f.get_id(), f);
		return f;
	}

	@Override
	public Cinema createCinema(Cinema c) {
		_cinema.put(c.get_id(), c);
		return c;
	}


	
	public void initializeCatalog() {
		Cinema c1 =createCinema(new Cinema("Le Napoléon", new Address(1,"Rue du test","Paris","75001",1), 1));
		Cinema c2 =createCinema(new Cinema("Le Louis XIV", new Address(1,"Rue de la monarchie","Brest","29200",2), 2));
		Cinema c3 =createCinema(new Cinema("Les baladins", new Address(1,"Rue","Paris","75001",3), 3));
		List<String> l1 = new ArrayList<String>();
        l1.add("John Doe");
        List<String> l2 = new ArrayList<String>();
        l2.add("FR");
		Film film1 = createMovie(new Film("star wars 1",60,l2,"Director Test",l1,18,1));
		Film film2 = createMovie(new Film("star wars 2",60,l2,"Director Test",l1,18,2));
		Film film3 = createMovie(new Film("star wars 3",60,l2,"Director Test",l1,18,3));
		Film film4 = createMovie(new Film("star wars 4",60,l2,"Director Test",l1,18,4));
		addSeance(new Seance(film1,1,1,2019,15,1),c1);
		addSeance(new Seance(film1,1,1,2019,15,2),c2);
		addSeance(new Seance(film1,1,1,2019,15,3),c1);
		addSeance(new Seance(film2,1,1,2019,15,4),c1);
		addSeance(new Seance(film3,1,1,2019,15,5),c2);
		addSeance(new Seance(film4,1,1,2019,15,6),c1);
	}

	
	/* Film */
	@Override
	public List<Film> listFilm() {
		return new ArrayList<Film>(_film.values());
	} 
	
	@Override
	public Film FilmById(int id) {
		return _film.get(id);
	}



	@Override
	public List<Film> ListFilmByKeyWord(String keyword) {
		List<Film> film = new ArrayList<Film>();
		for(Film f:_film.values())
		{
			if(f.get_title().contains(keyword))
				film.add(f);
		}
		return film;
	}
	public List<Film> ListFilmByKeyWords (String keyword) {

		List<Film> result = new ArrayList<Film>();
		String research = "";

		for(Film movie:_film.values())  {
			research += movie.get_title();
			research += movie.get_actors();
			//continuer pour tous les attributs
			if (research.contains(keyword))
				result.add(movie);
			research = "";
		}
		return result;
	}

	@Override
	public Film addFilm(Film f) {
		_film.put(f.get_id(), f);
		return f;
	}
	
	public Set<Film> ListFilmByCity(String city){
		Set<Film> film = new HashSet<Film>();
		List<Cinema> cinema = ListCinemaByCity(city);
		for(Cinema c:cinema)
		{
			for(Seance s:c.get_seance())
			{
				System.out.println(film.add(s.get_movie()));
				System.out.println(s.get_movie().get_title());
			}
		}
		return film;
	}
	
	@Override
	public Seance addSeance(Seance s, Cinema c) {
		_cinema.get(c.get_id()).get_seance().add(s);
		return s;
	}

	/* Cinema */
	
	@Override
	public List<Cinema> listCinema() {
		return new ArrayList<Cinema>(_cinema.values());
	}

	@Override
	public Cinema CinemaById(int id) {
		return _cinema.get(id);
	}
	
	@Override
	public List<Cinema> ListCinemaByCity(String city) {
		List<Cinema> cinema = new ArrayList<Cinema>();
		for(Cinema c:_cinema.values())
		{
			if(c.get_city().equals(city))
				cinema.add(c);
		}
		return cinema;
	}

	@Override
	public Set<Seance> ListSeanceByCityFilm(String city, int id) {
		
		Set<Seance> seance = new HashSet<Seance>();
		List<Cinema> cinema = ListCinemaByCity(city);
		
		for(Cinema c:cinema)
		{
			for(Seance s:c.get_seance())
			{
				if(s.get_movie().get_id() == id)
				{
					seance.add(s);
				}
			}
		}
		
		
		return seance;
	}

	@Override
	public Set<String> ListCity() {
		
		Set<String> city = new HashSet<String>();
		
		for(Cinema c:_cinema.values())
		{
			city.add(c.get_city());
		}
		return city;
	}
	

	



	
	

}
