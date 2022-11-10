package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int sec, min, hour;
		int inc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduza los segundos: ");
		sec = sc.nextInt();
		System.out.print("Introduza los minutos: ");
		min = sc.nextInt();
		System.out.print("Introduza las horas: ");
		hour = sc.nextInt();
		System.out.print("Introduzca el incremento en segundos: ");
		inc = sc.nextInt();
		System.out.println();
		
		sec += inc;
		
		if (sec >= 60 && min >= 60 && hour >= 24) {
			
			while(sec >= 60) {
				
				sec -= 60;
				min++;
			
				if (min >= 60) {
					
					min -= 60;
					hour++;
					
				if (hour >= 24) {
					
					hour -= 24;
					
				}
					
				}
				
			}
	
			System.out.println("La hora es: " + hour + ":" + min + ":" + sec);
		
		} else {
			
			System.out.println("Los datos introducidos no son correctos");
			
		}
		
		sc.close();
		
	}

}
