public class Main{

    public static void main(String[] args){
       //Declaramos un array
       double [] tiempos = {72.4, 72.8, 73.1, 74.0};

       //Imprimimos el tiempo del primer coche
       System.out.printf("Tiempo del primer coche: %.2f\n", tiempos[0]);

       //Imprimimos el tiempo del tercer coche
       System.out.printf("Tiempo del primer coche: %.2f\n", tiempos[2]);

       //Modificamos el tiempo del segundo coche
       tiempos[1] = 72.1;
       System.out.printf("Vueltamejorada para el coche 2: %.2f\n", tiempos[1]);



    }
}