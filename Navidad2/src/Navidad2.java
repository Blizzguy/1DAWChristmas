
import java.util.Scanner;

public class Navidad2 {

    public static void main (String args[]){
        Scanner via = new Scanner(System.in);
        int num=0;
        int cont=1;
        int suma=0;

        System.out.println("Recuerde, inserte 0 para terminar.");

        System.out.print("Inserte un numero "+cont+" : ");

        num = via.nextInt();


        while (num!=0) {

            suma += num;
            cont ++;
            System.out.print("Inserte un numerob"+cont+": ");
            num = via.nextInt();

        }

        System.out.println("\n\tLa cantidad de numeros introducidos es "+ --cont);


        if (cont>1) {
            System.out.println("\n\tLa suma acumulada de los numeros introducidos es " + suma);
        }else {
            System.out.println("\n\tNo visualizamos la suma porque solo se ha insertado un 0.");
            System.out.println("\n\n\n Ha finalizado el programa.");
        }
    }

}
