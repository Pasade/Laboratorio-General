public class Main{
    public static void main(String[] args){

        //Declaramos la matriz
        int[][] telemetriaNeumaticos = {
            {20, 45, 65, 82}, //Coche 1
            {15, 35, 78, 90}, //Coche 2
            {30, 60, 85, 95}
        };
        System.out.println("--- ALERTA DE DESGASTE CRÍTICO (>80%) ---");
        //Creamos dos bucles for anidados para que recorra toda la matriz, el primero recorre las filas mientras que el segundo recorre las columnas
        for (int i = 0; i < 3; i++ ){
            for(int j= 0; j < 4; j++){
                if(telemetriaNeumaticos[i][j] > 80){
                    System.out.printf("Se ha detectado riesgo de desgaste en el coche %d durante la vuelta %d \n", (i + 1), (j + 1));
                }
            }
        }
    
    }
}