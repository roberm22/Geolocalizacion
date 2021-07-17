package es.upm.dit.prog.practica2;

public class Localizacion {
	private Coordenada c;
	private Lectura [] lecturas;
	/**
	 * @param c
	 * @param lecturas
	 */
	public Localizacion(Coordenada c, int lecturas) {
		super();
		this.c = c;
		this.lecturas = new Lectura [lecturas];
	}
	public Coordenada getC() {
		return c;
	}
	public void setC(Coordenada c) {
		this.c = c;
	}
	public void setLectura(Lectura l, int n){
		if ((n>=0)&&(n <= lecturas.length-1)){
			lecturas [n] = l;
		}
	}
	public Lectura getLectura (int n){
		if ((n>=0)&&(n <= lecturas.length-1)){
			return lecturas [n];
		}
		return null;
	}
	public void intercambia (int n1, int n2){
		if ( (n1>=0)&&(n1 <= lecturas.length-1) && (n2>=0)&&(n2 <= lecturas.length-1) ){
			Lectura t = lecturas [n1];
			Lectura o = lecturas [n2];
			lecturas [n2] = t;
			lecturas [n1] = o;
		}
	}
}
