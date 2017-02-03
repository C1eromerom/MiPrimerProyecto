package Rectangulo;

public class Vertice {
	private int imag;
	private int real;
	
	public Vertice(){
	}

	public Vertice(int imag, int real){
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
	
	
}
