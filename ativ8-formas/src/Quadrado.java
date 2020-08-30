/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tbahi
 */
public class Quadrado extends FormaBidimensional {
    
    private double lado;

    public Quadrado() {
        super();
        lado = 0.0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }       
    
    public double obterArea() {
        double area = Math.pow(lado, 2);
        return area;
    }
    
}
