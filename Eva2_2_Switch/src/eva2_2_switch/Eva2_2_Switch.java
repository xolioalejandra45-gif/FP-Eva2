package eva2_2_switch;

import java.util.Scanner;

public class Eva2_2_Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc;
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar monto");
        System.out.println("3. Depositar monto");
        System.out.println("Selecciona una opción del menú");
        opc = input.nextInt();
        switch(opc){
            case 1:
                System.out.println("Elegiste imprimir saldo");
                break; //rompe o detiene la instruccion
            case 2: 
                System.out.println("Elegiste retirar saldo");
                break;
            case 3:
                System.out.println("Elegiste depositar");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
    
}
