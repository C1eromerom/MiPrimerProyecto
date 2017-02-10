package DNI;

import miLibreria.Entrada;

public class testCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Entrada entrada = new Entrada();
			
			boolean loop=true;
			int respuesta;
			long DNI,ingresar,retirar;
			
			DNI=entrada.obtenerLong("Vamos a crear una cuenta, porfavir introduzca los datos\nDNI: ");
			Cuenta cuenta = new Cuenta(DNI,0,10);
			while(loop){
				System.out.printf(
						"\n(1)Ver la cuenta"
						+"\n(2)Ingresar dinero"
						+"\n(3)Retirar dinero"
						+"\n(4)Actualiza saldo"
						+"\n(0)SALIR");
				
				
				respuesta=entrada.obtenerEntero("");
				
				switch(respuesta){
					case 1:
						System.out.print(cuenta.toString());
					break;
					case 2:
						ingresar=entrada.obtenerLong("Dinero para ingresar: ");
						cuenta.ingresar(ingresar);
					break;
					case 3:
						retirar=entrada.obtenerLong("Dinero para retirar: ");
						cuenta.retirar(retirar);
					break;
					case 4:
						cuenta.actualizarSaldo();
					break;
					case 0:
						loop=false;
					break;

					}
			}
	}
}



