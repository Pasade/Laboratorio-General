public class Escuderia{
    private String nombreEscuderia;
    private Vuelta coche1;
    private Vuelta coche2;

    //Creamos el constructor que va a recibir los objetos de la clase Vuelta en el Main
    public Escuderia(String nombreEscuderia, Vuelta coche1, Vuelta coche2){
        setNombreEscuderia(nombreEscuderia);
        this.coche1 = coche1;
        this.coche2 = coche2;
    }

    //Creamos el Setter y Getter para el nombre de escudería
    public String getNombreEscuderia(){return this.nombreEscuderia;}
    public void setNombreEscuderia(String nuevoNombreEscuderia){
        this.nombreEscuderia = nuevoNombreEscuderia;
    }

    //Creamos la función para comparar entre los dos coches cual es el mas rapido
    public Vuelta obtenerVueltaMasRapida(){
        if(this.coche1.getTiempoSegundos() < this.coche2.getTiempoSegundos()){
            return this.coche1;
        }
        else{
            return this.coche2;
        }
    }
}