package view;
import api.Manejador;
import model.Dia;
import model.Weather;

public class Prueba {

	public static void main(String[] args) {
		Manejador manejador = new Manejador("http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7&lang=es&appid=15646a06818f61f7b8d7823ca833e1ce&q=45280,es");
		Weather weather = manejador.getWeather();
		System.out.println(weather.getCity());
		for (Dia dia:weather.getDias()){
			System.out.println(dia);
		}
	}
}
