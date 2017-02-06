package Coche;

public class Ventana {
private boolean abierta;
	
	public Ventana(){
		abierta = false;
	}
	
	public Ventana(boolean power){
		abierta = power;
	}
	
	public void setVentana(boolean power){
		abierta = power;
	}
	
	public String toString(){
		if(this.abierta==true){
			return "Ventana abierta";
		}else{
			return "Ventana cerrada";
		}
	}
	
	public boolean getVentana(){
		return abierta;
	}

}
