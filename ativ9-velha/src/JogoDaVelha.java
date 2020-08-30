/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tbahi
 */
public class JogoDaVelha {
    
    private String[][] tabuleiro;
    private String jogadorVencedor;
    private int rodadaAtual;

    public JogoDaVelha() {
        tabuleiro = new String[3][3];
        jogadorVencedor = "O Jogo deu Velha.";
        rodadaAtual = 1;
    }

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public String getJogadorVencedor() {
        return jogadorVencedor;
    }

    public void setJogadorVencedor(String jogadorVencedor) {
        this.jogadorVencedor = jogadorVencedor;
    }

    public int getRodadaAtual() {
        return rodadaAtual;
    }

    public void setRodadaAtual(int rodadaAtual) {
        this.rodadaAtual = rodadaAtual;
    }
    
    public void recebeJogada(String sinal, int linha, int coluna) {
        tabuleiro[linha][coluna] = sinal;
        if (verificaFinalDeJogo())
            System.out.println(jogadorVencedor);
        rodadaAtual++;
    }
    
    public boolean verificaLinha() {
        String linha1 = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2]; 
        String linha2 = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2];
        String linha3 = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];      
        if (linha1.equals("XXX") | linha2.equals("XXX") | linha3.equals("XXX")) {
            jogadorVencedor = "O Jogador X venceu o jogo.";
            return true;
        }
        if (linha1.equals("OOO") | linha2.equals("OOO") | linha3.equals("OOO")) {
            jogadorVencedor = "O Jogador O venceu o jogo.";
            return true;
        }
        return false;
    }
    
    public boolean verificaColuna() {
        String coluna1 = tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0];     
        String coluna2 = tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1];     
        String coluna3 = tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2];     
        if (coluna1.equals("XXX") | coluna2.equals("XXX") | coluna3.equals("XXX")) {
            jogadorVencedor = "O Jogador X venceu o jogo.";
            return true;
        }
        if (coluna1.equals("OOO") | coluna2.equals("OOO") | coluna3.equals("OOO")) {
            jogadorVencedor = "O Jogador O venceu o jogo.";
            return true;
        }
        return false;
    }

    public boolean verificaDiagonal() {
        String diagonal1 = tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];          
        String diagonal2 = tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0];          
        if (diagonal1.equals("XXX") | diagonal2.equals("XXX")) {
            jogadorVencedor = "O Jogador X venceu o jogo.";
            return true;
        }
        if (diagonal1.equals("OOO") | diagonal2.equals("OOO")) {
            jogadorVencedor = "O Jogador O venceu o jogo.";
            return true;
        }
        return false;
    }

    public boolean verificaFinalDeJogo() {
        if (verificaLinha() | verificaColuna() | verificaDiagonal() | rodadaAtual > 9)
            return true;
        return false;
    }
    
}
