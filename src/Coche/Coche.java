package Coche;
import miLibreria.Entrada;

public class Coche {
	private Motor motor;
	private Rueda rueda1;
	private Rueda rueda2;
	private Rueda rueda3;
	private Rueda rueda4;
	private Ventana ventana1;
	private Ventana ventana2;
	private Puerta puerta1;
	private Puerta puerta2;

	
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
	
	public Motor encenderMotor(boolean m){
		motor.setMotor(m);
		return motor;
	}
	
	public Rueda inflarRueda(boolean m){
		
		Entrada entrada= new Entrada();
		
		int r=entrada.obtenerEntero("Dime el número de la rueda");
		
		switch (r){
		
		case 1:rueda1.setRueda(m);
				return rueda1;
		case 2:rueda2.setRueda(m);
				return rueda2;
		case 3:rueda3.setRueda(m);
				return rueda3;
		case 4:rueda4.setRueda(m);
				return rueda4;
		}
	}
	
public Ventana abrirVentana(boolean m){
		
		Entrada entrada= new Entrada();
		
		int r=entrada.obtenerEntero("Dime el número de la ventana");
		
		switch (r){
		
		case 1:ventana1.setventana(m);
				return rueda1;
		case 2:rueda2.setRueda(m);
				return rueda2;
		case 3:rueda3.setRueda(m);
				return rueda3;
		case 4:rueda4.setRueda(m);
				return rueda4;
		}
	}
	

	}
	
	

}
