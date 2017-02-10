package Rectangulo;
import Ejercicios.Complejo;


public class testRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r=new Rectangulo(new Complejo(0,0),new Complejo(0,1), new Complejo(1,0), new Complejo(1,1));
		System.out.println(r.toString());
		System.out.println("Area: "+r.area());
		r.desplaza(new Complejo (1,2));
		System.out.println("Desplazamiento: \n"+r.toString());
	}

}
