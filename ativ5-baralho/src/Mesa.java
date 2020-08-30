
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Mesa {
    
    public static void main(String[] args) {
        char op = 'S';
        while (op != 'N') {
            Baralho baralho = new Baralho();
            System.out.println("Montando baralho...");
            baralho.montarBaralho();
            System.out.println("Mesa embaralhando...");
            baralho.embaralharCartas();     
            System.out.print("Informe o número de cartas a distribuir para os jogadores: ");
            Scanner input = new Scanner(System.in);
            int numCartas = input.nextInt();
            Jogador jogadorA = new Jogador(numCartas);
            Jogador jogadorB = new Jogador(numCartas);
            for (int i=0, j=numCartas; i<numCartas; i++, j++) {
                jogadorA.getMao()[i] = baralho.getBaralho()[i];
                jogadorB.getMao()[i] = baralho.getBaralho()[j];       
            }
            System.out.println("Mesa distribuiu as " + numCartas + " cartas para o jogador A e para o jogador B.");
            System.out.println("O jogador A joga a carta de naipe " + jogadorA.maiorCarta().getNaipe() 
                    + " e de valor " + jogadorA.maiorCarta().getValor());     
            System.out.println("O jogador B joga a carta de naipe " + jogadorB.maiorCarta().getNaipe() 
                    + " e de valor " + jogadorB.maiorCarta().getValor());
            if (jogadorA.maiorCarta().getValor() > jogadorB.maiorCarta().getValor())
                System.out.println("O jogador A venceu o jogo.");
            else if (jogadorA.maiorCarta().getValor() < jogadorB.maiorCarta().getValor())
                System.out.println("O jogador B venceu o jogo.");
            else if (jogadorA.maiorCarta().getValor() == jogadorB.maiorCarta().getValor()){
                if (jogadorA.maiorCarta().getNaipe().equals("Ouros"))
                    System.out.println("O jogador A venceu o jogo.");
                else if (jogadorB.maiorCarta().getNaipe().equals("Ouros"))
                    System.out.println("O jogador B venceu o jogo.");
                else
                    System.out.println("Como os valores das cartas são iguais e nenhum jogador tem carta de Ouros, "
                            + "o jogo ficou empatado!");
            }
            System.out.print("Jogar novamente? (S/N): ");
            op = input.next().charAt(0);
        }
        System.out.println("Jogo encerrado.");
    }
    
}
