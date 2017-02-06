package Rectangulo;
import miLibreria.Entrada;
import Ejercicios.Complejo;


public class testRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r=new Rectangulo(new Complejo(0,0),new Complejo(0,5), new Complejo(8,0), new Complejo(8,5));
		System.out.println(r.toString());
		System.out.println("Area: "+r.area());
		r.desplaza(new Complejo (1,1));
		System.out.println("Desplazamiento: \n"+r.toString());
	}

}
