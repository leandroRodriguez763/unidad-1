package ejercicio1;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos partidos se han jugado? ");
        int cantPartidos = entrada.nextInt();

        int totalGoles = 0;

        for (int i = 0; i < cantPartidos; i++) {
            System.out.print("Goles en el partido " + (i + 1) + ": ");
            int goles = entrada.nextInt();
            totalGoles += goles;
        }

        double promedio = (double) totalGoles / cantPartidos;
        
        System.out.println("--------------------------");
        System.out.println("Goles totales: " + totalGoles);
        System.out.println("Promedio de goles por partido: " + promedio);

        entrada.close();
    }
}