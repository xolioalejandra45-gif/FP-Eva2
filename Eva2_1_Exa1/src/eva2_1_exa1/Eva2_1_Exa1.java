package eva2_1_exa1;

import java.util.Scanner;

public class Eva2_1_Exa1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin, opc, monto, retiro, deposito, montodepo;
        int saldo = 5000;
         System.out.println("Introduce el pin: ");
         pin = input.nextInt();
         if(pin == 1234){
             System.out.println("1. Consultar saldo");
             System.out.println("2. Retirar monto");
             System.out.println("3. Depositar monto");
             opc = input.nextInt();
             if(opc == 1){
                 System.out.println("Tu saldo es de " + saldo);
             }else if(opc == 2){
                 System.out.println("Monto que desea retirar");
                 monto = input.nextInt();
                 if(monto <= saldo){
                     System.out.println("Retiro exitoso");
                     retiro = saldo - monto;
                     System.out.println("Tu saldo es de " + retiro);
                 }else{
                     System.out.println("No se puede hacer el retiro");
                 }
             }else if(opc == 3){
                 System.out.println("Monto que desea depositar");
                 deposito = input.nextInt();
                 if(deposito >= 0){
                     System.out.println("Retiro exitoso");
                     montodepo = saldo + deposito;
                 System.out.println("Tu saldo es de " + montodepo );
                 }else{
                  System.out.println("No se permiten numeros negativos");
                }
             }
        }else{
             System.out.println("Acceso denegado");
         }
    }
    
}
