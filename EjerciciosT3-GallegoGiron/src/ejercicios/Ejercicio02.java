package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		int num;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		for (int i=1 ; i!=num ; i++) {
			
			if (i%i != 0) {
				
				count++;
				
			}
			
		}
		
		System.out.println("Entre 1 y " + num + " hay " + count + " números primos");
		
		sc.close();
		
	}

}
