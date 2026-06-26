public class Main{
    public static void main(String[] args){

        //Declaramos el array
        double[][] tiempoGrid = {
            {72.5, 71.9, 72.1}, // Piloto 1
            {73.1, 72.8, 73.0} // Piloto 2
        };

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("🏎️ Piloto %d | Vuelta %d: %.1f s%n", (i +1), (j +1), tiempoGrid[i][j]);
            }
        }

    }
}