package eva2_23_busqueda;

import java.util.Scanner;

public class Eva2_23_Busqueda {

    public static void main(String[] args) {
        int datos[] = new int[10];
        Scanner input = new Scanner(System.in);
        int valor, posi = -1; //-1 significa que no lo encontraste
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
        System.out.println("");
        System.out.println("Valor a buscar: ");
        valor = input.nextInt();
        
//        Busqueda lineal
        for (int i = 0; i < datos.length; i++) {
            if(valor == datos[i]){
                posi = i; //regresamos donde lo encontramos
                break; // detuvo la busqueda (detiene el ciclo)
            }
        }
        System.out.println("Posición: " + posi);
    }
    
}
