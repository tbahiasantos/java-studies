/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Titulo extends Conta {

    private double valorAPagar; 
    
    public Titulo() {
        super();
        valorAPagar = 0.0;
    }

    @Override
    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(int diaPagamento, int mesPagamento) {
        if (mesPagamento < super.getMes())
            valorAPagar = super.getValor();
        else if (mesPagamento == super.getMes()){
            if (diaPagamento <= super.getDia())
                valorAPagar = super.getValor();
            else if (diaPagamento > super.getDia())
                valorAPagar = super.getValor() + (super.getValor() * 0.1);
        }
        else if (mesPagamento > super.getMes())
            valorAPagar = super.getValor() + (super.getValor() * 0.1);
    }
    
}
