package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		int numA, numB;
		int numMin = 0;
		int mcd = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		numA = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		numB = sc.nextInt();
		System.out.println();

		if (numA <= 0 || numB <= 0) {
			
			System.out.println("ERROR: Introduce valores enteros positivos y mayores que 0");
			
		} else {

			if (numA == numB) {
				
				mcd = numA;
				
			} else {
				
				numMin = numA < numB ? numA : numB;
				
				for (mcd = numMin; numA % mcd != 0 || numB % mcd != 0; mcd--) {
					
				}
				
			}
			
			System.out.println("El máximo común divisor es: " + mcd);
			
		}

		sc.close();
		
	}

}
