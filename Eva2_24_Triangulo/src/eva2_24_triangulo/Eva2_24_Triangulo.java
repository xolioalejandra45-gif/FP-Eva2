package eva2_24_triangulo;

import java.util.Scanner;

public class Eva2_24_Triangulo {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int valor, i, j;
        
        System.out.println("TRIÁNGULO");
        System.out.println("Introduce un valor:");
        valor = input.nextInt();
        
        for(i = 1; i<= valor; i++){
            for(j = 1; j<= i; j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
