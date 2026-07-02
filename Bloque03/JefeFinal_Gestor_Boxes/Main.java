public class Main{
    
    public static void main(String[] args){
        Neumatico neumaticoDerechoC1 = new Neumatico("Blando", 80);
        Neumatico neumaticoIzquierdoC1 = new Neumatico("Blando", 85);
        PitStop piloto1 = new PitStop("alonso", neumaticoDerechoC1, neumaticoIzquierdoC1);

        piloto1.esParadaSegura();
        if (piloto1.esParadaSegura()) {
            System.out.printf("🟢 Pit Stop aprobado para %s. ¡A pista!%n", "alonso");
        } else {
        System.out.printf("❌ Pit Stop RECHAZADO para %s. Riesgo de pinchazo.%n", "alonso");
        }

        Neumatico neumaticoDerechoC2 = new Neumatico("Duro", 35);
        Neumatico neumaticoIzquierdoC2 = new Neumatico("Duro", -10);
        PitStop piloto2 = new PitStop("Verstappen", neumaticoDerechoC2, neumaticoIzquierdoC2);

        piloto2.esParadaSegura();    
        if (piloto2.esParadaSegura()) {
            System.out.printf("🟢 Pit Stop aprobado para %s. ¡A pista!%n", "alonso");
        } else {
            System.out.printf("❌ Pit Stop RECHAZADO para %s. Riesgo de pinchazo.%n", "alonso");
        }    

    }
}