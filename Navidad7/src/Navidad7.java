import java.util.Random;
import java.util.Scanner;


public class Navidad7 {

    public static void main(String[] args) {

        Scanner via = new Scanner(System.in);

        int numAleatorio;

        int numSeleccionado;

        Random rd = new Random();

        do {
            System.out.print("Se ha generado un numero aleatorio entre 1 y 100. Intenta adivinarlo (introduce 0 para finalizar el juego): ");
            numAleatorio = rd.nextInt(100) + 1;

            while (numAleatorio != (numSeleccionado = via.nextInt())) {
                if(numSeleccionado == 0){
                    System.out.println("\n\tHasta luego Lucas.");
                    return;
                }

                if (numSeleccionado < numAleatorio)
                    System.out.print("No has acertado, el número es mayor. Prueba otra vez: ");
                else
                    System.out.print("No has acertado, el número es menor. Prueba otra vez: ");
            }

            System.out.println("\nHas acertado el número");

        }while(numSeleccionado !=0);


        System.out.println("\n\tHasta luego Lucas.");
    }
}
