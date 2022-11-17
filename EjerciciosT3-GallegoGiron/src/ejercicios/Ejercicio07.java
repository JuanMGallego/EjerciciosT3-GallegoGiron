package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	//num = -4 --> ERROR: Ha introducido un valor fuera de rango
	
	//num = 1 --> 1
	
	//num = 6 --> 1
	//            121
	//            12321
	//            1234321
	//            123454321
	//            12345654321
	
	//num = 0 --> 
	
	/*num = 12 --> 1
				   121
				   12321
				   1234321
				   123454321
				   12345654321
				   1234567654321
				   123456787654321
				   12345678987654321
				   12345678910987654321
				   123456789101110987654321
				   1234567891011121110987654321
	*/
	
	public static void main(String[] args) {
		
		int num; //Number introduced by the user
		int inc; //Variable used to be each row and the max number of each row

		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//Program asks for a positive number
		System.out.print("Introduzca un número positivo: ");
		num = sc.nextInt();
		System.out.println();
		
		//if it isn't positive prints an error
		if (num < 0) {
			
			System.out.println("ERROR: Ha introducido un valor negativo");
			
		} else { //If is in the range...
			
			//Creates a loop for each row until it does the same times as the number introduced
			for (int row = 1 ; row <= num ; row++) {
				
				//Prints the number incrementing one for each time it repeats until it is the same as the row
				for (inc = 1 ; inc < row ; inc++) {
					
					System.out.print(inc);
					
				}
				
				//Prints the numbers decreasing one starting on the last one until it is less than [1]
				for (int dec = inc; dec >= 1 ; dec--) {
					
					System.out.print(dec);
					
				}
				
				System.out.println(); //Jumps to the next line at the end of each row
				
			}
			
		}
	
		sc.close(); //Scanner is closed
		
	}

}
