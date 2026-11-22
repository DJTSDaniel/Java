public class COrdenador{
    //Atributos
    private String marca;
    private String procesador;
    private float peso;
    private boolean encendido;
    private boolean pantalla;

    //Constructores
    public COrdenador(){}
    public COrdenador(String mar, String pro, float peso, boolean enc, boolean pan){
        setMarca(mar);
        setProcesador(pro);
        setPeso(peso);
        setEncendido(enc);
        setPantalla(pan);
    }

    // Setters
    public void setMarca(String mar){
        if(mar.isEmpty()){
            System.out.println("ERROR: La cadena esta vacia");
            System.out.println("La cadena se establecio en: Una marca");
            marca = "Una marca";
        }else {
            marca = mar;
        }
    }

     public void setProcesador(String pro){
        if(pro.isEmpty()){
            System.out.println("ERROR: La cadena esta vacia");
            System.out.println("La cadena se establecio en: Un Procesador");
            procesador = "Un procesador";
        }else {
            procesador = pro;
        }
    }

     public void setPeso(float peso){
        if(peso <= 0){
            System.out.println("ERROR: El peso debe ser mayor a 0");
            System.out.println("El peso se establecio en 0.1");
            this.peso = 0.1f;
        }else {
            this.peso = peso;
        }
    }

    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }

    public void setPantalla(boolean pantalla){
        this.pantalla = pantalla;
    }

    // getters
    public String getMarca(){
        return marca;
    }

    public String getProcesador(){
        return procesador;
    }

    public float getPeso(){
        return peso;
    }

    public boolean isPantalla(){
        return pantalla;
    }

    public boolean isEncendido(){
        return encendido;
    }

    public void printEstado(){
        System.out.println("\nEl estado del ordenador es el siguiente: ");
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("Peso: " + peso);
        
        if (encendido){
            System.out.println("El ordenador esta encendido.");
        }else{
            System.out.println("El ordenador esta apagado.");
        }

        if (pantalla){
            System.out.println("La pantalla esta activada");
        }else{
            System.out.println("La pantalla esta desactivada");
        }
            System.out.println();
    }


}