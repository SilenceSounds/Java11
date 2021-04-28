/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Xan-T
 */
public class Suma {
    float num1;
    float num2;
    float result;
    private String resultado;

    public Suma(String num1, String num2) {
        this.num1 = Float.parseFloat(num1);
        this.num2 = Float.parseFloat(num2);
        this.result = this.num1 + this.num2;
        this.resultado = Float.toString(result);
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
