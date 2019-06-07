import java.util.Scanner;

class Navidad6Clase {

    private int num;

    Scanner via = new Scanner(System.in);

    public void readNum(){




        System.out.print("\nInserte un numero (para salir teclee un 0): ");
        num = via.nextInt();

    }

    public void getResultado() {



        while (num != 0) {
            if (num > 0) {
                System.out.println("Tu número es positivo");
            } else if (num < 0) {
                System.out.println("Tu número es negativo");
            }

            if (num % 2 == 0) {
                System.out.println("Tu número es par");
            } else {
                System.out.println("Tu número es impar");
            }
            System.out.print("\nInserte un numero (para salir teclee un 0): ");
            num = via.nextInt();
        }
    }
}
