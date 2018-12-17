package metier.entities;

import java.io.Serializable;
import java.util.List;

public class Film implements Serializable{
	private String _title;
	private int _duration;
	private List<String> _language;
	private String _director;
	private List<String> _actors;
	private int _ageMinimum;
	private int _id;
	
	
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Film(String _title, int _duration, List<String> _language, String _director, List<String> _actors, int _ageMinimum,int _id) {
		super();
		this._title = _title;
		this._duration = _duration;
		this._language = _language;
		this._director = _director;
		this._actors = _actors;
		this._ageMinimum = _ageMinimum;
		this._id = _id;
	}
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public int get_duration() {
		return _duration;
	}
	public void set_duration(int _duration) {
		this._duration = _duration;
	}
	public List<String> get_language() {
		return _language;
	}
	public void set_language(List<String> _language) {
		this._language = _language;
	}
	public String get_director() {
		return _director;
	}
	public void set_director(String _director) {
		this._director = _director;
	}
	public List<String> get_actors() {
		return _actors;
	}
	public void set_actors(List<String> _actors) {
		this._actors = _actors;
	}
	public int get_ageMinimum() {
		return _ageMinimum;
	}
	public void set_ageMinimum(int _ageMinimum) {
		this._ageMinimum = _ageMinimum;
	}
}
