package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Seance implements Serializable{
	private Film _movie;
	private int _day;
	private int _month;
	private int _year;
	private int _id;
	
	public Seance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seance(Film _movie, int _day, int _month, int _year, int _hour, int _id) {
		super();
		this._movie = _movie;
		this._day = _day;
		this._month = _month;
		this._year = _year;
		this._hour = _hour;
		this._id = _id;
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
	private int _hour;
}
