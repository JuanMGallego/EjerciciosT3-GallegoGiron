package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	//size = 4 -->   *
	//              * *
	//             * * *
	//            * * * * 
	
	//size = 2 --> *
	//            * *
	
	//size = 0 -->
	
	public static void main(String[] args) {

		int size; //Variable used to store the size of the triangle introduced by the user
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//Program asks for the size of the triangle
		System.out.print("Introduzca el tamaño del triángulo: ");
		size = sc.nextInt();
		System.out.println();
		
		//Triangle creation
		for (int row = 1 ; row <= size ; row++) { //Loop used to create each row of the triangle
			
			//First loop used to create the blank spaces needed before the first star
			for (int blank = 1 ; blank <= size - row ; blank++) {
				
				System.out.print(" "); //Blank space
				
			}
			
			//second loop used to create corresponding stars depending in the row they are
			for (int star = 1 ; star <= row ; star++) {
				
				System.out.print("* "); //Star and space
				
			}
			
			System.out.println(); //Line brake to separate each row
			
		}
		
		sc.close(); //Scanner is closed
		
	}

}
