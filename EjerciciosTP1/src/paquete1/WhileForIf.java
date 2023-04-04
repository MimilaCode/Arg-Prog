package paquete1;

public class WhileForIf {

	public static void main(String[] args) {
		                          //Ejercicio 1a
		int numA = 5;
		int numB = 14;
		boolean pares = false;
		
		while(numA <= numB ) {
			System.out.println(numA);
			numA = numA + 1;
	
		}
		
		
		                          //Ejercicio 1b
		while(numA <= numB ) {
			if (numA %2 == 0) {
				System.out.print(numA + " - ");
			}
			numA++;
		}
		
		
		                         //Ejercicio 1c
		
		
		while (numA <= numB) {

		if (pares == true) {

		if (numA %2 == 0) {

		System.out.println("El numero "+numA+ " es par ");

		}

		}else {

		if (numA %2 != 0) {

		System.out.println("El numero "+numA+ " es impar ");

		}

		}

		numA++;

		}
		
							  //Ejercicio 1d
		
		System.out.println("Los numeros pares son:");
		for (int i=numB; i >= numA; i--) {
			if(i %2 == 0) {
			System.out.print(i + " - ");
			}
		}
		
						     //Ejercicio 2d
		
		float ingresos = 489082;
		int vehiculos = 3;
		int inmuebles = 0;
		boolean economiaPlena = false;
		
		if ( (ingresos >= 489083) ||
		( vehiculos >= 3) ||
		(inmuebles >= 3)  || (economiaPlena == true) ) {
		System.out.println("Pertenece al segmento de ingresos ALTOS");
		} else  {
		System.out.println("No pertenece");
		}
		
						 

		}}



