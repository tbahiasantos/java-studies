/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class AssalariadoComissionado extends Comissionado {

    private double valorAPagar;
    
    public AssalariadoComissionado() {
        super();
        valorAPagar = 0.0;
    } 

    @Override
    public double getValorAPagar() {
        return valorAPagar;
    }

    @Override
    public void setValorAPagar(double valorVendas) {
        valorAPagar = ControlePagamento.SALARIO + (ControlePagamento.SALARIO * 0.1) + (valorVendas * 0.06);
    }      
    
}
