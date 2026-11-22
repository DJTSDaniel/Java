package com.racionales;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class OperacionesController {
    private int n1, n2, d1, d2;

    @FXML 
    private TextField num1;

    @FXML 
    private TextField num2;

    @FXML 
    private TextField den1;

    @FXML 
    private TextField den2;

    @FXML 
    private Button botonSuma;

    @FXML 
    private Button botonResta;

    @FXML 
    private Button botonMultiplicacion;

    @FXML 
    private Button botonDivicion;

    @FXML 
    private Label LResultado;

    private boolean setDatos(){
        try{
            n1 = Integer.parseInt(this.num1.getText().trim());
            n2 = Integer.parseInt(this.num2.getText().trim());
            d1 = Integer.parseInt(this.den1.getText().trim());
            d2 = Integer.parseInt(this.den2.getText().trim());

            if (d1 == 0 || d2 == 0){
                LResultado.setText("ERROR: Los denominadores no pueden ser CERO.");
                return false;
            }else{
                return true;
            }
        }catch(NumberFormatException e){
            LResultado.setText("ERROR: Todos los datos deben ser NUMEROS ENTEROS. ");
            return false; 
        }
    }

    public void suma(){
        if (setDatos() == true){
            Racionales r1 = new Racionales();
            Racionales r2 = new Racionales();
            Racionales r;

            r1.setDatos(n1, d1);
            r2.setDatos(n2,d2);

            r = Racionales.getSuma(r1, r2);

            if (r.getNumerador() % r.getDenominador() == 0){
                int entero = r.getNumerador() / r.getDenominador();
                LResultado.setText("El resultado de la suma es: " + entero);
            } else {
                LResultado.setText("El resultado de la suma es: " + r.getNumerador() + " / " + r.getDenominador());
            }
        }
    }

    public void resta(){
        if (setDatos() == true){
            Racionales r1 = new Racionales();
            Racionales r2 = new Racionales();
            Racionales r;

            r1.setDatos(n1, d1);
            r2.setDatos(n2,d2);

            r = Racionales.getResta(r1, r2);

            if (r.getNumerador() % r.getDenominador() == 0){
                int entero = r.getNumerador() / r.getDenominador();
                LResultado.setText("El resultado de la resta es: " + entero);
            } else {
                LResultado.setText("El resultado de la resta es: " + r.getNumerador() + " / " + r.getDenominador());
            }
        }
    }

    public void multiplicacion(){
        if (setDatos() == true){
            Racionales r1 = new Racionales();
            Racionales r2 = new Racionales();
            Racionales r;

            r1.setDatos(n1, d1);
            r2.setDatos(n2,d2);

            r = Racionales.getMultiplicacion(r1, r2);

            if (r.getNumerador() % r.getDenominador() == 0){
                int entero = r.getNumerador() / r.getDenominador();
                LResultado.setText("El resultado de la multiplicacion es: " + entero);
            } else {
                LResultado.setText("El resultado de la multiplicacion es: " + r.getNumerador() + " / " + r.getDenominador());
            }
        }
    }

    public void divicion(){
        if (setDatos() == true && n2 != 0){ // se tiene que separar la comprobacion, causa errores. 
            Racionales r1 = new Racionales();
            Racionales r2 = new Racionales();
            Racionales r;

            r1.setDatos(n1, d1);
            r2.setDatos(n2,d2);

            r = Racionales.getDivicion(r1, r2);

            if (r.getNumerador() % r.getDenominador() == 0){
                int entero = r.getNumerador() / r.getDenominador();
                LResultado.setText("El resultado de la divicion es: " + entero);
            } else {
                LResultado.setText("El resultado de la divicion es: " + r.getNumerador() + " / " + r.getDenominador());
            }
        }else{
            LResultado.setText("ERROR: Para hacer la divicion en N2 no puede ser cero.");
        }
    }
}
