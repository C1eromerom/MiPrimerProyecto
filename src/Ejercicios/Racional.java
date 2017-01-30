package Ejercicios;

public class Racional {
	
	private int numerador;
	private int denominador;
	
	public Racional(int numer, int denom){
		this.numerador=numer;
		this.denominador=denom;
	}
	
	public int getNumerador(){
		return numerador;
	}
	
	public void setNumerador(int numerador){
		this.numerador=numerador;
	}
	
	public int getDenominador(){
		return denominador;
	}
	
	public void setDenominador(int denominador){
		this.denominador=denominador;
	}
	
	public Racional suma(Racional c){
		return new Racional(numerador*c.denominador + denominador*c.numerador,denominador*c.denominador);
	}
	
	public Racional resta (Racional c){
		return new Racional((-numerador)*c.denominador+denominador*c.numerador, denominador*c.denominador);
	}
	
	public Racional multiplicacion (Racional c){
		return new Racional(numerador*c.numerador , denominador*c.denominador);
	}
	
	public Racional division (Racional c){
		return new Racional(numerador*c.denominador,denominador*c.denominador);
	}
	
	

}
