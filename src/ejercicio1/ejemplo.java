package ejercicio1;

import java.util.Scanner;

public class ejemplo {

    public static void main(String args[]) {

        // Creamos un objeto Scanner para poder leer las entradas del usuario
        Scanner lectura = new Scanner(System.in);

        // Declaramos las variables necesarias:
        // temp` será para guardar la temperatura ingresada en cada iteración del bucle.
        //`tempMax` y `tempMin` guardarán respectivamente la temperatura máxima y mínima.
        // Al principio, asignamos un valor de 0 para ambas, ya que el primer valor ingresado será utilizado para inicializarlos.
        float temp, tempMax = 0, tempMin = 0;


        boolean esPrimerIngreso = true;  

       
        for (int hora = 0; hora <= 24; hora += 4) {
           
            System.out.println("Ingrese la temperatura a las " + hora + "hs: ");
            
            
            temp = lectura.nextFloat(); 

         
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

        // Una vez que terminamos de ingresar todas las temperaturas, mostramos los resultados:
        // Mostramos el valor más bajo registrado (temperatura mínima)
        System.out.println("El número mínimo es: " + tempMin);
        
        // Mostramos el valor más alto registrado (temperatura máxima)
        System.out.println("El número máximo es: " + tempMax);
    }
}