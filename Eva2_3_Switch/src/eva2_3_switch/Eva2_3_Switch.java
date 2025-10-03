package eva2_3_switch;

public class Eva2_3_Switch {

    public static void main(String[] args) {
        String cade = "Lunes";
        switch(cade){
            case "Lunes" :
                System.out.println(1);
                break;
            case "Martes" :
                System.out.println(2);
                break;
            default:
                System.out.println("Día no existente");
        } 
    }
    
}
