/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Assalariado extends Empregado {
    
    private double valorAPagar;

    public Assalariado() {
        super();
        valorAPagar = 0.0;
    }    

    @Override
    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(int horasSemana) {
        if (horasSemana <= 40){
            valorAPagar = ControlePagamento.SALARIO;
        }
        else if (horasSemana > 40){
            int horasExtras = horasSemana - 40;
            valorAPagar = ControlePagamento.SALARIO + (horasExtras * ControlePagamento.HORA);
        }
    }
    
}
