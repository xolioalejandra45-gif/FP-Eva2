package eva2_22_continue;

public class Eva2_22_Continue {

    public static void main(String[] args) {
        int i = 0;
        int residuo;
        
        while(i < 100){
            residuo = i % 2;
            if(residuo != 0){ //no es divisible entre dos
                i++;
                continue; //interrumpe la repetición actual
            }
            System.out.print(i + " - ");
            i++;
        }
    }
    
}
