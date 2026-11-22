public class App {
    public static void main(String[] args) {
        float num1,num2, num3, num4;
        num1 = 1;
        num2 = 2;
        num3 = 3;
        num4 = 4;

        COperaciones operaciones = new COperaciones(num1,num2,num3,num4);
        
        operaciones.printSuma();
        operaciones.printMedia();
    }
    
}
