package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		int num;
		int j;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número positivo: ");
		num = sc.nextInt();
		System.out.println();
		
		if (num < 0) {
			
			System.out.println("ERROR: Ha introducido un valor fuera de rango");
			
		} else {
			
			for (int i = 1 ; i <= num ; i++) {
				
				for (j = 1 ; j < i ; j++) {
					
					System.out.print(j);
					
				}
				
				for (int k = j; k >= 1 ; k--) {
					
					System.out.print(k);
					
				}
				
				System.out.println();
				
			}
			
		}
	
		sc.close();
		
	}

}
