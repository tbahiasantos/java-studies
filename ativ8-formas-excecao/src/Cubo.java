

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tbahi
 */
public class Cubo extends FormaTridimensional {
    
    private double lado;
    
    public Cubo() {
        super();
        lado = 0.0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }       
    
    @Override
    public double obterArea() {
        double area = 6 * Math.pow(lado, 2);
        return area;
    }

    @Override
    public double obterVolume() {
        double volume = Math.pow(lado, 3);
        return volume;
    }        
    
}
