import java.util.Scanner;

class Navidad4Clase {

    private double nota;

    Scanner via = new Scanner(System.in);

    public void readNum(){


        System.out.print("Inserte tu nota del examen (escribe -1 para salir): ");
        nota = via.nextDouble();

    }

    public void getNota(){


        while(nota!=-1) {

            if (nota < 5 && nota >= 0) {

                System.out.println("\nEstas Suspenso");

            } else if (nota >= 5 && nota < 6) {

                System.out.println("\nEstas aprobado con un suficiente raspado");

            } else if (nota >= 6 && nota < 9) {

                System.out.println("\nEstas aprobado con un notable");

            } else if (nota >= 9 && nota <= 10) {

                System.out.println("\nEstas aprobado con un sobresaliente, enhorabuena.");

            } else if (nota > 10 | nota < 0) {

                System.out.println("\nNo te inventes las notas");
            }

            System.out.print("Inserte tu nota del examen (escribe -1 para salir): ");
            nota = via.nextDouble();
        }
    }

}
