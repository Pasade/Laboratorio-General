public class Main{
    public static void main(String[] args){

        //Declaramos una matriz las columnas son vueltas, las filas son coches
        int[][] desgatseEquipo = {
        {12, 25}, //Coche 1
        {15, 30} //Coche 2
        };

        //Mostramos por pantalla el desgaste del coche 1 en la vuelta dos
        System.out.printf("Desgaste del coche 1 en la segunda vuelta: %d\n", desgatseEquipo[0][1]);

        //Mostramos por pantalla el desgaste del coche 2 en la vuelta 1
        System.out.printf("Desgaste del coche 2 en la primera vuelta: %d\n", desgatseEquipo[1][0]);

        //Moficamos el desgaste del coche 2 en la vuelta 2
        desgatseEquipo[1][1] = 45;

        //Mostramos por pantalla el dato modificado (Coche 2 vuelta 2)
        System.out.printf("⚠️ Actualización Boxes: El desgaste del Coche 2 en la Vuelta 2 ha subido al: %d%%\n", desgatseEquipo[1][1]);
    }
}