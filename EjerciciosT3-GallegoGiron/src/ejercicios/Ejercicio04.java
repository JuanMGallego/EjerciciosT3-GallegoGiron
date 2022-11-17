package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	//numA = -1, numB = 0 --> ERROR: Introduce valores enteros positivos y mayores que 0
	//numA = 0, numB = 23 --> ERROR: Introduce valores enteros positivos y mayores que 0
	//numA = 1, numB = 1 --> El máximo común divisor es: 1
	//numA = 32, numB = 14 --> El máximo común divisor es: 2
	//numA = 3620, numB = 2456 --> El máximo común divisor es: 4
	
	public static void main(String[] args) {

		int numA, numB; //Numbers introduced by the user
		int numMin = 0; //Minimum number
		int mcd = 0; //Greatest common divisor

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
				
				mcd = numA; //Puts one of them as the greatest common divisor
				
			} else { //if not, selects the minimum
				
				numMin = numA < numB ? numA : numB; //Searches for the minimum between the numbers introduced
				
				//Searches for the greatest common divisor starting at the minimum until the program found it proving if their module is [0]
				for (mcd = numMin; numA % mcd != 0 || numB % mcd != 0; mcd--) {
					
				}
				
			}
			
			//Final solution is printed in this option
			System.out.println("El máximo común divisor es: " + mcd);
			
		}

		sc.close(); //Scanner is closed
		
	}

}
