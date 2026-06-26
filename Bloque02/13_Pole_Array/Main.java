//Importamos la clase Scanner
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    //Declaramos el array
    double[] tiemposQ3 = {73.5, 72.2, 74.1, 71.9, 72.8};

    //Declaramos otra variable, para poder comparar el resto de tiempos con el primero del array
    double tiempoMasRapido = tiemposQ3[0];

    //Declaramos otra variable para que guarde el indice del coche más rápido
    int cocheMasRapido = 0;

    //Creamos un bucle for para recorrer el array y obtener el mejor tiempo
    //Empieza en 1 pq ya tenemos el valor de la posicion 0 en la variable tiempoMasRapido
    for(int i = 1; i < tiemposQ3.length; i++){
        if(tiemposQ3[i] < tiempoMasRapido){
            tiempoMasRapido = tiemposQ3[i];
            cocheMasRapido = i;
        }
    } 
    //Para la salida de cara el usuario sumamos + 1 a cocheMasRapido para que nunca pueda ser 0 el coche mas rapido
    System.out.printf("🏎️ ¡POLE POSITION! El coche número %d se lleva la pole con un tiempo de %.3f segundos.%n", (cocheMasRapido + 1), tiempoMasRapido);



    }
}