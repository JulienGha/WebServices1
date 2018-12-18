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
        List<String> lang = new ArrayList<String>();
        lang.add("FR");
		
		Cinema c1 = createCinema(new Cinema("Le Grand rex", new Address(1,"Boulevard Poissonnière","Paris","75002",1), 1));
 		Cinema c2 = createCinema(new Cinema("UGC Ciné Cité Les Halles", new Address(7,"place de la rodonte forum de halles","Paris","75001",2), 2));
		Cinema c3 = createCinema(new Cinema("UGC Ciné Cité Bercy", new Address(2,"Cour Saint-Emilion","Paris","75012",3), 3));
		Cinema c4 = createCinema(new Cinema("UGC Lyon Bastille", new Address(12,"Brue de Lyon","Paris","75012",4), 4));
		Cinema c5 = createCinema(new Cinema("UGC Montparnasse", new Address(83,"Boulevard du Montparnasse","Paris","75006",5), 5));
		Cinema c6 = createCinema(new Cinema("UGC Rotonde", new Address(103,"Boulevard du Montparnasse","Paris","75006",6), 6));
		Cinema c7 = createCinema(new Cinema("UGC Danton", new Address(99,"Boulevard Saint-Germain","Paris","75006",7), 7));
        
		List<String> ActeurAquaman = new ArrayList<String>();
		ActeurAquaman.add("Jason Momoa");
		ActeurAquaman.add("Amber Heard");
		ActeurAquaman.add("Willem Dafoe");
		ActeurAquaman.add("Dolph Lundgren");
		ActeurAquaman.add("Patrick Wilson");
		ActeurAquaman.add("Nicole Kidman");
		
		Film film1 = createMovie(new Film("Aquaman",142,lang,"James Wan",ActeurAquaman,0,1));

		addSeance(new Seance(1,film1,17,12,2018,21,1),c1);		
		addSeance(new Seance(2,film1,19,12,2018,10,1),c1);
		addSeance(new Seance(2,film1,19,12,2018,13,1),c1);
		addSeance(new Seance(2,film1,19,12,2018,16,1),c1);
		addSeance(new Seance(2,film1,19,12,2018,19,1),c1);
		addSeance(new Seance(2,film1,19,12,2018,22,1),c1);
		addSeance(new Seance(2,film1,19,12,2018,10,1),c1);		
		addSeance(new Seance(2,film1,20,12,2018,10,1),c1);
		addSeance(new Seance(2,film1,19,12,2018,10,1),c1);
		

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

	@Override
	public Seance postSeance(Seance s) {
		
		int cinema_id = s.get_idCinema();
		
		s.set_movie(_film.get(s.get_movie().get_id()));

		_cinema.get(cinema_id).get_seance().add(s);
		
		
		return s;
	}

	@Override
	public Seance SelectSeanceById(int id) {
	
		for(Cinema c:_cinema.values())
		{
			for(Seance s:c.get_seance())
			{
				if(s.get_id() == id)
					return s;
			}
		}
		
		return null;
	}
}
