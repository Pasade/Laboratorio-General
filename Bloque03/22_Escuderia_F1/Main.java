public class Main{
    
    public static void main(String[] args){

        Vuelta vHamilton = new Vuelta(14, 83.2);
        Vuelta vRussel = new Vuelta(12, 84.5);

        Escuderia mercedes = new Escuderia("Mercedes", vHamilton, vRussel);

        Vuelta masRapida = mercedes.obtenerVueltaMasRapida();

        System.out.println("El coche más rápido de la escudería ha sido:");

        masRapida.mostrarVuelta();

    }
}