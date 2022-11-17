package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
	
	//num = 0 --> Total de números introducidos: 0
	//			  Números fallados: 0
	
	//num = 1, num = 0 --> Total de números introducidos: 1
	//					   Números fallados: 0
	
	//num = 12, num = 12 --> Fallo, es igual., num = 0 --> Total de números introducidos: 2
	//						 Números fallados: 1
	
	//num = 20, num = 4 --> Fallo, es menor., num = 34, num = 56, num = 3 --> Fallo, es menor., num = 3 --> Fallo, es igual., num = 24, num = 0 --> Total de números introducidos: 7
	//																																				Números fallados: 3

	public static void main(String[] args) {

		int num; //Variable used to store each number the user introduces
		int last; //Variable used to store the last number introduced
		int count = 0; //Variable used to count the total numbers introduced
		int fail = 0; //Variable used to count the total numbers failed
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//Program asks for an initial number
		System.out.print("Introduzca un número inicial: ");
		num = sc.nextInt();
		
		//Loop until the user introduces [0]
		while (num != 0) {
			
			count++; //adds one to the number counter
			
			last = num; //puts actual number as the last one
			
			//asks for a new number
			System.out.print("Introduzca otro número: ");
			num = sc.nextInt();
			
			//if the number is [0] the loop finishes
			if (num == 0) {
			
				break;
			
			//If the number is the same than the last one, it adds one to the failed counter and print that is the same
			} else if (num == last) {
				
				fail++;
				System.out.println("Fallo, es igual.");
			
			//If is less, do the same but prints that is less
			} else if (num < last) {
				
				fail++;
				System.out.println("Fallo, es menor.");
				
			}
			
		}
		
		//Final result printed
		System.out.println();
		System.out.println("Total de números introducidos: " + count);
		System.out.println("Números fallados: " + fail);
		
		sc.close(); //Scanner is closed
		
	}

}
