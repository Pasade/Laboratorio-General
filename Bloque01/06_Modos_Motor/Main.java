import java.util.Scanner;

public class Main{

    public static void main(String[] args){
            
        //Creamos teclado para que el usuario pueda meter el dato
        Scanner teclado = new Scanner(System.in);
        //Declaramos las variable y pedimos al usuario que nos la diga
        System.out.println("Introduce el dial");
        int modoDial = teclado.nextInt();
        teclado.nextLine();


        //Condicional switch
        switch(modoDial){
            case 1:
                System.out.println("Modo Ahorro (Lean): Reducción de potencia, conservando gasolina.");
                break;
            case 2:
                System.out.println("Modo Carrera (Base): Equilibrio óptimo para carrera.");
                break;
            case 3:
                System.out.println("Modo Ataque (Overtake): Máxima potencia eléctrica para adelantamientos.");
                break;
            case 4:
                System.out.println("Modo Clasificación (Qualy): Todo al mapa extremo. Desgaste máximo.");
                break;
            default:
                System.out.println("Dial erróneo. Configuración de motor por defecto.");
        }
    }
}