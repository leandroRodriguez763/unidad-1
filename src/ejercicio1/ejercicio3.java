package ejercicio1;

import java.util.Scanner;

public class ejercicio3 { //Primera llave 1

	public static void main(String[] args) { //Segunda Llave 2

		Scanner entrada = new Scanner(System.in);
		
		int puntaje = 0;
		char numeroEleccion;

			do { // Tercera Llave 3
	
				System.out.println("Elija un número");
				System.out.println("1- Registrar puntaje");
				System.out.println("2- Mostrar puntaje");
				System.out.println("3- Salir");
				System.out.print("Elección: ");
	
				numeroEleccion = entrada.next().charAt(0);
	
	
					switch (numeroEleccion) { //Cuarta Llave 4
		
					case '1':
						System.out.println("Ingrese su puntaje: ");
						puntaje = entrada.nextInt();
						break;
		
					case '2':
						System.out.println("El record actual es: " + puntaje);
						break;
		
					case '3':
						System.out.println("Has decidido salir");
						break;
		
					default:
						System.out.println("Error");
					} //Cuarta Llave 4
	
			} while (numeroEleccion != '3'); // Tercera Llave 3

			System.out.println("¡Programa finalizado!");
			
	} //Segunda Llave 2
	
} //Primera llave 1


