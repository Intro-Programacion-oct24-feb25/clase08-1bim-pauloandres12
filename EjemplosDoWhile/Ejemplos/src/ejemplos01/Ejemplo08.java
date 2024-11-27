/*
salida
-1/1+1/2-1/3+1/4-1/5+1/6-1/7+1/8-1/9+1/10

explicación
1|-1/1
2|+1/2
3|-1/3
4|+1/4
5|-1/5
6|+1/6
7|-1/7
8|+1/8
9|-1/9
10|+1/10
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {

        // TODO code application logic here
        int limite = 10; 
        int numerador = 1;
        int denominador = 1;
        String signo;
        String cadena = "";

        do {
            // para manejar el signo asociado
            //  1 % 2 == 0 // falso
            //  2 % 2 == 0 // verdadero
            //  3 % 2 == 0 // falso
            if (denominador % 2 == 0) {
                signo = "+"; // +
            } else {
                signo = "-"; // -
            }
                                        //    -1/1
                                        // -1/1 +1/2
                                        // -1/1 +1/2 -1/3 
            cadena = String.format("%s%s%d/%d ", 
                    cadena,
                    signo,
                    numerador, 
                    denominador);
            denominador = denominador + 1; // 1 + 1 = 2
                                           // 2 + 1 = 3 
                                           // 3 + 1 = 4

        } while (denominador <= limite); 
                // 2 <= 10 v
                // 3 <= 10 v
                // 4 <= 10 v
        System.out.println(cadena);

    }
}
