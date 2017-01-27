package Ejercicios;

public class Complejo {

	private int imag;
	private int real;
	
	public Complejo(){
	}
	
	public Complejo(int imag, int real){
		this.real=real;
		this.imag=imag;
	}
	
	
	public int getImag(){
		return imag;
	}
	
	public void setImgag(int imag){
		this.imag=imag;
	}
	
	public int getReal(){
		return real;
	}
	
	public void setReal(int real){
		this.real=real;
	}

	
	public Complejo suma (Complejo c){
		return new Complejo (real+c.real , imag+c.imag);
	}
	
	public Complejo resta (Complejo c){
		return new Complejo (real-c.real , imag-c.imag);
	}
	
	
}

