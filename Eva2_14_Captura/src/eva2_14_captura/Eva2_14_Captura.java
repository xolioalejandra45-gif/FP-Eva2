package eva2_14_captura;

import java.util.Scanner;

public class Eva2_14_Captura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam, i;
        int suma = 0; // si es + - empieza en 0, y si es * / empiza en 1
        double promedio;
        
        System.out.println("¿Cuántas calificaciones va a capturar?");
        tam = input.nextInt();
        
        int califas[] = new int[tam];
//        Capturar
        for(i = 0; i < califas.length; i++){
            System.out.println("Calificación " + (i + 1) + ":"); //impresión i+1, no le afecta al for
            califas[i] = input.nextInt();
        }
//        Leer
        for(i = 0; i < califas.length; i++){
            System.out.print("[" + califas[i] + "]"); //impresión i+1, no le afecta al for
        }
//        Sumar las califas
        for(i = 0; i < califas.length; i++){
            suma = suma + califas[i];
            // suma += califas[1]
        }
                         //conversión
        promedio = suma /(double) tam;
        System.out.println("Promedio = " + promedio);
    }
    
}
