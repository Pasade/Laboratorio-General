//Creamos la clase AnalizadorCompeticion
public class AnaizadorCompeticion{
    //Creamos un metodo para verificar si existe un record
    public static void verificarRecord(Vuelta vueltaObjeto, double tiempoRecord){
        //Obtenemos el valor de los segundos de la vuelta del objeto que creeemos a partir de la calse Vuelta
        double diferenciaTiempo = tiempoRecord - vueltaObjeto.getTiempoSegundos();

        //Comparamos si el tiempo recibido es menor que el record de la pista(la variable record de pista estará insranciada en el Main)
        if(vueltaObjeto.getTiempoSegundos() < tiempoRecord){
            System.out.printf("⏱️ ¡NUEVO RÉCORD! La vuelta %d ha rebajado el tiempo límite por %.2f segundos.%n", vueltaObjeto.getNumeroVuelta(), diferenciaTiempo);
        }
        else{
            System.out.printf("❌ Vuelta %d completada, pero no supera el récord actual.%n", vueltaObjeto.getNumeroVuelta(), tiempoRecord);
        }
    }
}