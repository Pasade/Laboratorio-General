public class Main{

    public static void main(String[] args){
        //Declaramos las variables
        double tempNeumatico = 60.0;
        double tempOptima = 90.0;

        do{
            tempNeumatico += 10.0;
            System.out.printf("Calentando manta... Temperatura actual: %.1f°C%n", tempNeumatico);
        }
        while(tempNeumatico < tempOptima);

        System.out.println("¡NEUMÁTICOS EN TEMPERATURA! Listos para salir a pista.");


    }
}