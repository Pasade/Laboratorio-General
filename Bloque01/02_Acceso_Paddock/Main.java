public class Main{
    public static void main(String[] args){
        //Declaramos las variables
        String nombre = "Carlos Sainz";
        char pase = 'P';
        boolean credencial = true;
        boolean sancion = false;

        //Creamos la condición
        boolean puedeEntrarAlPaddock = (pase == 'P' || pase == 'V') && !sancion;

        boolean puedeEntrarAlPitLane = (puedeEntrarAlPaddock && credencial);

        System.out.println("¿Puede entrar al Paddock?: " + puedeEntrarAlPaddock);
        System.out.println("¿Puede entrar al Pit Lane?: " + puedeEntrarAlPitLane);

    
    }
}