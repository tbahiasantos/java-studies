/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Terceirizado extends Empregado {

    private double valorAPagar;
    
    public Terceirizado() {
        super();
        valorAPagar = 0.0;
    }

    @Override
    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(int horasTrabalhadas) {
        valorAPagar = horasTrabalhadas * ControlePagamento.HORA;
    }
            
}
