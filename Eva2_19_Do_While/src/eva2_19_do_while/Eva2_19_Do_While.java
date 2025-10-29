package eva2_19_do_while;

import java.util.Scanner;

public class Eva2_19_Do_While {
    
    final static String USUARIO = "Alejandra";
    final static String PWD = "2412";
    
    public static void main(String[] args) {
        String usu, contra;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Usuario:");
            usu = input.nextLine();
            System.out.println("Contraseña:");
            contra = input.nextLine();
            
        }while(!(usu.equals(USUARIO)&& contra.equals(PWD))); //! negamos primero, y al negarse, 
//        se repite si los datos que introduce el usuario no son iguales 
            System.out.println("Acceso concedido");
    }
    
}
