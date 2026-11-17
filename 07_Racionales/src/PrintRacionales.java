public class PrintRacionales{

    public PrintRacionales (){
        
    }

    public static void printSuma(Racionales r1, Racionales r2, Racionales r){
        if(r.getNumerador() % r.getDenominador() == 0){
            int n = r.getNumerador() / r.getDenominador();
            System.out.println("El resultado de sumar " + r1.getNumerador() + " / " + r1.getDenominador() + " + " + r2.getNumerador() + " / " + r2.getDenominador() + " = " + n);
        }else{
            System.out.println("El resultado de sumar " + r1.getNumerador() + " / " + r1.getDenominador() + " + " + r2.getNumerador() + " / " + r2.getDenominador() + " = " + r.getNumerador() + " / " + r.getDenominador() );
        }
    }
        

    public static void printResta(Racionales r1, Racionales r2, Racionales r){
        if(r.getNumerador() % r.getDenominador() == 0){
            int n = r.getNumerador() / r.getDenominador();
            System.out.println("El resultado de restar " + r1.getNumerador() + " / " + r1.getDenominador() + " - " + r2.getNumerador() + " / " + r2.getDenominador() + " = " + n );
        }else{
            System.out.println("El resultado de restar " + r1.getNumerador() + " / " + r1.getDenominador() + " - " + r2.getNumerador() + " / " + r2.getDenominador() + " = " + r.getNumerador() + " / " + r.getDenominador() );
        }
    }

    public static void printMultiplicacion(Racionales r1, Racionales r2, Racionales r){
        if(r.getNumerador() % r.getDenominador() == 0){
            int n = r.getNumerador() / r.getDenominador();
            System.out.println("El resultado de multiplicar " + r1.getNumerador() + " / " + r1.getDenominador() + " * " + r2.getNumerador() + " / " + r2.getDenominador() + " = " + n);
        } else {
            System.out.println("El resultado de multiplicar " + r1.getNumerador() + " / " + r1.getDenominador() + " * " + r2.getNumerador() + " / " + r2.getDenominador() + " = " + r.getNumerador() + " / " + r.getDenominador() );
        }
    }

    public static void printDivision(Racionales r1, Racionales r2, Racionales r){
        if(r.getNumerador() % r.getDenominador() == 0){
            int n = r.getNumerador() / r.getDenominador();
            System.out.println("El resultado de dividir " + r1.getNumerador() + " / " + r1.getDenominador() + " / " + r2.getNumerador() + " / " + r2.getDenominador() + " = " + n);
        }else{
            System.out.println("El resultado de dividir " + r1.getNumerador() + " / " + r1.getDenominador() + " / " + r2.getNumerador() + " / " + r2.getDenominador() + " = " + r.getNumerador() + " / " + r.getDenominador() );
        }
    }

    
}
