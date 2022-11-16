package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		int numA, numB;
		int numMax = 0;
		int mcm = 0;

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
						
						mcm = numA;
						
					} else {
						
						numMax = numA > numB ? numA : numB;
						
						for (mcm = numMax; (float)((numA % mcm - numA % mcm)  * 10)!= 0 || (float)((numB % mcm - numB % mcm) *10) != 0; mcm++) {
							
						}
						
					}
					
					System.out.println("El mínimo común múltiplo es: " + mcm);
					
				}
		
		sc.close();
		
	}

}
