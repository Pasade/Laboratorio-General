public class Paciente{
    private String nombre;
    private int edad;
    private String sintoma;

    //Creamos el constructor
    public Paciente(String nombre, int edad, String sintoma){
        setNombre(nombre);
        setEdad(edad);
        setSintoma(sintoma);
    }

    //Creamos los setters y llos Getters
    public String getNombre(){return this.nombre;}
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public int getEdad(){return this.edad;}
    public void setEdad(int nuevaEdad){
        this.edad = nuevaEdad;
    }
    public String getSintoma(){return this.sintoma;}
    public void setSintoma(String nuevoSintoma){
        this.sintoma = nuevoSintoma;
    }

    //Método para mostar la ficha del paciente
    public void mostrarFicha(){
        System.out.println("[PACIENTE] Nombre:" + nombre +  " | Edad: " + edad + "| Síntoma: " + sintoma);
    }
}