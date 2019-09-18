package api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.Dia;
import model.Weather;

public class Manejador {
	private Weather weather;

	public Manejador(String urlTXT) {
		weather = new Weather();
		JSONObject json;
		JSONArray jsa;
		try {
			json =  new JSONObject(IOUtils.toString(new URL(urlTXT), Charset.forName("UTF-8")));
			JSONObject jsoncity = (JSONObject)json.get("city");
			weather.setCity(jsoncity.getString("name"));
			jsa = (JSONArray) json.get("list");
			ArrayList<Dia> dias = new ArrayList<Dia>();
			Dia dia;
			for (int i=0;i<jsa.length();i++){
				json = (JSONObject)jsa.get(i);
				dia = new Dia();
				// saca mete chicha
				dia.setFecha(json.getString("dt"));
				JSONObject jsontemp = (JSONObject)json.get("temp");
				dia.setMax(jsontemp.getDouble("max"));
				dia.setMin(jsontemp.getDouble("min"));
				JSONObject jsonweather = (JSONObject)((JSONArray)json.get("weather")).get(0);
				dia.setPronostico(jsonweather.getString("description"));
				dia.setIco(jsonweather.getString("icon"));
				dias.add(dia);
			}
			weather.setDias(dias);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Weather getWeather() {
		return weather;
	}
}
