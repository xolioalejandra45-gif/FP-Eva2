package eva2_21_break;
import java.util.Scanner;

public class Eva2_21_Break {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, adivinar;
        
        adivinar = (int)(Math.random()* 5) +1;
        while(true){
            System.out.println("Adivinar el número. -1 para terminar");
            valor = input.nextInt();
            if (valor == adivinar){
                System.out.println("Felicidades, adivinaste");
            break;
            }
            if(valor == -1)
                break; // Termina por completo el ciclo
        }
        System.out.println("Gracias por jugar");
    }
    
}
