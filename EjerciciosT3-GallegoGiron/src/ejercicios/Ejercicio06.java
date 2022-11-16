package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entre 0 y 20: ");
		num = sc.nextInt();
		System.out.println();
		
		if (num < 0 || num > 20) {
			
			System.out.println("ERROR: Ha introducido un valor fuera de rango");
			
		} else {
			
			for (int row = 1 ; row <= num ; row++) {
				
				for (int times = 1 ; times <= row ; times++) {
					
					System.out.print(row);
					
				}
				
				System.out.println();
				
			}
			
		}
	
		sc.close();
		
	}

}
