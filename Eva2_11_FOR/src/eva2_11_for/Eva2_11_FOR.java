package eva2_11_for;

import java.util.Scanner;

public class Eva2_11_FOR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, resi;
        int rep1, rep2;
        
        System.out.println("Número desde el que desea comenzar:");
            rep1 = input.nextInt();
        System.out.println("Número al que desea llegar:");
            rep2 = input.nextInt();
        System.out.println("");
        for (i = rep1; i <= rep2; i++ ){
            resi = i % 2; //Saber si es número es par
            if(resi == 0)
                System.out.print(i + " , ");
        }
    }
    
}
