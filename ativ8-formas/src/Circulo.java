/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tbahi
 */
public class Circulo extends FormaBidimensional {
    
    private double raio;

    public Circulo() {
        super();
        raio = 0.0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double obterArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }    
    
}
