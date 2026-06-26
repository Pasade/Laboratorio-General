public class Main{
    public static void main(String[] args){
        //Declaramos las variables
        String colorBandera = "AMARILLA";

        if(colorBandera.equals("VERDE")){
            System.out.println("Pista libre. ¡Acelerar!");
        }
        else if(colorBandera.equals("AMARILLA")){
            System.out.println("Peligro en pista. Reducir velocidad y prohibido adelantar.");
        }
        else if(colorBandera.equals("ROJA")){
            System.out.println("Sesión suspendida. Todos los coches entran al Pit Lane inmediatamente.");
        }
        else if(colorBandera.equals("NEGRA")){
            System.out.println("Piloto descalificado. Entrada a boxes obligatoria.");
        }
        else{
            System.out.println("Bandera no reconocida. Consultar con el muro.");
        }

    }
}