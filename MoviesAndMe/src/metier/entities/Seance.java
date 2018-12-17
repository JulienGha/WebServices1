package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Seance implements Serializable{
	
	private int _id;
	private Film _movie;
	private int _day;
	private int _month;
	private int _year;
	private int _hour;
	private int _idCinema;
	
	public Seance() {
		super();
	}
	public Seance(int _id, Film _movie, int _day, int _month, int _year, int _hour, int _idCinema) {
		super();
		this._id = _id;
		this._movie = _movie;
		this._day = _day;
		this._month = _month;
		this._year = _year;
		this._hour = _hour;
		this._idCinema = _idCinema;
	}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public Film get_movie() {
		return _movie;
	}
	public void set_movie(Film _movie) {
		this._movie = _movie;
	}
	public int get_day() {
		return _day;
	}
	public void set_day(int _day) {
		this._day = _day;
	}
	public int get_month() {
		return _month;
	}
	public void set_month(int _month) {
		this._month = _month;
	}
	public int get_year() {
		return _year;
	}
	public void set_year(int _year) {
		this._year = _year;
	}
	public int get_hour() {
		return _hour;
	}
	public void set_hour(int _hour) {
		this._hour = _hour;
	}
	public int get_idCinema() {
		return _idCinema;
	}
	public void set_idCinema(int _idCinema) {
		this._idCinema = _idCinema;
	}
	
}
