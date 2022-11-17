package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	//num = -2 --> ERROR: Ha introducido un valor fuera de rango
	
	//num = 1 --> 1
	
	//num = 5 --> 1
	//            22
	//            333
	//            4444
	
	//num = 0 --> 
	
	/*num = 20 --> 1
				   22
				   333
				   4444
				   55555
				   666666
				   7777777
				   88888888
				   999999999
				   10101010101010101010
				   1111111111111111111111
				   121212121212121212121212
				   13131313131313131313131313
				   1414141414141414141414141414
				   151515151515151515151515151515
				   16161616161616161616161616161616
				   1717171717171717171717171717171717
				   181818181818181818181818181818181818
				   19191919191919191919191919191919191919
				   2020202020202020202020202020202020202020
	*/
	
	//num = 21 --> ERROR: Ha introducido un valor fuera de rango
	
	public static void main(String[] args) {

		int num; //Number introduced by the user
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//Program asks for a number between [0] and [20]
		System.out.print("Introduzca un número entre 0 y 20: ");
		num = sc.nextInt();
		System.out.println();
		
		//If it's out of range, prints an error
		if (num < 0 || num > 20) {
			
			System.out.println("ERROR: Ha introducido un valor fuera de rango");
			
		} else { //If is in the range...
			
			//Creates a loop for each row until it does the same times as the number introduced
			for (int row = 1 ; row <= num ; row++) {
				
				//Prints the number of the row the same times the number is
				for (int times = 1 ; times <= row ; times++) {
					
					System.out.print(row);
					
				}
				
				System.out.println(); //Jumps to the next line at the end of each row
				
			}
			
		}
	
		sc.close(); //Scanner is closed
		
	}

}
