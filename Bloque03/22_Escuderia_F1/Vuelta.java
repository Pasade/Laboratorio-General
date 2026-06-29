//Creamos la clase Vuelta
public class Vuelta{
    //Declaramos las variables privadas de la clase
    private int numeroVuelta;
    private double tiempoSegundos;

    //Creamos el constructor
    public Vuelta(int numeroVuelta, double tiempoSegundos){
        setNumeroVuelta(numeroVuelta);
        setTiempoSegundos(tiempoSegundos);
    }

    //Creamos los getters
    public int getNumeroVuelta(){return this.numeroVuelta;}
    public double getTiempoSegundos(){return this.tiempoSegundos;}

    //Creamos los setters
    public void setNumeroVuelta(int nuevoNumeroVuelta){
        this.numeroVuelta = nuevoNumeroVuelta;
    }
    public void setTiempoSegundos(double nuevoTiempoSegundos){
        this.tiempoSegundos = nuevoTiempoSegundos;
    }

    //Método para mostar la vuelta y los segundos
    public void mostrarVuelta(){
        System.out.printf("Vuelta %d Tiempo de la vuelta %.2f\n", numeroVuelta, tiempoSegundos);
    }
}