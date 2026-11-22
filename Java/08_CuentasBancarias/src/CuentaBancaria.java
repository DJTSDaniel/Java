public class CuentaBancaria{
    private String numeroDeCuenta;
    private String titularCuenta;
    private double saldo;
    private boolean activa;

    public CuentaBancaria(String numeroDeCuenta, String titularCuenta){
        setNumeroCuenta(numeroDeCuenta);
        setTitularCuenta(titularCuenta);
        setActivo(true);
    }

    //Setters
    public void setNumeroCuenta(String numeroDeCuenta){
        if(numeroDeCuenta == null || numeroDeCuenta.isBlank()){
            System.out.println("ERROR: Cadena Vacia o espacios en blanco");
            System.out.println("Numero de cuenta automatico: 00000000");
            this.numeroDeCuenta = "00000000";
        }else{
            this.numeroDeCuenta = numeroDeCuenta;
        }
    }

     public void setTitularCuenta(String titularCuenta){
        if(titularCuenta == null || titularCuenta.isBlank()){
            System.out.println("ERROR: Cadena Vacia o espacios en blanco");
            System.out.println("Titular establecido en: \" Un titular \" ");
            this.titularCuenta = "Un titular";
        }else{
            this.titularCuenta = titularCuenta;
        }
    }

    private void setSaldo(double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("ERROR: Se esta tratando abrir una cuenta con saldo negativo. ");
            System.out.println("Saldo establecido en CEROS");
            this.saldo = 0;
        }
    }

    public void setActivo(boolean activo){
        this.activa = activo;
    }

    //getters
    public String getNumeroDeCuenta(){
        return numeroDeCuenta;
    }

    public String getTitularCuenta(){
        return titularCuenta;
    }

    public double getSaldo(){ // Sirve para consultar saldo
        return saldo;
    }

    public boolean isActivo(){
        return activa;
    }

    //Metodos
    public boolean depositar(double deposito){
        if (deposito > 0 && this.activa){
            setSaldo(getSaldo()+deposito);
            return true;
        }else{
            return false;
        }

    }

    public boolean retirar(double retiro){
        if (retiro > 0 && retiro <= this.saldo && this.activa){
            setSaldo( getSaldo() - retiro );
            return true;
        }else{
            return false;
        }
    }

}