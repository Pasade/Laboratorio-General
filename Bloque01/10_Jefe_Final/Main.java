import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        //Declaramos las variables
        int vueltaActual = 1;
        double combustible = 30.0;
        double desgteNeumaticos = 0.0;
        Scanner teclado = new Scanner(System.in);

        //Bucle principal que definira si el coche puede continar dependiendo del combustible y el desgaste de los neumáticos
        do{
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Continuar rodando a ritmo normal");
            System.out.println("2. Atacar");
            System.out.println("3. Entrar a Boxes");

            int decision = teclado.nextInt();
            teclado.nextLine();

            switch(decision){
                case 1: 
                    combustible -= 4.0;
                    desgteNeumaticos += 10.0;
                    vueltaActual++;
                break;

                case 2:
                    combustible -= 7.0;
                    desgteNeumaticos += 22.0;
                    vueltaActual++;
                break;

                case 3:
                    combustible = 30.0;
                    desgteNeumaticos = 0.0;
                    System.out.println("¡Parada perfecta! Coche como nuevo. Volvemos a pista.");
                break;

                default:
                    System.out.println("¡Te has salido de la pista por no elegir una opción válida!");
            }    

            System.out.printf("Vuelta: %d | Combustible: %.1f L | Desgaste: %.1f%%%n", vueltaActual, combustible, desgteNeumaticos);     


         } while(combustible > 0 && desgteNeumaticos < 100);

         if(combustible <= 0){
            System.out.println("💀 ¡FIN DE CARRERA! Te has quedado sin gasolina en mitad de la pista.");
         }
         else if(desgteNeumaticos >= 100){
            System.out.println("💥 ¡ACCIDENTE! Un neumático ha reventado por estirar demasiado la vida útil.");
         }

        }
        
    }
