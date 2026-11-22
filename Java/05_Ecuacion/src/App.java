public class App {
    public static void main(String[] args){
        double a = 1;
        double b = 5;
        double c = 2;

        Ecuacion ecuacion = new Ecuacion(a,b,c);

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("b^2 - 4ac / 2a = " + ecuacion.calcular());

    }
}
