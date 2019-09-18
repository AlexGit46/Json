package model;
import java.util.ArrayList;

public class Weather {
	private String city;
	private ArrayList<Dia> dias;
	public Weather(String city, ArrayList<Dia> dias) {
		super();
		this.city = city;
		this.dias = dias;
	}
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public ArrayList<Dia> getDias() {
		return dias;
	}
	public void setDias(ArrayList<Dia> dias) {
		this.dias = dias;
	}
	@Override
	public String toString() {
		return "Weather [city=" + city + ", dias=" + dias + "]";
	}
}
