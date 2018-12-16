package metier.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cinema implements Serializable{
	private String _name;
	private Address _location;
	private List<Seance> _sessions;
	private int _id;
	
	public Cinema() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cinema(String _name, Address _location, int _id) {
		super();
		this._name = _name;
		this._location = _location;
		this._sessions = new ArrayList<Seance>();
		this._id = _id;
	}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public List<Seance> get_sessions() {
		return _sessions;
	}
	public void set_sessions(List<Seance> _sessions) {
		this._sessions = _sessions;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public Address get_location() {
		return _location;
	}
	public void set_location(Address _location) {
		this._location = _location;
	}
	public String get_city() {
		return _city;
	}
	public void set_city(String _city) {
		this._city = _city;
	}
	private String _city;
}
