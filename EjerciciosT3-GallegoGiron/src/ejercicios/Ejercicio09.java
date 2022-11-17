package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
	
	//num = -23 --> ERROR: Ha introducido un valor fuera de rango.
	//num = 0 --> ERROR: Ha introducido un valor fuera de rango.
	//num = 1 --> El número tiene 1 cifras
	//num = 76 --> El número tiene 2 cifras
	//num = 5231 --> El número tiene 4 cifras
	//num = 512378543284632354 --> El número tiene 18 cifras

	public static void main(String[] args) {

		long num; //Number introduced by the user
		int count = 0; //Variable used to count the digits of the number
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//Program asks for a number higher than [0]
		System.out.print("Introduzca un número mayor que [0]: ");
		num = sc.nextLong();
		System.out.println();
		
		//If its less or equal than [0] prints an error
		if (num <= 0) {
			
			System.out.println("ERROR: Ha introducido un valor fuera de rango.");
			
		//If not...	
		} else {
			
			//Loop multiplying for [10] the [i] variable until it is bigger than the number given
			for (long i = 1 ; i <= num ; i*=10) 
				
				count++; //Adds one to the counter of digits
			
			//Final result showed to the user
			System.out.println("El número tiene " + count + " cifras");
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
