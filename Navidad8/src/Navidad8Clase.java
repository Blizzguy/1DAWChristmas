import java.util.Scanner;

class Navidad8Clase {

    private int edad;
    private int edSuma=0;
    private int edContador=1;
    private int edContadorMayor=0;

    private double altura;
    private double altSuma=0;
    private double altContador=0;
    private int altContadorMayor=0;

    Scanner via = new Scanner(System.in);

    public static double redondear(double numero, int decimales){

        return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
    }

    public void readNum(){

        System.out.print("Inserte la edad del alumno Nº"+edContador+" (0 para finalizar el programa): ");
        edad = via.nextInt();

        if(edad == 0){
            return;
        }
    }

    public void getResultado(){

        while(edad!=0){

            edSuma +=edad;

            if(edad>=18){
                edContadorMayor++;
            }

            System.out.print("Inserte la altura del alumno en metros: ");
            altura = via.nextDouble();
            altSuma +=altura;
            altContador++;

            if(altura>=1.75){
                altContadorMayor++;
            }


            edContador++;

            System.out.print("Inserte la edad del alumno Nº"+edContador+" (0 para finalizar el programa): ");
            edad = via.nextInt();

            if(edad == 0){

                edContador--;

                System.out.println("\n\tHay "+edContador+" alumnos.");

                System.out.println("\n\tHay "+edContadorMayor+" alumnos mayores de 18 años.");

                System.out.println("\n\tHay "+altContadorMayor+" alumnos con una altura de más de 1,75 metros");

                System.out.println("\n\tLa media de las edades de los alumnos es "+(edSuma/edContador));

                System.out.println("\n\tLa media de las alturas de los alumnos es "+redondear(((float) altSuma/altContador),2));

                return;
            }


        }

    }

}
