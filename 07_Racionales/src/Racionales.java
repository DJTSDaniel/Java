import java.util.Scanner;

public class Racionales {
    private int N;
    private int D;

    public Racionales(){
        N = 0;
        D = 1;
    }

    //setters
    public void setDatos(int N, int D){
        this.N = N;

        if (D != 0){
            this.D = D;
        }else{
            System.out.println("ERROR: El Denominador no puede ser cero.");
            System.out.println("Denominador asignado a 1.");
            this.D = 1;
        }
    }

    public void setNumerador(int N){
        this.N = N;
    }

    public void setDenominador(int D){
        if (D != 0 )
            this.D = D;
        else{
            System.out.println("ERROR: El Denominador no puede ser cero.");
            System.out.println("Denominador asignado a 1.");
            this.D = 1;
        }
    }

    public static Racionales readDatos(Scanner scanner, int numero){
        int n = 0;
        Racionales r = new Racionales();

        System.out.println("Escribe el numerador del racional numero "+ numero +": ");
        r.setNumerador(scanner.nextInt());
        System.out.println("Escribe el denominador del racional numero "+ numero +": ");
        do{
            int d = scanner.nextInt();
            if(d != 0){
                r.setDenominador(d);
                n = 0;
            }else{
                System.out.println("ERROR: El denominador no puede ser 0");
                System.out.println("Intenta de nuevo.");
                n = 1;
            }
        }while(n != 0);

        return r;

    }

    //Getters
    public int getNumerador(){
        return N;
    }

    public int getDenominador(){
        return D;
    }

    //Operaciones
    public static Racionales getSuma(Racionales r1, Racionales r2){
        Racionales r = new Racionales();

        if (r1.D == r2.D){
            r.N = r1.N + r2.N;
            r.D = r1.D;
        }else {
            r.N = r1.N * r2.D + r2.N * r1.D; 
            r.D = r1.D * r2.D;   
        }
        
        return r = getSimplificacion(r);
    }

    public static Racionales getResta(Racionales r1, Racionales r2){
        Racionales r = new Racionales();

        if (r1.D == r2.D){
            r.N = r1.N - r2.N;
            r.D = r1.D;
        }else {
            r.N = r1.N * r2.D - r2.N * r1.D; 
            r.D = r1.D * r2.D;   
        }
        
        return r = getSimplificacion(r);
    }

    public static Racionales getMultiplicacion (Racionales r1, Racionales r2){
        Racionales r = new Racionales();
        
        r.N = r1.N * r2.N;
        r.D = r1.D * r2.D;

        return r = getSimplificacion(r);
    }

    public static Racionales getDivicion(Racionales r1, Racionales r2){
        
        if(r2.N == 0 ){
            throw new ArithmeticException("No se puede dividir entre cero. ");
        }else{
            Racionales r = new Racionales();
            r.N = r1.N * r2.D;
            r.D = r1.D * r2.N;

            return getSimplificacion(r);
        }
    }

    public static int getMCD(int a, int b) {
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
   
    public static Racionales getSimplificacion(Racionales r){
        Racionales rS = new Racionales();
        int MCD = 0;

        MCD = getMCD(Math.abs(r.N), Math.abs(r.D));

        rS.N = r.N / MCD;
        rS.D = r.D / MCD;

        return rS;
    }

}
