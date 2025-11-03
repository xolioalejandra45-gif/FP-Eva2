package eva2_28_primo;

import java.util.Scanner;

public class Eva2_28_Primo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, divisor = 0, i;
        
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        
        for(i = 1; i <= num; i++){
            if(num % i == 0){
            divisor++;
            }
        }
        
        if(divisor == 2){
            System.out.println(num + " es un número primo");
        }else{
            System.out.println(num + " no es un número primo");
        }
    }
    
}
