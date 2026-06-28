public class Main{

    public static void main(String[] args){

        //Usamos la calse creada Empleado para crear un nuevo objeto

        Empleado E1 = new Empleado("Gago", "Desarrollador Java", 1800.0);

        E1.mostrarDetalles();

        E1.setSalario(600.0);

        E1.mostrarDetalles();


    }
}