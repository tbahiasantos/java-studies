/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tbahi
 */
public class Tetraedro extends FormaTridimensional {
    
    private double lado;

    public Tetraedro() {
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
        double area = Math.pow(lado, 2) * Math.sqrt(3);
        return area;
    }
    
    public double obterVolume() {
        double volume = (Math.pow(lado, 3) * Math.sqrt(2)) / 12;
        return volume;
    }
    
}
