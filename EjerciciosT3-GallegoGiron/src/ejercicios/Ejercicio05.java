package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
	
	//numA = -1, numB = 0 --> ERROR: Introduce valores enteros positivos y mayores que 0
	//numA = 0, numB = 15 --> ERROR: Introduce valores enteros positivos y mayores que 0
	//numA = 1, numB = 1 --> El mínimo común múltiplo es: 1
	//numA = 32, numB = 24 --> El mínimo común múltiplo es: 96
	//numA = 234, numB = 56 --> El mínimo común múltiplo es: 6552

	public static void main(String[] args) {

		int numA, numB; //Numbers introduced by the user
		int numMax = 0; //Maximum number
		int mcm = 0; //Least common multiple

		Scanner sc = new Scanner(System.in); //Scanner is started

		//program asks for the numbers
		System.out.print("Introduzca un número: ");
		numA = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		numB = sc.nextInt();
		System.out.println();

		//If isn't in the range, prints an error
		if (numA <= 0 || numB <= 0) {
					
			System.out.println("ERROR: Introduce valores enteros positivos y mayores que 0");
					
		} else { //If it's inside...

			//Will check if they're the same
			if (numA == numB) {
				
				mcm = numA; //Puts one of them as the least common multiple
				
			} else { //if not, selects the maximum
				
				numMax = numA > numB ? numA : numB; //Searches for the maximum between the numbers introduced
				
				//Searches for the least common multiple starting at the minimum until the program found it proving if their module is [0]
				for (mcm = numMax; mcm % numA != 0 || mcm % numB != 0; mcm++) {
					
				}
				
			}
			
			//Final solution is printed in this option
			System.out.println("El mínimo común múltiplo es: " + mcm);
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
