package ejercicio1;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Nombre del jugador: "); 
		String nombreUsuario = entrada.next();
		
		System.out.println("Misiones completadas: "); 
		int MisionesCompletadas = entrada.nextInt();
		
		String NivelUsuario;
		if ( MisionesCompletadas == 0 ) {
			NivelUsuario = "Jugador novato";
		 } else if ( MisionesCompletadas >= 1 && MisionesCompletadas <= 5 ) {
			 NivelUsuario = "Jugador Principiante";
		} else if (MisionesCompletadas >= 6 && MisionesCompletadas <= 15) {
			NivelUsuario = "Jugador Experimentado";
		} else if ( MisionesCompletadas > 15 ) {
			NivelUsuario = "Jugador Veterano";
		} else {
			NivelUsuario = "Error";
		}
		
		System.out.println("Jugador: " + nombreUsuario);
		System.out.println("Misiones completadas: " + MisionesCompletadas);
		System.out.println("Nivel: " + NivelUsuario);
	}

}
