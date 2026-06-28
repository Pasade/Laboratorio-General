public class Main{
    
    public static void main(String[] args){
        //Declaramos una variable local que guarda el record
        double recordPista = 85.5;

        //Creamos dos objetos a partir de la clase Vuelta
        Vuelta V1 = new Vuelta(1, 89.2);
        Vuelta V2 = new Vuelta(2, 84.1);

        AnaizadorCompeticion.verificarRecord(V1, recordPista);
        AnaizadorCompeticion.verificarRecord(V2, recordPista);

    }
}