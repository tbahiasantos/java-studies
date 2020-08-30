/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Relogio {
    
    private Contador hora;
    private Contador minuto;

    public Relogio() {
        hora = new Contador();
        minuto = new Contador();
    }

    public Contador getHora() {
        return hora;
    }

    public void setHora(Contador hora) {
        this.hora = hora;
    }

    public Contador getMinuto() {
        return minuto;
    }

    public void setMinuto(Contador minuto) {
        this.minuto = minuto;
    }
    
    public void ticTac(int formato) {
        if (formato == 12) {
            minuto.setLimite(60);
            hora.setLimite(12);
        }
        if (formato == 24) {
            minuto.setLimite(60);
            hora.setLimite(24);
        }
        
        minuto.incrementar();
        
        if (minuto.getValor() == 0)
            hora.incrementar();       
    }   
}