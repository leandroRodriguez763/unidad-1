package ejercicio1;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
			double random = Math.random() + 1;

		int numeroSecreto = (int) (random * 50);

		int cantIntentos = 5;

		System.out.println("Ingrese un numero entre 1 y 50: ");
		
		int numeroIngresado = entrada.nextInt();

		while (numeroIngresado != numeroSecreto && cantIntentos >0 ) {
			cantIntentos--;
			System.out.println("Te quedan: " + cantIntentos + " intentos");
			if (numeroIngresado > numeroSecreto) {
				System.out.println("El numero secreto es menor");
				System.out.println("Ingreselo nuevamente: ");
				numeroIngresado = entrada.nextInt();
			} else if (numeroIngresado < numeroSecreto) {
				System.out.println("El numero secreto es mayor");
				System.out.println("Ingreselo nuevamente: ");
				numeroIngresado = entrada.nextInt();
			}
			
		}

		if (cantIntentos == 0) {
			System.out.println("Sistema bloqueado. El código era: " + numeroSecreto);
		} else {
			System.out.println("¡Hackeo exitoso!");
		}
		
	}
}