package Coche;

public class Puerta {
private boolean abierta;
	
	public Puerta(){
		abierta = false;
	}
	
	public Puerta(boolean power){
		abierta = power;
	}
	
	public void setPuerta(boolean power){
		abierta = power;
	}
	
	public String toString(){
		if(this.abierta==true){
			return "Puertra abierta";
		}else{
			return "Puerta cerrada";
		}
	}
	
	public boolean getPuerta(){
		return abierta;
	}

}
