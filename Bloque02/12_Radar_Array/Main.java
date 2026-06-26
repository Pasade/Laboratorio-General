//Importamos la clase Scanner
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //Creamos el objeto teclado
        Scanner teclado = new Scanner(System.in);
        //Declaramos in array vacio con tres espacios
        int[] velocidades = new int[3];

        //Creamos un bucle for para que el usuario introduzca los valores para el array
        for(int i = 0; i < velocidades.length; i++){
        System.out.println("Introduce la velocidades de la medición: " + (i +1));
        velocidades[i] = teclado.nextInt();
        teclado.nextLine();
        }

        //Creamos otro bucle for para que recorra el Array y muestre la información almacenada
        for(int i = 0; i < velocidades.length; i++){
            System.out.println("Medición " + (i + 1) + ": " + velocidades[i] + " km/h");
        }
        

    }
}