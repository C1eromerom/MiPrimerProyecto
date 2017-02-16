package Empleado;

import Coche.Coche;
import miLibreria.Entrada;

public class testEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Entrada entrada= new Entrada();
		
		boolean loop=true;
		int respuesta, hijos,IRPF,NIF, DNI;
		boolean SiNo,casado;
		long sueldo,pagoHoraExtra,horaExtraMes;
		
		System.out.println("Información del empleado:\n");
		NIF= entrada.obtenerEntero("Digame el NIF");
		sueldo= entrada.obtenerLong("Digame el sueldo a cobrar: ");
		pagoHoraExtra= entrada.obtenerLong("Digame el pago por cada hora extra: ");
		horaExtraMes= entrada.obtenerLong("Digame las horas extras realizadas: ");
		IRPF= entrada.obtenerEntero("Digame el porcentaje de IRPF: ");
		casado= entrada.obtenerBooleano("Digame si está casado(true/false): ");
		hijos= entrada.obtenerEntero("Digame cuantos hijos tiene: ");
		SiNo =entrada.obtenerBooleano("Desea introducir el DNI?(true/false): ");
			Empleado empleado = new Empleado (NIF,sueldo,pagoHoraExtra,horaExtraMes,IRPF,casado,hijos);
			if (SiNo==true){
				DNI= entrada.obtenerEntero("Digame el DNI: ");
				empleado.setDNI(DNI);
			}
		
		
		while(loop==true){
		System.out.printf(
				"\n(1)Mostrar información básica del empleado"
				+"\n(2)Mostrar información detallada del empleado"
				+"\n(3)Cambiar pago de horas extras"
				+"\n(4)Cambiar IRPF"
				+"\n(5)Cambiar el numero de horas extras realizada"
				+"\n(0) SALIR \n");
		
		
			respuesta=entrada.obtenerEntero("Elija una opcion");
			switch(respuesta){

				case 1:
					System.out.println(empleado.println());
				break;
				case 2:
					System.out.println(empleado.printALL());
				break;
				case 3:
					pagoHoraExtra= entrada.obtenerLong("Nuevo valor de las horas extras: ");
					empleado.setPagoHoraExtra(pagoHoraExtra);
				break;
				case 4:
					IRPF= entrada.obtenerEntero("Nuevo valor del IRPF: ");
					empleado.setIRPF(IRPF);
				break;
				case 5:
					horaExtraMes= entrada.obtenerLong("Nuevo numero de horas extras realizada: ");
					empleado.setHoraExtraMes(pagoHoraExtra);
				break;
				case 0:
					loop=false;
				break;
			}
		}
		
	}
}
