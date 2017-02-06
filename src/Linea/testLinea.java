package Linea;
import Ejercicios.Complejo;

public class testLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linea l=new Linea(new Complejo (1,6), new Complejo(2,3));
		System.out.println(l.toString());
		l.mueveDerecha(3);
		System.out.println("Derecha mueve 3: "+l.toString());
		l.mueveIzquierda(3);
		System.out.println("Izquierda mueve 3: "+l.toString());
		l.mueveArriba(3);
		System.out.println("Arriba mueve 3: "+l.toString());
		l.mueveAbajo(3);
		System.out.println("Abajo mueve 3: "+l.toString());
		
		

	}

}
