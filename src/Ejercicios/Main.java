package Ejercicios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racional r1=new Racional(1,3);
		Racional r2=new Racional (1,2);
		Complejo c1=new Complejo(1,3);
		Complejo c2=new Complejo (1,2);
		System.out.println("Suma= "+r1.suma(r2).toString());
		System.out.println("Resta= "+r1.resta(r2).toString());
		System.out.println("Multiplicación= "+r1.multiplicacion(r2).toString());
		System.out.println("División= "+r1.division(r2).toString());
		
		System.out.println("COMPLEJOS_____________________");
		System.out.println("Suma= "+c1.suma(c2).toString());
		System.out.println("Resta= "+c1.resta(c2).toString());
		System.out.println("Multiplicación= "+c1.multiplicacion(c2).toString());
		System.out.println("División= "+c1.division(c2).toString());
	}

}
