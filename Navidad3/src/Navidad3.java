import java.util.Scanner;

public class Navidad3 {

    public static void main(String args[]){

        Scanner via = new Scanner(System.in);

        int num;
        char caracter;

        System.out.println("Inserte un carácter: ");
        caracter = via.next().charAt(0);


        System.out.print("Inserte el número de veces  que vas a repetirlo: ");
        num = via.nextInt();


        for(int i = 0; i < num ; i++){
            System.out.println(caracter);}

        System.out.println("\nHasta luego Lucas");




    }

}
