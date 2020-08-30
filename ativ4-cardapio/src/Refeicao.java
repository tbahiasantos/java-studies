/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Refeicao {
    
    private String descricao;
    private double valorCalorico;

    public Refeicao() {
        descricao = "";
        valorCalorico = 0.0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCalorico() {
        return valorCalorico;
    }

    public void setValorCalorico(double valorCalorico) {
        this.valorCalorico = valorCalorico;
    }
    
}
