package Ejercicios.miLibreria;
import java.util.Scanner;

public class Entrada {
	Scanner entrada = new Scanner (System.in);
	boolean loop;
	
	public int obtenerEntero(String msg){
		String teclado;
		int numero=0;
		while(loop){
			try {
				teclado = entrada.nextLine();
				numero = Integer.valueOf(teclado);	
				loop=false;
			} catch (java.lang.NumberFormatException e) { 
				System.out.println("Vuelva a introducir un numero entero"); 
			}
		}
		return numero;
	}
	
	public float obtenerFloat(String msg){
		String teclado;
		float numero=0;
		while(loop){
			try {
				teclado = entrada.nextLine();
				numero = Float.parseFloat(teclado); 	
				loop=false;
			} catch (java.lang.NumberFormatException e) { 
				System.out.println("Vuelva a introducir un numero float"); 
			}
		}
		return numero;
	}
	public String obtenerString(String msg){
		String teclado="0";
		while(loop){
			try {
				teclado = entrada.nextLine();
				loop=false;
			} catch (java.lang.NumberFormatException e) { 
				System.out.println("Vuelva a introducir un String"); 
			}
		}
		return teclado;
	}
	public char obtenerChar(String msg){
		String teclado;
		char letra='A';
		while(loop){
			try {
				teclado = entrada.nextLine();
				letra = teclado.charAt(0);	
				loop=false;
			} catch (java.lang.NumberFormatException e) { 
				System.out.println("Vuelva a introducir una letra"); 
			}
		}
		return letra;	
	}
}
