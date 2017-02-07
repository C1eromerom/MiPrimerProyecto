package Coche;
import miLibreria.Entrada;

public class Coche {
	private Motor motor=new Motor(false);
	private Rueda rueda1=new Rueda(false);
	private Rueda rueda2=new Rueda(false);
	private Rueda rueda3=new Rueda(false);
	private Rueda rueda4=new Rueda(false);
	private Ventana ventana1=new Ventana(false);
	private Ventana ventana2=new Ventana(false);
	private Puerta puerta1=new Puerta(false);
	private Puerta puerta2=new Puerta(false);

	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Rueda getRueda1() {
		return rueda1;
	}
	public void setRueda1(Rueda rueda1) {
		this.rueda1 = rueda1;
	}
	public Rueda getRueda3() {
		return rueda3;
	}
	public void setRueda3(Rueda rueda3) {
		this.rueda3 = rueda3;
	}
	public Rueda getRueda2() {
		return rueda2;
	}
	public void setRueda2(Rueda rueda2) {
		this.rueda2 = rueda2;
	}
	public Rueda getRueda4() {
		return rueda4;
	}
	public void setRueda4(Rueda rueda4) {
		this.rueda4 = rueda4;
	}
	public Ventana getVentana1() {
		return ventana1;
	}
	public void setVentana1(Ventana ventana1) {
		this.ventana1 = ventana1;
	}
	public Ventana getVentana2() {
		return ventana2;
	}
	public void setVentana2(Ventana ventana2) {
		this.ventana2 = ventana2;
	}
	public Puerta getPuerta1() {
		return puerta1;
	}
	public void setPuerta1(Puerta puerta1) {
		this.puerta1 = puerta1;
	}
	public Puerta getPuerta2() {
		return puerta2;
	}
	public void setPuerta2(Puerta puerta2) {
		this.puerta2 = puerta2;
	}
	
	public void cambiarMotor(boolean m){
		motor.setMotor(m);
	}
	
	public void cambiarRueda(boolean m){
		
		Entrada entrada= new Entrada();
		
		int r=entrada.obtenerEntero("Dime el numero de la rueda");
		
		switch (r){
		
		case 1:rueda1.setRueda(m);
		break;
		case 2:rueda2.setRueda(m);
		break;
		case 3:rueda3.setRueda(m);
		break;
		case 4:rueda4.setRueda(m);
		break;
		}
	}
	
public void cambiarVentana(boolean m){
		
		Entrada entrada= new Entrada();
		
		int r=entrada.obtenerEntero("Dime el numero de la ventana");
		
		switch (r){
		
		case 1:ventana1.setVentana(m);
		break;
		case 2:ventana2.setVentana(m);
		break;

		}
	}

public void cambiarPuerta(boolean m){
	
	Entrada entrada= new Entrada();
	
	int r=entrada.obtenerEntero("Dime el numero de la puerta");
	
	switch (r){
	
	case 1:puerta1.setPuerta(m);
	break;
	case 2:puerta2.setPuerta(m);
	break;

	}
}

public String toString(){
	return 	"Motor: "+motor+
			"\n Rueda1: "+rueda1+"\n Rueda2: "+rueda2+"\n Rueda3: "+rueda3+"\n Rueda4: "+rueda4+
			"\n Ventana1: "+ventana1+"\n Ventana2: "+ventana2+
			"\n Puerta1: "+puerta1+"\n Puerta2: "+puerta2;
}
	
}


	
	


