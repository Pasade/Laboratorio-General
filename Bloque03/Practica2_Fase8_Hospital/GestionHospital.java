import java.util.ArrayList;
import java.util.List;

public class GestionHospital{
    
    public static void main(String[] args){

        //Creamos en Array dinámico y los objetos paciente
        ArrayList<Paciente> listaDeIngresos = new ArrayList<>();
        Paciente paciente1 = new Paciente("Luis", 34, "Diarrea");
        Paciente paciente2 = new Paciente("María", 76, "Fractura de cadera");
        Paciente paciente3 = new Paciente("Aristóteles", 234, "Migraña");

        //Agregamos los pacientes a la lista
        listaDeIngresos.addAll(List.of(paciente1, paciente2, paciente3));

        //Mostramos cuantos pacientes hay en total
        System.out.println("Hoy hay un total de " + listaDeIngresos.size() + " pacientes");

        //Mostramos la ficha de todos los pacientes
        for(Paciente p : listaDeIngresos){
            p.mostrarFicha();
        }

        //Creamos una condicion para que muestre un mensaje sin los pacientes tienen mas de 65 años
        for(Paciente p : listaDeIngresos){
            if(p.getEdad() > 65){
                System.out.printf("⚠️ ¡ALERTA DE RIESGO! El paciente %s requiere atención prioritaria por edad (%d años).\n", p.getNombre(), p.getEdad());
            }        
        }

        //Damos de baja al paciente Luis y lo mostramos por pantalla
        listaDeIngresos.remove(0);
        System.out.printf("El paciente %s ha sido dado de alta\n", paciente1.getNombre());

        //Volvemos a mostrar cuantos pacientes hay en la lista
        System.out.println("Hoy hay un total de " + listaDeIngresos.size() + " pacientes");
    }
}