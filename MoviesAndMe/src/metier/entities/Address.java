package metier.entities;

import java.io.Serializable;

public class Address implements Serializable{
	private int _number;
	private String _streetName;
	private String _city;
	private String _zipCode;
	private int _id;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int _number, String _streetName, String _city, String _zipCode,int _id) {
		super();
		this._number = _number;
		this._streetName = _streetName;
		this._city = _city;
		this._zipCode = _zipCode;
		this._id = _id;
	}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int get_number() {
		return _number;
	}
	public void set_number(int _number) {
		this._number = _number;
	}
	public String get_streetName() {
		return _streetName;
	}
	public void set_streetName(String _streetName) {
		this._streetName = _streetName;
	}
	public String get_city() {
		return _city;
	}
	public void set_city(String _city) {
		this._city = _city;
	}
	public String get_zipCode() {
		return _zipCode;
	}
	public void set_zipCode(String _zipCode) {
		this._zipCode = _zipCode;
	}
}
