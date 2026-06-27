public class Main{
    public static void main(String[] args){

        //Declaramos la matriz
        double [][] tiemposCarrera = {
            {72.5, 71.8, 73.2}, //Coche 1
            {73.1, 72.0, 71.5}, //Coche 2
            {71.9, 74.1, 72.8}
        };

        //Declaramos variable para comparar los tiempos
        double tiempoGanador = 999.9;

        //Declaramos otra variable para indicar el coche ganador
        int cocheGanador = 0;

        //Creamos docs bucles anidados para poder recorrer toda la matriz, en el primer bucle los coches, en el segundo las vueltas
        for(int i = 0; i < 3; i++){
            //Creamos un acumulador, contendrá la suma de los tiempos de cada coche en cada iteración
            double tiempoTotalCoche = 0;
            for(int j = 0; j < 3; j++){
                
                tiempoTotalCoche += tiemposCarrera[i][j];
                
            }
                //Comparamos sie el tiempo total del coche es menor que el establecido para la copración, en caso positivo se lo asignamos a la variable tiempoGanador
                if (tiempoTotalCoche < tiempoGanador){
                    tiempoGanador = tiempoTotalCoche;
                    cocheGanador = (i);
                }

            //Imprimimos el tiempo del cada coche
            System.out.printf("Coche %d - Tiempo Total: %.2fs%n", (i + 1), tiempoTotalCoche);
            
        }

        System.out.printf("🏆 ¡VICTORIA! El Coche %d gana el Gran Premio con un tiempo total de %.2fs\n", (cocheGanador +1), tiempoGanador);
    
    }
}