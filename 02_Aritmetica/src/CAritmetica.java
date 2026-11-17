public class CAritmetica {
    private int num1;
    private int num2;

    public CAritmetica(){}; //Constructor por defecto

    public CAritmetica(int num1, int num2){ //Constructor con parametros
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSuma(){
        return num1 + num2;
    }

    public int getResta(){
        return num1 - num2;
    }

    public int getMultiplicacion(){
        return num1 * num2;
    }

    public int getDivicion(){
        return num1 / num2;
    }
    
}
