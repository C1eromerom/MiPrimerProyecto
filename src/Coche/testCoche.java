package Coche;
import miLibreria.Entrada;
public class testCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada= new Entrada();
		Coche coche = new Coche();
		
		boolean loop=true;
		int a=0,respuesta;
		boolean decision;
		
		while(loop==true){
		System.out.printf(
				 "\n(1)Ver el coche"
				+"\n(2)Inflar/desinflar rueda"
				+"\n(3)Abrir/cerrar puerta"
				+"\n(4)Abrir/cerrar ventana"
				+"\n(5)Encender/apagar motor"
				+"\n(0) SALIR \n");
		
		
			respuesta=entrada.obtenerEntero("Elija una opcion");
			switch(respuesta){
				case 1:
					System.out.println("Este es tu coche:\n"+coche.toString());
				break;
				case 2:
					decision = entrada.obtenerBooleano("Quieres inflar(true) o desinflar(false) la rueda? ");
					coche.cambiarRueda(decision);
				break;
				case 3:
					decision = entrada.obtenerBooleano("Quieres abrir(true) o cerrar(false) la puerta? ");
					coche.cambiarPuerta(decision);
				break;
				case 4:
					decision = entrada.obtenerBooleano("Quieres abrir(true) o cerrar(false) la ventana? ");
					coche.cambiarVentana(decision);
				break;
				case 5:
					decision = entrada.obtenerBooleano("Quieres encender(true) o apagar(false) el motor? ");
					coche.cambiarMotor(decision);
				break;
				case 0:
					loop=false;
				break;
			}
		}
		
	}
	
	
	
	

}
