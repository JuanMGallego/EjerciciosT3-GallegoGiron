package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	
	//num = -12321 --> ERROR: El número introducido está fuera de rango
	//num = 0 --> ERROR: El número introducido está fuera de rango
	//num = 1 --> El número SI es capicúa
	//num = 12 --> El número NO es capicúa
	//num = 55 --> El número SI es capicúa
	//num = 123321 --> El número SI es capicúa
	//num = 40404040 --> El número NO es capicúa

	public static void main(String[] args) {

		int num; //Variable used to store the number introduced by the user
		int figure; //Variable used to store the last digit
		int reverse = 0; //Variable used to store the number written backwards
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//Asks for the number
		System.out.print("Introduzca un número mayor que [0]: ");
		num = sc.nextInt();
		System.out.println();
		
		//If is 0 or less prints an error
		if (num <= 0) {
			
			System.out.println("ERROR: El número introducido está fuera de rango");
			
		//If not...
		} else {
		
			//Loop to take the last digit and make a number backwards the other one until the [aux] is 0
			for (int aux = num ; aux != 0 ; aux /= 10) {
				
				figure = aux % 10; //Last digit is taken by doing its module by 10
				reverse = reverse * 10 + figure; //overwrites the backwards number multiplying it to 10 and adding the digit
				
			}
			
			//If the final number is the same than the introduced one the program shows it to the user printing a message
			if (num == reverse)
				
				System.out.println("El número SI es capicúa");
			
			//If not, says that isn't palindromic
			else
				
				System.out.println("El número NO es capicúa");
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
