package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		int numUser;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		numUser = sc.nextInt();

		if (numUser > 0) {

			for (int num = 2; num <= numUser; num++) {
				
				count++;

				for (int div = 2; div < num; div++) {

					if (num % div == 0) {

						count--;
						break;
					
					}

				}
				
			}

		} else {

			System.out.println("ERROR: Ha introdudcido un número fuera de rango");

		}

		System.out.println("Entre 1 y " + numUser + " hay " + count + " números primos");

		sc.close();

	}

}
