/*
1) Generar una minespecificación que permita resolver la siguiente problemática.

Los equipos de un campeonato provincial de fútbol sala, tienen información de promedio 
de edades y promedio de sueldos de los jugadores. 
El programa debe permitir el ingreso de múltiples equipos del campeonato 
(hasta que el usuario decida terminar el proceso); a cada equipo se le 
debe preguntar: 
nombre de equipo, 
promedio de edades de sus jugadores, 
promedio de sueldos de sus jugadores, 
lugar de fundación del equipo. (Se debe usar un ciclo repetitivo)

Se debería imprimir al final (para ello debe usar una cadena acumuladora) el 
siguiente reporte:
-----------------------------
Equipos:

Barcelona - Guayaquil, promedio de edad 30.1 (alto) y promedio de sueldos: 5630
Emelec - Guayaquil, promedio de edad 25.8 (bajo) y promedio de sueldos: 4340
Liga - Quito, promedio de edad 29.1 (alto) y promedio de sueldos: 5100

Promedio de Edades de los equipos del campeonato: 28.33
Promedio de Sueldos de los equipos del campeonato: 5023.
----------------------------

Considerar: Por cada equipo, mayor a 26 es un promedio de edad alto; 
menor o igual 26 es un promedio edad bajo
*/
package ejemplos03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaFinal = "";
        double promedioSueldos;
        double promedioEdades;
        String nombreEquipo;
        String fundacionEquipo;
        String tipoEdad;
        String salirCiclo;
        boolean bandera;
        
        double sumaPromediosSueldos;
        double sumaPromediosEdades;
        double promediosSueldosTotal;
        double promediosEdadesTotal;
        
        int contador;
        
        contador = 0;
        bandera = true;
        sumaPromediosEdades = 0;
        sumaPromediosSueldos = 0;
        
        cadenaFinal = "Equipos:\n\n";
        
        do {
            System.out.println("Ingrese el nombre del equipo");
            nombreEquipo = entrada.nextLine();
            System.out.println("Ingrese la ciudad de fundación");
            fundacionEquipo = entrada.nextLine();
            System.out.println("Ingrese el promedio de edades del equipo");
            promedioEdades = entrada.nextDouble();
            System.out.println("Ingrese el promedio de sueldos del equipo");
            promedioSueldos = entrada.nextDouble();
            if (promedioEdades > 26) {
                tipoEdad = "alto";
            }else{
                tipoEdad = "bajo";
            }
            // Barcelona - Guayaquil, promedio de edad 30.1 (alto) y 
            // promedio de sueldos: 5630
            cadenaFinal = String.format("%s%s-%s, promedio de edad "
                    + "%.2f (%s) y promedio de sueldos: %.2f\n",
                    cadenaFinal, nombreEquipo, fundacionEquipo,
                    promedioEdades, tipoEdad, promedioSueldos);
            
            sumaPromediosEdades = sumaPromediosEdades + promedioEdades;
            sumaPromediosSueldos = sumaPromediosSueldos + promedioSueldos;
            contador = contador + 1;
            
            // proceso para salir del ciclo
            entrada.nextLine();
            System.out.println("Desea salir del el ciclo, ingrese la letra"
                    + "s, caso contrario ingrese cualquier letra para continuar");
            salirCiclo = entrada.nextLine();
            if(salirCiclo.equals("s")){
                bandera = false;
            }
            
        } while (bandera);
        
        promediosEdadesTotal = sumaPromediosEdades / contador;
        promediosSueldosTotal = sumaPromediosSueldos / contador;
        // Promedio de Edades de los equipos del campeonato: 28.33
        cadenaFinal = String.format("%s\n\nPromedio de Edades de los equipos "
                + "del campeonato: %.2f\n", 
                cadenaFinal, 
                promediosEdadesTotal);
        // Promedio de Sueldos de los equipos del campeonato: 5023
        cadenaFinal = String.format("%sPromedio de Sueldos de los equipos "
                + "del campeonato: %.2f\n", cadenaFinal, 
                promediosSueldosTotal);
        
        System.out.printf("%s\n", cadenaFinal);
                
        
        
    }
   
}
