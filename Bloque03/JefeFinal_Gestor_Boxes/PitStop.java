public class PitStop{
    private String piloto;
    private Neumatico neumaticoDerecho;
    private Neumatico neumaticoIzquierdo;

    public PitStop(String piloto, Neumatico neumaticoDerecho, Neumatico neumaticoIzquierdo){
        setPiloto(piloto);
        this.neumaticoDerecho = neumaticoDerecho;
        this.neumaticoIzquierdo = neumaticoIzquierdo;
    }

    public void setPiloto(String nuevoPiloto){
        this.piloto = nuevoPiloto;
    }

    public boolean esParadaSegura(){
        if(this.neumaticoDerecho.getVidaUtilPorcentaje() <= 40 || this.neumaticoIzquierdo.getVidaUtilPorcentaje() <= 40){
            return false;
        }
        else{
            return true;
        }
    }
}