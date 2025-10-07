package eva2_12_tabla_multiplicar;

import java.util.Scanner;

public class Eva2_12_Tabla_Multiplicar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int tabla, resultado;
        
        System.out.println("Número que desea conocer la tabla de multiplicar");
            tabla = input.nextInt();
            for(i = 1; i <= 10; i++){
            resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
        }
    }
    
}
