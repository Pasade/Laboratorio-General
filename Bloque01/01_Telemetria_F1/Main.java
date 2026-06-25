public class Main {
    
    public static void main(String[] args) {
        //Declaramos las variables
        String nombre = "Fernando Alonso";
        double velMax = 342.5;
        double tiempoVuelta = 84.32;
        double consumoCombustibeVuelta = 2.15;
        double combustibleRestante = 45.0;

        //Calculamos los minutos
        double tiempoMinutos = tiempoVuelta / 60;
        //Pasamos el numero a entero para evitar decimales
        int tiempoMinutosInt = (int) tiempoMinutos;
        
        //Calculamos los segundos con el resto de la división
        double tiempoSegundos = tiempoVuelta % 60;
        //Pasamos el numero a entero para evitar decimales
        int tiempoSegundosInt = (int) tiempoSegundos;

        //Ahora calculamos cuantas vueltas podemos dar con el combustible que nos queda
        double vueltasRestantes = combustibleRestante / consumoCombustibeVuelta;
        //Tambien lo convertimos a INT pq no queremos quedarnos a mitad de una vuelta
        int vueltasRestantesInt = (int) vueltasRestantes;

        System.out.printf("Tiempo total de la vuelta: %d Min, %d Seg.%n", tiempoMinutosInt, tiempoSegundosInt);
        System.out.printf("Te queda combustible para %d vueltas.%n", vueltasRestantesInt);
    }

}