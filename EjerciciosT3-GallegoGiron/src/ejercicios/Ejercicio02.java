package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	//numUser = 0 --> ERROR: Ha introdudcido un número fuera de rango
	//numUser = 1 --> Entre 1 y 1 hay 0 números primos
	//numUser = 23 --> Entre 1 y 23 hay 9 números primos
	//numUser = 23567 --> Entre 1 y 23567 hay 2622 números primos
	//nuUser = 5 --> Entre 1 y 5 hay 3 números primos
	//numUser = -23 --> ERROR: Ha introdudcido un número fuera de rango
	
	public static void main(String[] args) {

		int numUser; //Variable used to store the number introduced by the user that will be the maximum
		int count = 0; //Variable used to count each time there is a prime number

		Scanner sc = new Scanner(System.in); //Scanner is started

		//Program asks for the number
		System.out.print("Introduzca un número: ");
		numUser = sc.nextInt();

		//Checks if the number is valid
		if (numUser > 0) {

			//The loop will be repeating until it arrives to the number given
			for (int num = 2; num <= numUser; num++) {
				
				count++; //it adds one to the prime number counter

				//it will increment one to check each divisor to search for a not prime number
				for (int div = 2; div < num; div++) {

					//But if the number of the step the loop is, isn't a prime, it will subtract one to the counter and will finish the loop
					if (num % div == 0) {

						count--;
						break;
					
					}

				}
				
			}

			System.out.println("Entre 1 y " + numUser + " hay " + count + " números primos"); //Final solution is printed in this option

		} else { //If the number isn't valid, the program will give an error

			System.out.println("ERROR: Ha introdudcido un número fuera de rango");

		}

		sc.close(); //Scanner is closed

	}

}
