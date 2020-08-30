

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tbahi
 */
public class Esfera extends FormaTridimensional {
    
    public double raio;
    
    public Esfera() {
        super();
        raio = 0.0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterArea() {
        double area = 4 * Math.PI * Math.pow(raio, 2);
        return area;
    }
    
    @Override
    public double obterVolume() {
        double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
        return volume;
    }       
    
}
