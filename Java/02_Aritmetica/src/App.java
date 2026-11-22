public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 9;
        int num2 = 3;
        CAritmetica aritmetica = new CAritmetica(num1,num2);

        System.out.println("El resultado de sumar "+ num1 + " y " + num2 + " es igual a: " + aritmetica.getSuma());
        System.out.println("El resultado de restar "+ num1 + " y " + num2 + " es igual a: " + aritmetica.getResta());
        System.out.println("El resultado de multiplicar "+ num1 + " por " + num2 + " es igual a: " + aritmetica.getMultiplicacion());
        System.out.println("El resultado de dividir "+ num1 + " entre " + num2 + " es igual a: " + aritmetica.getDivicion());

    }
}
