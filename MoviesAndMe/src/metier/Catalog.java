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
		
		List<String> Acteur50 = new ArrayList<String>();
		Acteur50.add("Jamie Dornan");
		Acteur50.add("Dakota Johnson");
		Acteur50.add("Eloise Mumford");
		Acteur50.add("Luke Grimes");
		Acteur50.add("Rita Ora");
		
		Film film2 = createMovie(new Film("Cinquante nuances de Grey",125,lang,"Sam Taylor-Wood",Acteur50,12,2));
		
		List<String> ActeurListe = new ArrayList<String>();
		ActeurListe.add("Liam Neeson");
		ActeurListe.add("Ben Kingsley");
		ActeurListe.add("Ralph Fiennes");
		ActeurListe.add("Jonathan Sagall");
		ActeurListe.add("Caroline Goodall");
		
		Film film3 = createMovie(new Film("La Liste de Schindler",195,lang,"Steven Spielberg",ActeurListe,0,3));
		
		List<String> ActeurMM = new ArrayList<String>();
		ActeurMM.add("Liam Neeson");
		ActeurMM.add("Nicolas Bedos");
		ActeurMM.add("Denis Podalydès");
		ActeurMM.add("Antoine Gouy");
		ActeurMM.add("Pierre Arditi");
		
		Film film4 = createMovie(new Film("Monsieur et Madame Adelman",120,lang,"Nicolas Bedos",ActeurMM,0,4));
		
		List<String> ActeurOSS = new ArrayList<String>();
		ActeurOSS.add("Jean Dujardin");
		ActeurOSS.add("Bérénice Bejo");
		ActeurOSS.add("Aure Atika");
		ActeurOSS.add("Richard Sammel");
		ActeurOSS.add("Philippe Lefebvre");
		
		Film film5 = createMovie(new Film("OSS 117 : Le Caire, nid d'espions",99,lang,"Michel Hazanavicius",ActeurOSS,0,5));
		
		
		List<String> ActeurTrans = new ArrayList<String>();
		ActeurTrans.add("Jason Statham");
		ActeurTrans.add("Shu Qi");
		ActeurTrans.add("François Berléand");
		ActeurTrans.add("Matt Schulze");
		ActeurTrans.add("Ric Young");
		
		Film film6 = createMovie(new Film("Le Transporteur",142,lang,"Luc Besson",ActeurTrans,0,6));
		
		List<String> ActeurEWS = new ArrayList<String>();
		ActeurAquaman.add("Tom Cruise");
		ActeurAquaman.add("Nicole Kidman");
		ActeurAquaman.add("Madison Eginton");
		ActeurAquaman.add("Sydney Pollack");
		ActeurAquaman.add("Marie Richardson");
		
		Film film7 = createMovie(new Film("Eyes Wide Shut",159,lang,"Stanley Kubrick",ActeurEWS,0,7));
		


		addSeance(new Seance(1,film1,17,12,2018,21,1),c1);
		addSeance(new Seance(2,film6,19,12,2018,10,1),c1);
		addSeance(new Seance(3,film1,19,12,2018,13,1),c1);
		addSeance(new Seance(4,film5,19,12,2018,16,1),c1);
		addSeance(new Seance(5,film7,19,12,2018,19,1),c1);
		addSeance(new Seance(6,film2,19,12,2018,22,1),c1);
		addSeance(new Seance(7,film4,19,12,2018,10,1),c1);
		addSeance(new Seance(8,film3,20,12,2018,10,1),c1);
		addSeance(new Seance(9,film2,19,12,2018,10,1),c1);
		
		addSeance(new Seance(11,film1,17,12,2018,21,1),c2);
		addSeance(new Seance(12,film2,19,12,2018,10,1),c2);
		addSeance(new Seance(13,film3,19,12,2018,13,1),c2);
		addSeance(new Seance(14,film4,19,12,2018,16,1),c2);
		addSeance(new Seance(15,film5,19,12,2018,19,1),c2);
		addSeance(new Seance(16,film6,19,12,2018,22,1),c2);
		addSeance(new Seance(17,film7,19,12,2018,10,1),c2);
		addSeance(new Seance(18,film2,20,12,2018,10,1),c2);
		addSeance(new Seance(19,film6,19,12,2018,10,1),c2);
		
		addSeance(new Seance(21,film7,17,12,2018,21,1),c3);
		addSeance(new Seance(22,film6,19,12,2018,10,1),c3);
		addSeance(new Seance(23,film5,19,12,2018,13,1),c3);
		addSeance(new Seance(24,film4,19,12,2018,16,1),c3);
		addSeance(new Seance(25,film3,19,12,2018,19,1),c3);
		addSeance(new Seance(26,film2,19,12,2018,22,1),c3);
		addSeance(new Seance(27,film1,19,12,2018,10,1),c3);
		addSeance(new Seance(28,film4,20,12,2018,10,1),c3);
		addSeance(new Seance(29,film5,19,12,2018,10,1),c3);
		
		addSeance(new Seance(31,film1,17,12,2018,21,1),c4);
		addSeance(new Seance(32,film3,19,12,2018,10,1),c4);
		addSeance(new Seance(33,film5,19,12,2018,13,1),c4);
		addSeance(new Seance(34,film7,19,12,2018,16,1),c4);
		addSeance(new Seance(35,film2,19,12,2018,19,1),c4);
		addSeance(new Seance(36,film4,19,12,2018,22,1),c4);
		addSeance(new Seance(37,film6,19,12,2018,10,1),c4);
		addSeance(new Seance(38,film3,20,12,2018,10,1),c4);
		addSeance(new Seance(39,film7,19,12,2018,10,1),c4);
		
		addSeance(new Seance(41,film2,17,12,2018,21,1),c5);
		addSeance(new Seance(42,film4,19,12,2018,10,1),c5);
		addSeance(new Seance(43,film6,19,12,2018,13,1),c5);
		addSeance(new Seance(44,film7,19,12,2018,16,1),c5);
		addSeance(new Seance(45,film5,19,12,2018,19,1),c5);
		addSeance(new Seance(46,film3,19,12,2018,22,1),c5);
		addSeance(new Seance(47,film1,19,12,2018,10,1),c5);
		addSeance(new Seance(48,film6,20,12,2018,10,1),c5);
		addSeance(new Seance(49,film1,19,12,2018,10,1),c5);
		
		addSeance(new Seance(51,film7,17,12,2018,21,1),c6);
		addSeance(new Seance(52,film1,19,12,2018,10,1),c6);
		addSeance(new Seance(53,film6,19,12,2018,13,1),c6);
		addSeance(new Seance(54,film2,19,12,2018,16,1),c6);
		addSeance(new Seance(55,film5,19,12,2018,19,1),c6);
		addSeance(new Seance(56,film3,19,12,2018,22,1),c6);
		addSeance(new Seance(57,film4,19,12,2018,10,1),c6);
		addSeance(new Seance(58,film7,20,12,2018,10,1),c6);
		addSeance(new Seance(59,film6,19,12,2018,10,1),c6);
		
		addSeance(new Seance(61,film1,17,12,2018,21,1),c7);
		addSeance(new Seance(62,film2,19,12,2018,10,1),c7);
		addSeance(new Seance(63,film3,19,12,2018,13,1),c7);
		addSeance(new Seance(64,film5,19,12,2018,16,1),c7);
		addSeance(new Seance(65,film7,19,12,2018,19,1),c7);
		addSeance(new Seance(66,film3,19,12,2018,22,1),c7);
		addSeance(new Seance(67,film6,19,12,2018,10,1),c7);
		addSeance(new Seance(68,film5,20,12,2018,10,1),c7);
		addSeance(new Seance(69,film3,19,12,2018,10,1),c7);
		
		
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
