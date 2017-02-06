package Coche;

public class Motor {
private boolean encendido;
	
	public Motor(){
		encendido = false;
	}
	
	public Motor(boolean power){
		encendido = power;
	}
	
	public void setMotor(boolean power){
		encendido = power;
	}
	
	public String toString(){
		if(this.encendido==true){
			return "Encendido";
		}else{
			return "Apagado";
		}
	}
	
	public boolean getMotor(){
		return encendido;
	}

}
