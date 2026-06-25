public class Main{
    public static void main(String[] args){
        //Declaramos las variables
        double humedadAsfalto = 65.5;
        double temperaturaPista = 14.0;

        if(humedadAsfalto > 50){
            if(temperaturaPista < 15){
                System.out.println("Lluvia Extrema (Wets)");
            }
            else if(temperaturaPista >= 15){
                System.out.println("Intermedio (Intermediates)");
            }
        }
        else{
            if(temperaturaPista > 30){
                System.out.println("Compuesto Duro (Hard)");
            }
            else if(temperaturaPista >= 15 && temperaturaPista =< 30){
                System.out.println("Compuesto Medio (Medium)");
            }
            else if(temperaturaPista < 15){
                System.out.println("Compuesto Blando (Soft)");
            }
        }
    }
}