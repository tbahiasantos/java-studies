/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Contador {
    
    private int limite;
    private int valor;
 
    public Contador() {
        limite = -1;
        valor = -1;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void incrementar() {
        valor = valor + 1;
        if (valor == limite)
            valor = 0;
    }  
}