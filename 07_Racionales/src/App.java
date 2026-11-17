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

                    r1 = Racionales.readDatos(scanner, 1);
                    r2 = Racionales.readDatos(scanner, 2);
                    r = Racionales.getSuma(r1, r2);

                    PrintRacionales.printSuma(r1, r2, r);

                break;

                case 2:
                    System.out.println("Opcion: Restar dos racioneles");
                    
                    r1 = Racionales.readDatos(scanner, 1);
                    r2 = Racionales.readDatos(scanner, 2);
                    r = Racionales.getResta(r1, r2);

                    PrintRacionales.printResta(r1, r2, r);
                
                break;

                case 3:
                    System.out.println("Opcion: Multiplicar dos racioneles");

                    r1 = Racionales.readDatos(scanner, 1);
                    r2 = Racionales.readDatos(scanner, 2);

                    r = Racionales.getMultiplicacion(r1, r2);

                    PrintRacionales.printMultiplicacion(r1, r2, r);   
                
                break;

                case 4:
                    System.out.println("Opcion: Dividir dos racioneles");
                    
                    r1 = Racionales.readDatos(scanner, 1);
                    r2 = Racionales.readDatos(scanner, 2);
                    
                    try{
                        r = Racionales.getDivicion(r1, r2);
                        PrintRacionales.printDivision(r1, r2, r);
                    }catch(ArithmeticException e){
                        System.out.println("ERROR: " + e);
                    }

                break;
            
                default:
                    System.out.println("OPCION INVALIDA. Intenta con otra. ");
                    break;
            }
        }while(opc != 0);

        scanner.close();

    }
}
