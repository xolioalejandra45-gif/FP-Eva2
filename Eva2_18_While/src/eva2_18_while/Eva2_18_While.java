package eva2_18_while;

public class Eva2_18_While {

    public static void main(String[] args) {
//        simular un for con while
        int i=1;
        System.out.println("Ciclo While");
        while(i <= 10){//se repite si la condicion es verdad
            System.out.println("Hola");
            i++;
        }
        System.out.println("Cliclo Do While");
//        simular un for con do while
        i=1;
        do{
            System.out.println("Hola");
            i++;
        }while(i <= 10);
    }
    
}
