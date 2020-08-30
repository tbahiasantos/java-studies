/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Comissionado extends Empregado {
    
    private double valorAPagar;

    public Comissionado() {
        super();
        valorAPagar = 0.0;
    }   

    @Override
    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorVendas) {
        valorAPagar = valorVendas * 0.06; 
    }     
    
}
