/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Lote {
    
    private String descricao;
    private Lance maiorLance;

    public Lote() {
        descricao = "";
        maiorLance = new Lance();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lance getMaiorLance() {
        return maiorLance;
    }

    public void setMaiorLance(Lance maiorLance) {
        this.maiorLance = maiorLance;
    }
    
    public void verificaLance(Lance lance) {
        if (lance.getValor() > maiorLance.getValor())
            maiorLance = lance;            
    }
    
}
