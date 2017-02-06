package Rectangulo;

import Ejercicios.Complejo;

public class Rectangulo {
	private Complejo verticeInferiorIzquierdo;
	private Complejo verticeInferiorDerecho;
	private Complejo verticeSuperiorIzquierdo;
	private Complejo verticeSuperiorDerecho;
	
	public Rectangulo(){}
	
	public Rectangulo(Complejo vII, Complejo vID, Complejo vSI, Complejo vSD){
		this.verticeInferiorIzquierdo = vII;
		this.verticeInferiorDerecho = vID;
		this.verticeSuperiorIzquierdo = vSI;
		this.verticeSuperiorDerecho = vSD;
	}
	
	public Rectangulo(int altura, int base){
		this.verticeInferiorIzquierdo = new Complejo(0,0);
		this.verticeInferiorDerecho = new Complejo(base,0);
		this.verticeSuperiorIzquierdo = new Complejo(altura,base);
		this.verticeSuperiorDerecho = new Complejo(0,altura);
	}
	
	public double area(){
		return (verticeInferiorDerecho.getReal()-verticeInferiorIzquierdo.getReal())*(verticeSuperiorIzquierdo.getImag()-verticeInferiorIzquierdo.getImag());
	}
	public void desplaza (Complejo mover){
		this.verticeInferiorDerecho=mover.suma(this.verticeInferiorDerecho);
		this.verticeInferiorIzquierdo=mover.suma(this.verticeInferiorIzquierdo);
		this.verticeSuperiorDerecho=mover.suma(this.verticeSuperiorDerecho);
		this.verticeSuperiorIzquierdo=mover.suma(this.verticeSuperiorIzquierdo);
	}
	
	public String toString(){
		return verticeSuperiorIzquierdo.toString()+" " + verticeSuperiorDerecho.toString()+"\n" + verticeInferiorIzquierdo.toString()+" " + verticeInferiorDerecho.toString();
		
	}

	
	
	
	


}