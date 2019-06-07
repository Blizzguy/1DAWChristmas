import java.util.Scanner;

public class Navidad1Clase {

    public static double redondear(double numero, int decimales){

        return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
    }

    private double peso = 0;
    private double altura = 0;

    Scanner via = new Scanner(System.in);

    public void readNum(){

        System.out.print("Inserte tu peso en kilogramos (escribe 0 para salir): ");
        this.peso = via.nextDouble();
    }

    public void getIMC(){


        while(this.peso!=0) {

            System.out.print("Inserte tu altura en metros: ");
            this.altura = via.nextDouble();

            double IMC = this.peso / (this.altura * this.altura);


            if (IMC <= 16) {

                System.out.print("\n\nEl IMC tuyo es de: " + redondear(IMC, 2));
                System.out.println("\t// Criterio de ingreso en hospital.");

            } else if (IMC >= 16 && IMC <= 17) {

                System.out.print("\n\nEl IMC tuyo es de: " + redondear(IMC, 2));
                System.out.println("\t// Infrapeso.");

            } else if (IMC >= 17 && IMC <= 18) {

                System.out.print("\n\nEl IMC tuyo es de: " + redondear(IMC, 2));
                System.out.println("\t// Bajo peso.");

            } else if (IMC >= 18 && IMC <= 25) {

                System.out.print("\n\nEl IMC tuyo es de: " + redondear(IMC, 2));
                System.out.println("\t// Peso normal (saludable).");

            } else if (IMC >= 25 && IMC <= 30) {

                System.out.print("\n\nEl IMC tuyo es de: " + redondear(IMC, 2));
                System.out.println("\t// Sobrepeso (obesidad de grado I).");

            } else if (IMC >= 30 && IMC <= 35) {

                System.out.print("\n\nEl IMC tuyo es de: " + redondear(IMC, 2));
                System.out.println("\t// Sobrepeso crónico (obesidad de grado II).");

            } else if (IMC >= 35 && IMC <= 40) {

                System.out.print("\n\nEl IMC tuyo es de: " + redondear(IMC, 2));
                System.out.println("\t// Obesidad premórbida (obesidad de grado III).");

            } else if (IMC >= 40) {

                System.out.print("\n\nEl IMC tuyo es de: " + redondear(IMC, 2));
                System.out.println(" // Obesidad mórbida (obesidad de grado IV).");

            }

            System.out.print("\nInserte tu peso en kilogramos (escribe 0 para salir): ");
            this.peso = via.nextDouble();

        }
    }



}
