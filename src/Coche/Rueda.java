package Coche;

public class Rueda {
private boolean inflada;
	
	public Rueda(){
		inflada = false;
	}
	
	public Rueda(boolean aire){
		inflada =aire;
	}
	
	public void setRueda(boolean aire){
		inflada = aire;
	}
	
	public String toString(){
		if(this.inflada==true){
			return "Esta inflada";
		}else{
			return "Esta desinflada";
		}
	}
	
	public boolean getRueda(){
		return inflada;
	}

}
