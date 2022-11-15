package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		int numA, numB;
		int numMax = 0;
		int mcd = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un n�mero: ");
		numA = sc.nextInt();
		System.out.print("Introduzca otro n�mero: ");
		numB = sc.nextInt();
		System.out.println();

		if (numA <= 0 || numB <= 0) {
			
			System.out.println("ERROR: Introduce valores enteros positivos y mayores que 0");
			
		} else {

			if (numA == numB) {
				
				mcd = numA;
				
			} else {
				
				if (numA > numB)

					numMax = numA;

				else if (numA < numB)
					
					numMax = numB;

				for (int i = numMax; numA % i != 0 || numB % i != 0; i--) {

					mcd = i;
					mcd--;
					
				}
				
			}
			
			System.out.println("El m�ximo com�n divisor es: " + mcd);
			
		}

		sc.close();
		
	}

}
