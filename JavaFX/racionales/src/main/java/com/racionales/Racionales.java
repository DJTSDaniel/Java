package com.racionales;

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

