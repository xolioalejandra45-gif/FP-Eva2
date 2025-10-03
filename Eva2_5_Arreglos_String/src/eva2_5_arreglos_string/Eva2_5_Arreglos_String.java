package eva2_5_arreglos_string;

import java.util.Scanner;

public class Eva2_5_Arreglos_String {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        String diaSemana[] = new String [7];
        diaSemana[0] = "Domingo";
        diaSemana[1] = "Lunes";
        diaSemana[2] = "Martes";
        diaSemana[3] = "Miercoles";
        diaSemana[4] = "Jueves";
        diaSemana[5] = "Viernes";
        diaSemana[6] = "Sabado";
        System.out.println("Introduce el día en número (0 - 6)");
        dia = input.nextInt();
        System.out.println("El día es " + diaSemana[dia]);
    }
    
}
