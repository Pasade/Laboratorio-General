public class Neumatico{

    private String compuesto;
    private int vidaUtilPorcentaje;

    //Constructor
    public Neumatico(String compuesto, int vidaUtilPorcentaje){
        setCompuesto(compuesto);
        setVidaUtilPorcentaje(vidaUtilPorcentaje);
    }

    //Getter y setter para Compuesto
    public String getCompuesto(){
        return this.compuesto;
    }
    public void setCompuesto(String nuevoCompuesto){
        this.compuesto = nuevoCompuesto;            
    }

    //Gettery Setter para vidaUtilPorcentaje
    public int getVidaUtilPorcentaje(){
        return this.vidaUtilPorcentaje;
    }
    public void setVidaUtilPorcentaje(int nuevaVidaUtilPorcentaje){
        if(nuevaVidaUtilPorcentaje < 0 || nuevaVidaUtilPorcentaje > 100){
            this.vidaUtilPorcentaje = 0;
            System.out.println("⚠️ Alerta: Porcentaje de vida inválido. Configurado en 0%.");
        }
        else{
            this.vidaUtilPorcentaje = nuevaVidaUtilPorcentaje;
        }
    }



}