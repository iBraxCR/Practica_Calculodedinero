/*  
Título: Cálculo de dinero
Descripción: Este programa calcula y muestra la cantidad de dinero que tienen Guillermo, Luis y Juan.
Guillermo inicia con una cantidad introducida por el usuario, Luis tiene la mitad de lo que tiene Guillermo, 
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.println("Digite la cantidad que tiene Guillermo");
        guillermo = entrada.nextFloat();

        // Calcula la cantidad de dinero que tiene Luis (la mitad de lo que tiene Guillermo)
        luis = guillermo / 2;

        // Calcula la cantidad de dinero que tiene Juan (la mitad de la suma de lo que tienen Guillermo y Luis)
        juan = (guillermo + luis) / 2;

        // Calcula la cantidad de dinero que tienen todos juntos
        total = guillermo + luis + juan;

        // Muestra los resultados
        System.out.println("Guillermo tiene la cantidad de dinero: " + guillermo);
        System.out.println("La cantidad de dinero que tiene Luis es de: " + luis);
        System.out.println("La cantidad de dinero que tiene Juan es de: " + juan);
        System.out.println("La cantidad de dinero que tienen todos juntos es de: " + total);
    }
}