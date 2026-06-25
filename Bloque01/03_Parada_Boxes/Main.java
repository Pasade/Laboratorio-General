public class Main{
    public static void main(String[] args){
    // Declaramos las variables
    double tiempoBase = 82.0;
    double desgasteNeumatico = 0.15;
    double pitStop = 23.5;

    //Imprimimos tiempo de primera vuelta
    System.out.println("Tiempo de vuelta 1: " + tiempoBase);

    //Imprimimos tiempo de segunda vuelta (teniendo en cuenta el desgaste de los neumatico)
    System.out.printf("Tiempo de vuelta 2: %.2f\n",  tiempoBase += desgasteNeumatico);

    //Imprimimos tiempo de tercera vuelta (teniendo en cuenta el desgaste de los neumatico, y la vuelta anterior)
    System.out.printf("Tiempo de vuelta 3: %.2f\n",  tiempoBase += ++desgasteNeumatico);

    //Imprimimos tiempo de cuarta vuelta (teniendo en cuenta la parada en boxes y el cambio de neumaticos)
    System.out.printf("Tiempo de vuelta 4: %.2f\n",  tiempoBase += --desgasteNeumatico + pitStop);
    }
}