package Cafetera;
import miLibreria.Entrada;

public class testCafetera {

	public static void main(String[] args) {
			Entrada entrada = new Entrada();
			Cafetera cafetera = new Cafetera();
			boolean loop=true;
			int a=0,r=1;
			
			while(loop){
				System.out.printf(
						"\n(1)SERVIR UNA TAZA"
						+"\n(2)Ver la cafetera"
						+"\n(3)Llenar la cafetera"
						+"\n(4)Vaciar la cafetera"
						+"\n(5)Agregar café a la cafetera"
						+"\n(6)Rellenar cafetera"
						+"\n(7)Crear una nuvea cafetera"
						+"\n(0)SALIR");
				
				System.out.println(cafetera.toString());
				
				r=entrada.obtenerEntero("");
				
				switch(r){
					case 1:
						cafetera.servirTaza(entrada.obtenerEntero("¿De cuanto es la taza(ml)?"));
					break;
					case 2:
						cafetera.toString();
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
					case 6:
						cafetera.llenarCafetera();
					break;
					case 7:
						a = entrada.obtenerEntero("¿Quieres crear una cafetera normal(1) o prefieres definir su capacidad(2)?");
						if(a==1){
							cafetera = new Cafetera();
						}else if(a==2){
							cafetera = new Cafetera((entrada.obtenerEntero("Dime el tamaño máximo de la cafetera:")), (entrada.obtenerEntero("Ahora dime la cantidad de café que contiene actualmente:")));
						}
					break;
					case 0:
						loop=false;
					break;
				}
			}
			
		}
		
		
		
		

	

}
