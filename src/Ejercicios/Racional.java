package Ejercicios;

public class Racional {
	
	private int numerador;
	private int denominador;
	
	public Racional(){}
	
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
		return new Racional(this.numerador*c.getDenominador() + this.denominador*c.getNumerador(),this.denominador*c.getDenominador());
	}
	
	public Racional resta (Racional c){
		return new Racional((-this.numerador)*c.getDenominador()+this.denominador*c.getNumerador(), (-this.denominador)*c.getDenominador());
	}
	
	public Racional multiplicacion (Racional c){
		return new Racional(this.numerador*c.getNumerador() , this.denominador*c.getDenominador());
	}
	
	public Racional division (Racional c){
		return new Racional(this.numerador*c.getDenominador(),this.denominador*c.getNumerador());
	}
	
	public String toString() {
        return "(" + numerador+ ", " + denominador + ")";
    }
	

}
