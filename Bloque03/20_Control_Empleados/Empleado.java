//Creamos la calse empleado
public class Empleado{
    private String nombre;
    private String puesto;
    private double salario = 1000.0;

    //Creamos el constructor
    public Empleado(String nombre, String puesto, double salario){
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
    }

    //Creamos los Getters
    public String getNombre(){return this.nombre;}
    public String getPuesto(){return this.puesto;}
    public double getSalario(){return this.salario;}

    //Creamos los setters
    public void setNombre(String nuevoNombre){this.nombre = nuevoNombre;}
    public void setPuesto(String nuevoPuesto){this.puesto = nuevoPuesto;}
    public void setSalario(double nuevoSalario){
        if(nuevoSalario >= 1000){
            this.salario = nuevoSalario;
        }
        else{
            System.out.printf("❌ El salario introducido %.2f no puede ser inferior al salario mínimo (1.000€)\n", nuevoSalario);
        }
    }

    //Creamos una funcion para mostrar los detalles
    public void mostrarDetalles(){
        System.out.printf("El trabajador %s, con el puesto de %s, percibe un salario de %.2f\n", nombre, puesto, salario);
    }
}