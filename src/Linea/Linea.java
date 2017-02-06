package Linea;
import Ejercicios.Complejo;

public class Linea {
	private Complejo vertice1;
	private Complejo vertice2;
	
	public Linea(){}
	
	public Linea (Complejo v1, Complejo v2){
		this.vertice1=v1;
		this.vertice2=v2;
	}
	
	public Complejo getVertice1(){
		return vertice1;
	}
	
	public void setVertice1(Complejo v1){
		this.vertice1=v1;
	}
	
	public Complejo getVertice2(){
		return vertice2;
	}
	
	public void setVertice2(Complejo v2){
		this.vertice2=v2;
	}
	public void mueveDerecha(int m){
		
		Complejo s= new Complejo(0,m);
		this.vertice1=vertice1.suma(s);
		this.vertice2=vertice2.suma(s);
	}
	
	public void mueveIzquierda(int m){
		
		Complejo s= new Complejo(-m,0);
		this.vertice1=vertice1.suma(s);
		this.vertice2=vertice2.suma(s);	
	}

	public void mueveArriba(int m){
		Complejo s= new Complejo(m,0);
		this.vertice1=vertice1.suma(s);
		this.vertice2=vertice2.suma(s);
		
	}
	
	public void mueveAbajo(int m){
		Complejo s= new Complejo(0,-m);
		this.vertice1=vertice1.suma(s);
		this.vertice2=vertice2.suma(s);
		
	}
	
	public String toString(){
		return vertice1.toString()+"\n"+vertice2.toString();
	}
}
