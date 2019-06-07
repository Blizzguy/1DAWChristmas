import java.util.Scanner;

class Navidad9Clase {

    private int numeroUno;
    private int numeroDos;
    private int rangoInicial = 1;
    private int rangoFinal;
    private int contadorPrimo = 0;
    private int contadorColumna = 0;

    Scanner via = new Scanner(System.in);

    private boolean esPrimo;

    public void readNum(){

        System.out.print("Introduce un entero(0 para finalizar): ");
        rangoFinal = via.nextInt();
    }

    public void getPrimo(){



        while(rangoFinal!=0) {

            for (numeroUno = rangoInicial; numeroUno <= rangoFinal; numeroUno++) {

                esPrimo = true;
                for (numeroDos = 2; numeroDos <= numeroUno / 2 && esPrimo; numeroDos++) {


                    if (numeroUno % numeroDos == 0) {
                        esPrimo = false;
                    }
                }
                if (esPrimo) {

                    if (contadorColumna == 8) {
                        System.out.println();
                        contadorColumna = 0;
                    }

                    System.out.print("\t" + numeroUno + "\t\t");

                    contadorColumna++;
                    contadorPrimo++;

                }

            }

            System.out.println("\nLa cantidad de números primos encontrados es: " + contadorPrimo);

            contadorPrimo = 0;

            System.out.print("Introduce un entero(0 para finalizar): ");
            rangoFinal = via.nextInt();
        }
    }
}
