package ejercicio1;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Dias registrados: ");
		int diasRegistro = entrada.nextInt();
		
		double temp, tempMax = 0, tempMin = 0;
		double sumaTemp = 0;  // ← nueva variable
	
		boolean esPrimerIngreso = true;  

		
			for (int i = 0; i < diasRegistro; i++ ) {
		           
		            System.out.println("Ingrese la temperatura en el dia " + (i + 1) + " : ");
		                        
		            temp = entrada.nextFloat();
		            sumaTemp += temp;  // ← acumulamos
		
		            if (esPrimerIngreso) {
		            
		                tempMax = temp; 
		                tempMin = temp; 
		                esPrimerIngreso = false; 
		            }
		
		            if (temp > tempMax) {
		                tempMax = temp;
		            }
		
		            if (temp < tempMin) {
		                tempMin = temp;
		            }
	        }
				
		double promedio = (double) sumaTemp / diasRegistro;
		
		System.out.println("-----------------------------------------------");
		System.out.println("Días registrados: " + diasRegistro );
		System.out.println("Temperatura promedio: " + promedio );
		System.out.println("Récord de calor: " + tempMax );
		
	}

}
