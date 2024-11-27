/*
 Los padres de Marco le prometieron darle 10 dólares cuando cumpliera 12 años 
de edad y duplicar esta cantidad en cada cumpleaños subsiguiente 
hasta que excediera los mil dólares. 
Escriba una miniespecificación para determinar qué edad tendrá el infante 
cuando se le dé la última cantidad de regalo y cuánto fue la cantidad 
total recibida. 

(Se debe usar un ciclo repetitivo)
 */
package ejemplos03;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        int edadActual = 12;
        int regaloActual = 10;
        int limite = 1000;
        int totalAcumulado = 10;
        boolean bandera = true;

        do {
            regaloActual = regaloActual * 2;
            totalAcumulado = totalAcumulado + regaloActual;
            if (totalAcumulado <= limite) {
                edadActual = edadActual + 1;

            } else {
                bandera = false;
                totalAcumulado = totalAcumulado - regaloActual;
            }

        } while (bandera);

        // Imprimir resultados
        System.out.printf("Edad infante cuando se entregue "
                + "la última cantidad: %d\n", edadActual);
        System.out.printf("La cantidad total: %d\n", totalAcumulado);
    }
}
