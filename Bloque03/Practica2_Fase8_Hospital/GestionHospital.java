import java.util.ArrayList;
import java.util.List;

public class GestionHospital{
    
    public static void main(String[] args){

        ArrayList<Paciente> listaDeIngresos = new ArrayList<>();
        Paciente paciente1 = new Paciente("Luis", 34, "Diarrea");
        Paciente paciente2 = new Paciente("María", 76, "Fractura de cadera");
        Paciente paciente3 = new Paciente("Aristóteles", 234, "Migraña");

        listaDeIngresos.addAll(List.of(paciente1, paciente2, paciente3));

        System.out.println("Hoy hay un total de " + listaDeIngresos.size() + " pacientes");

        for(Paciente p : listaDeIngresos){
            p.mostrarFicha();
        }
    }
}