package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		int num;
		int last;
		int count = 0;
		int fail = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número inicial: ");
		num = sc.nextInt();
		
		while (num != 0) {
			
			count++;
			
			last = num;
			
			System.out.print("Introduzca otro número: ");
			num = sc.nextInt();
			
			if (num == 0) {
			
				break;
			
			} else if (num > last) {
				
			} else if (num == last) {
				
				fail++;
				System.out.println("Fallo, es igual.");
				
			} else {
				
				fail++;
				System.out.println("Fallo, es menor.");
				
			}
			
		}
		
		System.out.println();
		System.out.println("Total de números introducidos: " + count);
		System.out.println("Números fallados: " + fail);
		
		sc.close();
		
	}

}
