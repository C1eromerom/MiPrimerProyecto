/* Ejercicio
-------------
Crea una clase Rectangulo que modele rectángulos por medio de cuatro
puntos (los vértices). Para ello crea la clase Punto.
· Dispondrá de dos constructores:
   - uno que cree un rectángulo partiendo de sus cuatro vértices
   - otro que cree un rectángulo partiendo de la base y la altura, de
     forma que su vértice inferior izquierdo esté en (0,0).
· La clase también incluirá un método para calcular la superficie.
· Otro para desplazar el rectángulo en el plano.

*/
 
#include <iostream.h>
#include <conio.h>
// INTERFAZ DE LA CLASE Punto //
// --------------------------- //
class Punto
 {
public:
  Punto(int = 0, int = 0);     // constructor
  int coordenadax();           // método accedente
  int coordenaday();           // método accedente
  void coordenadax(int t);     // método mutador
  void coordenaday(int t);     // método mutador
private:
  int x;
  int y;
};

// Implementación de los métodos -----
Punto::Punto (int a, int b)
 {
    x=a;
    y=b;
 }

void Punto::coordenadax(int t)
{ x = t;}
void Punto::coordenaday(int t)
{ y = t;}
int Punto::coordenadax()
{ return x; }
int Punto::coordenaday()
{ return y; }


//Clase RECTANGULO -------------
// modela la clase rectángulo con 4 puntos
//     |
//     |    .p4           .p3
//     |
//     |    .p1           .p2
//     |
//  ---|------------------------------
//     |

class Rectangulo
{
  
	private Punto p1;
	private  Punto p2;
	private Punto p3;
	private Punto p4;
  
   // constructor cuyos parámetros son los 4 puntos
	public df (Punto, Punto, Punto, Punto);
   // Constructor a partir de la base y la altura. (El punto inferior
   //  izquierdo es el (0,0)
	public df (float, float);
	public float area();
   // desplaza el rectángulo en el plano
	public void desplazar(int x, int y);

  //   void mostrar();
};

public  Rectangulo (Punto a1, Punto a2, Punto a3, Punto a4)
{
        p1 = a1; p2=a2; p3=a3; p4=a4;
}

public  Rectangulo (float  b, float h)
{
      Punto a1(0,0);
      p1 = a1;

      Punto a2(b,0);
      p2 = a2;

      Punto a3(b,h);
      p3 = a3;

      Punto a4(0,h);
      p4 = a4;
}

public float Rectanguloarea()
{
        float base, altura;
        base = p2.coordenadax() - p1.coordenaday();
        altura = p4.coordenaday() - p1.coordenaday();
        return base*altura;
}
public  void Rectangulodesplazar(int dx, int dy)
{
 p1.coordenadax(p1.coordenadax()+ dx);
 p4.coordenadax(p4.coordenadax()+ dx);
 p2.coordenadax(p2.coordenadax()+ dx);
 p3.coordenadax(p3.coordenadax()+ dx);

 p1.coordenaday(p1.coordenaday()+ dy);
 p4.coordenaday(p4.coordenaday()+ dy);
 p2.coordenaday(p2.coordenaday()+ dy);
 p3.coordenaday(p3.coordenaday()+ dy);
}



void main()
{
   Rectangulo r(Punto(0,0), Punto(2,0), Punto(2,3), Punto(0,3));
   Rectangulo t(2, 3);
   // ambos rectángulos son iguales.

   t.desplazar(2,2);

   float superficie;
   superficie = r.area();       // cálculo del area del rectángulo r
   cout << "El area del rectángulo r es : " << superficie << endl;
   superficie = t.area();       // cálculo del area del rectángulo t
   cout << "El area del rectángulo t es : " << superficie;
   getch();
}

