public class Main{

    public static void main(String[] args){
       //Declaramos las variables
       double combustibleInicial = 25.0;
       double consumoVuelta = 3.5;
       double reserva = 5.0;
       int contadorVueltas = 0;

       while(combustibleInicial >= reserva){
        combustibleInicial -= consumoVuelta;
        contadorVueltas++;
        System.out.printf("Vuelta: %d - Combustible restante: %.2f Litros%n", contadorVueltas, combustibleInicial);
       }      
         System.out.println("¡ALERTA BOXES! Combustible crítico. Entrar en la siguiente vuelta.");

    }
}