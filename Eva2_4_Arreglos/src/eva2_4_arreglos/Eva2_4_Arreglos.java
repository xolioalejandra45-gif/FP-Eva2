package eva2_4_arreglos;

public class Eva2_4_Arreglos {

    public static void main(String[] args) {
        int arreglo[] = new int[5];//identificador de tipo arreglo, 5 x 4 bytes = 20 bytes
//        primer elemento del arreglo es la posicion 0, el ultimo elemento --> tamano = -1
        arreglo [0] = 100;
        arreglo [1] = 200;
        arreglo [2] = 300;
        arreglo [3] = 400;
        arreglo [4] = 500;
        System.out.println("arreglo [0] = " + arreglo [0]);
        System.out.println("arreglo [1] = " + arreglo [1]);
        System.out.println("arreglo [2] = " + arreglo [2]);
        System.out.println("arreglo [3] = " + arreglo [3]);
        System.out.println("arreglo [4] = " + arreglo [4]);
    }
    
}
