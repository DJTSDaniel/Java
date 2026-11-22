public class COperaciones {
    private float num1;
    private float num2;
    private float num3;
    private float num4;

    public COperaciones(){}

    public COperaciones(float num1, float num2, float num3, float num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public void setNum1(float num1){
        this.num1 = num1;
    }

    public void setNum2(float num2){
        this.num2 = num2;
    }

    public void setNum3(float num3){
        this.num3 = num3;
    }

    public void setNum4(float num4){
        this.num4 = num4;
    }

    public float getSuma(){
        return num1 + num2 + num3 + num4;
    }

    public float getMedia(){
        return getSuma() / 4; 
    }
    
    public void printSuma(){
        System.out.println("El resultado de la suma de los numeros: "+num1+","+num2+","+num3+","+num4+" es igual a "+getSuma());
    }

    public void printMedia(){
        System.out.println("El resultado de la media de los numeros: "+num1+","+num2+","+num3+","+num4+" es igual a "+getMedia());
    }
}
