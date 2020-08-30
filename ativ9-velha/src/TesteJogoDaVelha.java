/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author tbahi
 */
public class TesteJogoDaVelha {
    
    public static void main(String[] args) {
        
        JogoDaVelha velha = new JogoDaVelha();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("JOGO DA VELHA");
        
        while (velha.verificaFinalDeJogo() == false) {
            System.out.println("Jogada " + velha.getRodadaAtual() + "...");
            System.out.print("Sinal: ");
            String sinal = scanner.next();
            System.out.print("Linha: ");
            int linha = scanner.nextInt();
            System.out.print("Coluna: ");
            int coluna = scanner.nextInt();
            velha.recebeJogada(sinal, linha, coluna);
            System.out.println();            
        }
        
    }
    
}
