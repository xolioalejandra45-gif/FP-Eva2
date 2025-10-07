package eva2_10_for;

import java.util.Scanner;

public class Eva2_10_FOR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int rep1, rep2;
        int tabla;
        
        for (i = 1; i <= 20; i++) {
            System.out.print(i + " - ");
        }
        System.out.println("");
        for (i = 0; i <= 100; i+= 2 ){
            System.out.print(i + " - ");
        }
        
//        100 a 0, de dos en dos
        System.out.println("");
        for (i = 100; i >= 0; i-= 2 ){
            System.out.print(i + " - ");
        }
        System.out.println("");
        
//        imprimir una lista de numeros entre cualquier valor que el usuario quiera : -15 y 5
        System.out.println("Número desde el que desea comenzar:");
                rep1 = input.nextInt();
        System.out.println("Número al que desea llegar:");
                rep2 = input.nextInt();
        System.out.println("");
        for (i = rep1; i <= rep2; i++ ){
            System.out.print(i + " , ");
        }
        System.out.println("");
        
//        en orden inverso
        for (i = rep2; i >= rep1; i-- ){
            System.out.print(i + " , ");
        }
        System.out.println("");

//        tabla de multiplicar del numero que desee el usuario (1 a 10)
        System.out.println("Número que desea conocer la tabla de multiplicar");
            tabla = input.nextInt();
        for(i = 1; i <= 10; i++){
            int resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
        }
    }
    
}
