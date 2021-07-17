package es.upm.dit.prog.practica2;

public class Coordenada {
	
	private double x;
	private double y;
	/**
	 * @param x
	 * @param y
	 */
	public Coordenada(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Coordenada [x=" + x + ", y=" + y + "]";
	}
	
	public double distancia (Coordenada c) {
		double d = Math.sqrt((x-c.x)*(x-c.x)+(y-c.y)*(y-c.y));
		return d;
		
	}
	

}
