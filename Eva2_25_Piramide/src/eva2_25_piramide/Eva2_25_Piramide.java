package eva2_25_piramide;

import java.util.Scanner;

public class Eva2_25_Piramide {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int valor, i, j,a ,b;
        
        System.out.println("PIRAMIDE");
        System.out.println("Introduce un valor:");
        valor = input.nextInt();
        
        for(i = 1; i<= valor; i++){
            for(j = 1; j<= i; j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(i = valor; i >= 1; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
