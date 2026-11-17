import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int opc = 0;

        Racionales r1 = new Racionales();
        Racionales r2 = new Racionales();
        Racionales r;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Elige una Opcion: ");
            System.out.println("    1. Sumar dos racionales.");
            System.out.println("    2. Restar dos raciones. ");
            System.out.println("    3. Multiplicar dos raciones.");
            System.out.println("    4. Dividir dos racionales.");
            System.out.println("    0. Salir. ");

            opc = scanner.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("Opcion salir, gracias por usar este programa. ");
                    opc = 0;
                break;

                case 1:
                    System.out.println("Opcion: Sumar dos racioneles");
                    System.out.println("Escribe el numerador del primer racional: ");
                    r1.setNumerador(scanner.nextInt());
                    System.out.println("Escribe el denominador del primer racional: ");
                    r1.setDenominador(scanner.nextInt());
                    System.out.println("Escribe el numerador del segundo racional: ");
                    r2.setNumerador(scanner.nextInt());
                    System.out.println("Escribe el numerador del segundo racional: ");
                    r2.setDenominador(scanner.nextInt());

                    r = Racionales.getSuma(r1, r2);

                    PrintRacionales.printSuma(r1, r2, r);

                break;

                case 2:
                    System.out.println("Opcion: Restar dos racioneles");
                    System.out.println("Escribe el numerador del primer racional: ");
                    r1.setNumerador(scanner.nextInt());
                    System.out.println("Escribe el denominador del primer racional: ");
                    r1.setDenominador(scanner.nextInt());
                    System.out.println("Escribe el numerador del segundo racional: ");
                    r2.setNumerador(scanner.nextInt());
                    System.out.println("Escribe el numerador del segundo racional: ");
                    r2.setDenominador(scanner.nextInt());

                    r = Racionales.getResta(r1, r2);

                    PrintRacionales.printResta(r1, r2, r);
                
                break;

                case 3:
                    System.out.println("Opcion: Multiplicar dos racioneles");
                    System.out.println("Escribe el numerador del primer racional: ");
                    r1.setNumerador(scanner.nextInt());
                    System.out.println("Escribe el denominador del primer racional: ");
                    r1.setDenominador(scanner.nextInt());
                    System.out.println("Escribe el numerador del segundo racional: ");
                    r2.setNumerador(scanner.nextInt());
                    System.out.println("Escribe el denominador del segundo racional: ");
                    r2.setDenominador(scanner.nextInt());

                    r = Racionales.getMultiplicacion(r1, r2);

                    PrintRacionales.printMultiplicacion(r1, r2, r);
                
                break;

                case 4:
                    System.out.println("Opcion: Dividir dos racioneles");
                    System.out.println("Escribe el numerador del primer racional: ");
                    r1.setNumerador(scanner.nextInt());
                    System.out.println("Escribe el denominador del primer racional: ");
                    r1.setDenominador(scanner.nextInt());
                    System.out.println("Escribe el numerador del segundo racional: ");
                    r2.setNumerador(scanner.nextInt());
                    System.out.println("Escribe el numerador del segundo racional: ");
                    r2.setDenominador(scanner.nextInt());

                    r = Racionales.getDivicion(r1, r2);

                    PrintRacionales.printDivision(r1, r2, r);

                break;
            
                default:
                    System.out.println("OPCION INVALIDA. Intenta con otra. ");
                    break;
            }
        }while(opc != 0);

        scanner.close();

    }
}
