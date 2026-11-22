public class App {
    public static void main(String[] args){
        COrdenador ordenador1 = new COrdenador();

        ordenador1.setMarca("Toshiba");
        ordenador1.setProcesador("Intel");
        ordenador1.setPeso(2);
        ordenador1.setEncendido(false);
        ordenador1.setPantalla(false);

        ordenador1.printEstado();

    }
}
