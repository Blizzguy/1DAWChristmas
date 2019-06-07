import java.util.Scanner;


class Navidad5Clase {

    private int num;

    Scanner via = new Scanner(System.in);

    public void readNum() {
        System.out.print("Introduce un numero del 20 al 99 (introduce 0 para finalizar el programa: ");
        this.num = via.nextInt();

    }


    public void getNumName() {
        int decenas, unidades;

        while (num != 0) {

            if (num >= 20 && num <= 99) {


                decenas = this.num / 10;
                unidades = this.num % 10;

                switch (decenas) {
                    case 2:
                        if (unidades == 0)
                            System.out.print("veinte");
                        else
                            System.out.print("veint");

                        break;

                    case 3:
                        System.out.print("treinta");
                        break;

                    case 4:
                        System.out.print("cuarenta");
                        break;

                    case 5:
                        System.out.print("cincuenta");
                        break;

                    case 6:
                        System.out.print("sesenta");
                        break;

                    case 7:
                        System.out.print("setenta");
                        break;

                    case 8:
                        System.out.print("ochenta");
                        break;

                    case 9:
                        System.out.print("noventa");
                        break;
                }

                switch (unidades) {
                    case 0:
                        break;

                    case 1:
                        if (decenas == 2)
                            System.out.print("iuno");
                        else
                            System.out.print(" y uno");
                        break;

                    case 2:
                        if (decenas == 2)
                            System.out.print("idos");
                        else
                            System.out.print(" y dos");
                        break;

                    case 3:
                        if (decenas == 2)
                            System.out.print("itres");
                        else
                            System.out.print(" y tres");
                        break;

                    case 4:
                        if (decenas == 2)
                            System.out.print("icuatro");
                        else
                            System.out.print(" y cuatro");
                        break;

                    case 5:
                        if (decenas == 2)
                            System.out.print("icinco");
                        else
                            System.out.print(" y cinco");
                        break;

                    case 6:
                        if (decenas == 2)
                            System.out.print("iseis");
                        else
                            System.out.print(" y seis");
                        break;

                    case 7:
                        if (decenas == 2)
                            System.out.print("isiete");
                        else
                            System.out.print(" y siete");
                        break;

                    case 8:
                        if (decenas == 2)
                            System.out.print("iocho");
                        else
                            System.out.print(" y ocho");
                        break;

                    case 9:
                        if (decenas == 2)
                            System.out.print("inueve");
                        else
                            System.out.print(" y nueve");
                        break;
                }

                System.out.print("\nIntroduce un numero del 20 al 99 (introduce 0 para finalizar el programa: ");
                this.num = via.nextInt();

            }else{
                System.out.println("El numero introducido no esta en el intervalo solicitado.");

                System.out.print("\nIntroduce un numero del 20 al 99 (introduce 0 para finalizar el programa: ");
                this.num = via.nextInt();
            }


        }
    }


}
