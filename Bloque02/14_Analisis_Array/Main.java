public class Main{
    public static void main(String[] args){

        //Declaramos un array que guarda los registros de las velocidades por vuelta
        int[] velocidadesPunta = {312, 325, 308, 317, 330};
        //Declaramos una variable double para sumar todos los valores del array
        double suma = 0.0;
        //Declaramos una variable int para contar las veces que se ha sobrepasado el limite de 320Km/H
        int contadorExcesos = 0;

        //Creamos un bucle for para que recorra el array y vaya sumando los datos
        for(int i = 0; i < velocidadesPunta.length; i++){
            suma += velocidadesPunta[i];
            if(velocidadesPunta[i] > 320){
                contadorExcesos++;
            }
        }
        //Calculamos la velocidad media
        double media = suma / velocidadesPunta.length;

        //Imprimimos en pantalla los resultados
        System.out.printf("La velocidad media es de: %.1f\n", media);
        System.out.printf("El número de vueltas en las que se ha sobrepasado el límite de 320 Km/h es de: %d\n", contadorExcesos);

    }
}