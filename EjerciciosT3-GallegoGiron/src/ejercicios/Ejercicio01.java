package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	//sec = 61, min = 70, hour = 25, inc = 10 --> ERROR: Los datos introducidos no son correctos
	//sec = 0, min = 0, hour = 0, inc = 0 --> La hora es: 0:0:0
	//sec = 44, min = 35, hour = 20, inc = 25 --> La hora es: 20:36:9
	//sec = 59, min = 59, hour = 23, inc = 1 --> La hora es: 0:0:0
	
	
	public static void main(String[] args) {

		int sec, min, hour; //Variables used to store the time exactly
		int inc; //Increment user gives to the time in seconds
		
		Scanner sc = new Scanner(System.in); //Scanner is started
		
		//Program firstly asks for each section of time, then for the increment in seconds
		System.out.print("Introduza los segundos: ");
		sec = sc.nextInt();
		System.out.print("Introduza los minutos: ");
		min = sc.nextInt();
		System.out.print("Introduza las horas: ");
		hour = sc.nextInt();
		System.out.print("Introduzca el incremento en segundos: ");
		inc = sc.nextInt();
		System.out.println();
		
		//The program will search for a valid time
		if (sec < 60 && sec >= 0 && min < 60 && min >= 0 && hour < 24 && hour >= 0) {
			
			sec += inc; //The increment adds to the seconds of the hour given
			
			//the program will subtract 60 seconds to transform it into one minute until the seconds counter is under 60
			while(sec >= 60) {
				
				sec -= 60;
				min++;
			
				//Same for minutes, it adds one to hours
				if (min >= 60) {
					
					min -= 60;
					hour++;
					
					//And same for hours, it subtract the total possible hours
					if (hour >= 24) {
						
						hour -= 24;
						
					}
					
				}
				
			}
	
			System.out.println("La hora es: " + hour + ":" + min + ":" + sec); //Final message is printed in this option
		
		} else {
			
			//if the time introduced doesn't correspond to a real one, it will give an error
			System.out.println("ERROR: Los datos introducidos no son correctos");
			
		}
		
		sc.close(); //Scanner closes
		
	}

}
