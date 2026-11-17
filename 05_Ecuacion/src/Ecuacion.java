public class Ecuacion {
    private double a;
    private double b;
    private double c;

    public Ecuacion(){}

    public Ecuacion(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }
    
    public double calcular(){
        return (Math.pow(b, 2) - (4 * a * c)) / (2*a);
    }

}
