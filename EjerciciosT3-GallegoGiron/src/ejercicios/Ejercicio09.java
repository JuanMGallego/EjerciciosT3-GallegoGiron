package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		int num;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero mayor que [0]: ");
		num = sc.nextInt();
		System.out.println();
		
		if (num <= 0) {
			
			System.out.println("ERROR: Ha introducido un valor fuera de rango.");
			
		} else {
			
			for (int i = 1 ; i <= num ; i*=10) 
				
				count++;
			
			System.out.println("El n�mero tiene " + count + " cifras");
			
		}
		
		sc.close();
		
	}

}
