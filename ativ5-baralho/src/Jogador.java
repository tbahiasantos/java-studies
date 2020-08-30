/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Jogador {
    
    private Carta[] mao;
    
    Jogador(int numCartas) { 
        mao = new Carta[numCartas];
    }

    public Carta[] getMao() {
        return mao;
    }

    public void setMao(Carta[] mao) {
        this.mao = mao;
    }
    
    public Carta maiorCarta() {
        Carta carta = mao[0];
        for (int i=1; i<mao.length; i++) {
            if (carta.getValor() < mao[i].getValor())
                carta = mao[i];
            else if (carta.getValor() == mao[i].getValor())
                if (mao[i].getNaipe().equals("Ouros"))
                    carta = mao[i];
        }
        return carta;
    }
    
}
