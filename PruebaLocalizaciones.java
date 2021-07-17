package es.upm.dit.prog.practica2;

import java.util.Scanner;

public class PruebaLocalizaciones {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------");
		System.out.println("Pruebas de wifis");
		WiFi w1 = new WiFi ("WiFi1", Seguridad.ABIERTA);
		WiFi w2 = new WiFi ("WiFi2", Seguridad.WEP);
		WiFi w3 = new WiFi ("WiFi3", Seguridad.WPA2_EMPRESA);
		
		System.out.println("w1="+w1);
		System.out.println("w2="+w2);
		System.out.println("w3="+w3);

		System.out.println("En w1 funciona equals="+w1.equals(new WiFi ("WiFi1", Seguridad.ABIERTA)));
		System.out.println("En w2 funciona equals="+w2.equals(new WiFi ("WiFi2", Seguridad.WEP)));
		System.out.println("En w3 funciona equals="+w3.equals(new WiFi ("WiFi3", Seguridad.WPA2_EMPRESA)));
		
		
		System.out.println("-----------------------");
		System.out.println("Pruebas de lecturas");
		Lectura l1 = new Lectura (w1, -82.0);
		Lectura l2 = new Lectura (w2, -72.0);
		Lectura l3 = new Lectura (w3, -69.0);
		System.out.println("l1="+l1);
		System.out.println("l2="+l2);
		System.out.println("l3="+l3);	
		System.out.println("En l1 funciona equals="+l1.equals(new Lectura (w1, -82.0)));
		System.out.println("En l2 funciona equals="+l2.equals(new Lectura (w2, -72.0)));
		System.out.println("En l3 funciona equals="+l3.equals(new Lectura (w3, -69.0)));

		
		System.out.println("-----------------------");
		System.out.println("Pruebas de coordenadas");
		Coordenada c1 = new Coordenada (0,0);
		Coordenada c2 = new Coordenada (3,0);
		Coordenada c3 = new Coordenada (0,4);
		Coordenada c4 = new Coordenada (3,4);
		System.out.println ("c1="+c1);
		System.out.println ("c2="+c2);
		System.out.println ("c3="+c3);
		System.out.println ("c4="+c4);
		System.out.println("En c1 funciona equals="+c1.equals(new Coordenada (0,0)));
		System.out.println("En c2 funciona equals="+c2.equals(new Coordenada (3,0)));
		System.out.println("En c3 funciona equals="+c3.equals(new Coordenada (0,4)));
		System.out.println ("c1. distancia(c1)="+c1.distancia(c1));
		System.out.println ("c1.distancia(c2)="+c1.distancia(c2));
		System.out.println ("c1.distancia(c3)="+c1.distancia(c3));
		System.out.println ("c1.distancia(c4)="+c1.distancia(c4));
		System.out.println ("c2.distancia(c1)="+c2.distancia(c1));
		System.out.println ("c2.distancia(c3)="+c2.distancia(c3));
		


	
		
		System.out.println("-----------------------");
		System.out.println("Pruebas de localizacion");
		Localizacion loc = new Localizacion (new Coordenada (0,0), 8);
		System.out.println("loc="+loc);
			
		loc.setLectura(l1, 0);
		loc.setLectura(l2, 1);
		loc.setLectura(l3, 2);
		loc.setLectura(new Lectura (new WiFi("WiFi4", Seguridad.ABIERTA), -70.0), 3);
		
		System.out.println("add l1, l2, l3, l4=" +loc);
		
		System.out.println("loc.getLectura(0)="+loc.getLectura(0));
		System.out.println("loc.getLectura(1)="+loc.getLectura(1));
		System.out.println("loc.getLectura(2)="+loc.getLectura(2));
		System.out.println("loc.getLectura(3)="+loc.getLectura(3));
		System.out.println("loc.geLectura(4)="+loc.getLectura(4));
		
		loc.setLectura(new Lectura(new WiFi("WiFi5", Seguridad.ABIERTA), -60.0), 7);
		System.out.println("set l5, 7="+loc);
		
		loc.setLectura(new Lectura (new WiFi("WiFi6", Seguridad.ABIERTA), -70.0), 6);
		System.out.println("add l6="+loc);
		
		

		
		
	}

}
