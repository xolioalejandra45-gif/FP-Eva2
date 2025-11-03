package eva2_27_cuenta;

import java.util.Scanner;

public class Eva2_27_Cuenta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo= 1000000;
        double retiro;
        
        System.out.println("Tú saldo inicial es: $" + saldo);
        
        while(saldo > 0){
            System.out.println("¿Cuánto deseas retirar?");
            retiro = input.nextDouble();
            
            saldo -= retiro;
            
            if(saldo > 0){
                System.out.println("Retiro exitoso. Su saldo restante es de: $" + saldo);
            }else if(saldo == 0){
                System.out.println("Tú cuenta se ha agotado. Saldo: $0");
            }else{
                System.out.println("Sú saldo está en número rojos. Has sobregirado tu cuenta en $" + (-saldo));
            }
        }
    }
    
}
