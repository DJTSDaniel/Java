public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta1 = new CuentaBancaria("00000001", "Daniel");

        System.out.println(cuenta1.getSaldo());
       // 1. Depositar 1000
        showOperacion(cuenta1.depositar(1000),cuenta1);

        // 2. Retirar 300
        showOperacion(cuenta1.retirar(300), cuenta1);

        // 3. Retirar 800
        showOperacion(cuenta1.retirar(800), cuenta1);

        // 4. Depositar -200
        showOperacion(cuenta1.depositar(-200), cuenta1);

        // 5. Desactivar cuenta e intentar depositar 500
        cuenta1.setActivo(false);
        showOperacion(cuenta1.depositar(500), cuenta1);

    }

    public static  void showOperacion(boolean status, CuentaBancaria cuenta){
        if (status){
            System.out.println("Operacion Exitosa");
            System.out.println("Nuevo saldo: " + cuenta.getSaldo());

        }else{
            System.out.println("Operacion Fallida");
            System.out.println("Saldo: " + cuenta.getSaldo());
        }
    }
}
