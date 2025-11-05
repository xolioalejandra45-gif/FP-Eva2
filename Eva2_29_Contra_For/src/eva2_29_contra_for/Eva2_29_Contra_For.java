package eva2_29_contra_for;

import java.util.Scanner;

public class Eva2_29_Contra_For {
    
    final static String USUARIO = "Alejandra";
    final static String PWD = "2412";
    
    public static void main(String[] args) {
        String usu, contra;
        int i;
        Scanner input = new Scanner(System.in);
        
        for(i = 1; i<= 4; i++){
            System.out.println("Usuario:");
            usu = input.nextLine();
            System.out.println("Contraseña:");
            contra = input.nextLine();
            
            if(usu.equals(USUARIO)&& contra.equals(PWD)){
            System.out.println("Acceso Concedido");
            break;
        }
        }
        
    }
    
}
