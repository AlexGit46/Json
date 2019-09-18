package model;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Dia {
	private String fecha;
	private double max;
	private double min;
	private String pronostico;
	private String ico;
	public Dia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dia(String fecha, double max, double min, String pronostico, String ico) {
		super();
		this.fecha = fecha;
		this.max = max;
		this.min = min;
		this.pronostico = pronostico;
		this.ico = ico;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public String getPronostico() {
		return pronostico;
	}
	public void setPronostico(String pronostico) {
		this.pronostico = pronostico;
	}
	public String getIco() {
		return ico;
	}
	public void setIco(String ico) {
		this.ico = ico;
	}
	@Override
	public String toString() {
		return "Dia [fecha=" + timeSpamToFecha(Long.parseLong(fecha)) + ", max=" + max + ", min=" + min + ", pronostico=" + pronostico + ", ico=" + ico
				+ "]";
	}
	
    private String timeSpamToFecha(long ts) {
    		SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
        return (df.format(ts*1000));
    }

}
