package Cafetera;
import miLibreria.Entrada;

public class testCafetera {

	public static void main(String[] args) {
			Entrada entrada = new Entrada();
			Cafetera cafetera = new Cafetera();
			boolean loop=true;
			int r=1;
			
			while(loop){
				System.out.printf(
						"\n(1)SERVIR UNA TAZA"
						+"\n(2)Ver la cafetera"
						+"\n(3)Llenar la cafetera"
						+"\n(4)Vaciar la cafetera"
						+"\n(5)Agregar café a la cafetera"
						+"\n(0)SALIR");
				
				
				
				r=entrada.obtenerEntero("");
				
				switch(r){
					case 1:
						cafetera.servirTaza(entrada.obtenerEntero("¿De cuanto es la taza(ml)?"));
					break;
					case 2:
						System.out.println(cafetera.toString());
					break;
					case 3:
						System.out.println("Llenando cafetera...");
						cafetera.llenarCafetera();
					break;
					case 4:
						System.out.println("Vaciendo café...");
						cafetera.vaciarCafetera();
					break;
					case 5:
						cafetera.agregarCafe(entrada.obtenerEntero("¿Cuanto café quieres agregar?"));
					break;
					case 0:
						loop=false;
					break;
				}
			}
			
		}
		
		
		
		

	

}
