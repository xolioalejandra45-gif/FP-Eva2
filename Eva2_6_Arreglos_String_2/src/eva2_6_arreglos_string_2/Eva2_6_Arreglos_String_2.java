package eva2_6_arreglos_string_2;

import java.util.Scanner;

public class Eva2_6_Arreglos_String_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        System.out.println("Introduce el día en número (0 - 6)");
        dia = input.nextInt();
        System.out.println("El día es " + diasSemana[dia]);
    }
    
}
