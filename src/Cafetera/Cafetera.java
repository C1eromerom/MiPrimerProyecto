package Cafetera;

public class Cafetera {
	private int capacidadMaxima;
	private int capacidadActual;
	
	public Cafetera(){
		this.capacidadMaxima=1000;
		this.capacidadActual=0;
	}
	public Cafetera(int max){
		this.capacidadActual=max;
	}
	public Cafetera(int max, int act){
		if(act>max){
			this.capacidadMaxima=act;
		}
	}
	
	public int getMaxima(){
		return capacidadMaxima;
	}
	public int getActual(){
		return capacidadActual;
	}
	public void setMaxima(int cM){
		this.capacidadMaxima=cM;
	}
	public void setActual (int cA){
		this.capacidadActual=cA;
	}
	
	public void llenarCafetera(){
		this.capacidadActual=this.capacidadMaxima;
	}
	public void servirTaza(int s){
		if(s>capacidadActual){
			this.capacidadActual=0;
			System.out.println("No queda café");
		} else {
			this.capacidadActual=this.capacidadActual-s;
		}
	}
	public void vaciarCafetera(){
		this.capacidadActual=0;
	}
	public void agregarCafe(int s){
		this.capacidadActual=this.capacidadActual+s;
	}
	
	public String toString(){
		return "\n Café: "+this.capacidadActual+" ml "
				+"\n Máximo--"+this.capacidadMaxima+" ml";
	}
	
	

}
