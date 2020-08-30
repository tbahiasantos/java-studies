/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Leilao {
    
    private Lote[] leilao;
   
    public Leilao(int n) {
        leilao = new Lote[n];
    }

    public Lote[] getLeilao() {
        return leilao;
    }

    public void setLeilao(Lote[] leilao) {
        this.leilao = leilao;
    }

    public boolean adicionaLote(Lote lote) {
        for(int i=0; i<leilao.length; i++) {
            if (leilao[i] == null) {
                leilao[i] = lote;
                return true;
            }
        }
        return false;
    }
    
    public boolean recebeLance(Lance lance, String descricao) {
        for(int i=0; i<leilao.length; i++) {
            if (leilao[i].getDescricao().equals(descricao)){
                leilao[i].verificaLance(lance);
                return true;
            }
        }
        return false;
    }
    
    public void imprimeLotes() {;
        System.out.println("Esses são os lotes e lances atuais.");
        for (int i=0; i<leilao.length; i++) {
            if (leilao[i] != null) {
                System.out.println(leilao[i].getDescricao() + ": Lance atual em R$" + leilao[i].getMaiorLance().getValor() 
                        + ", para " + leilao[i].getMaiorLance().getPessoa().getNome() + ".");
            }    
        }            
    }
    
    public void encerraLeilao() {
        for (int i=0; i<leilao.length; i++){
            if (leilao[i] != null) {
                System.out.println(leilao[i].getDescricao() + ": Vendido por R$" + leilao[i].getMaiorLance().getValor() 
                    + ", para " + leilao[i].getMaiorLance().getPessoa().getNome() + ".");
            }
        }        
    }
        
}
