
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
public class TesteLeilao {
    
    public static void main(String[] args) {
        
        Leilao leilao = new Leilao(10);
        Scanner input = new Scanner(System.in);
        
        int op = 0;
        
        while (op != 4){
            System.out.println("LEILAO");
            System.out.println("Obs.: Esse Leilão comporta apenas 10 lotes.");
            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Adicionar Lote");
            System.out.println("2. Receber Lance");
            System.out.println("3. Imprimir Lotes");
            System.out.println("4. Encerrar Leilão");
            
            System.out.print("Opção: ");
            op = input.nextInt();
            System.out.println();
            
            if (op == 1) {
                System.out.println("Adicionando Lote...");
                Lote lote = new Lote();
                System.out.print("Descrição do Item: ");
                lote.setDescricao(input.next());
                lote.getMaiorLance().getPessoa().setNome("Vazio");
                lote.getMaiorLance().getPessoa().setContato("Vazio");
                lote.getMaiorLance().setValor(0.0);
                if (leilao.adicionaLote(lote))
                    System.out.println("Lote adicionado com sucesso.");
                else
                    System.out.println("Não foi possível adicionar o Lote.");
                System.out.println();
            }
            
            else if (op == 2) {
                System.out.println("Recebendo Lance...");
                Lance lance = new Lance();
                System.out.print("Nome do Participante: ");
                lance.getPessoa().setNome(input.next());
                System.out.print("Contato do Participante: ");
                lance.getPessoa().setContato(input.next());
                System.out.print("Valor do Lance: ");
                lance.setValor(input.nextDouble());
                System.out.print("Lote do Lance: ");
                if (leilao.recebeLance(lance, input.next()))
                    System.out.println("Lance recebido com sucesso.");
                else
                    System.out.println("Não foi possível receber o Lance.");
                System.out.println();
            }
            
            else if (op == 3) {
                System.out.println("Imprimindo Lotes...");
                leilao.imprimeLotes();
                System.out.println();                
            }
            
            else if (op == 4) {
                System.out.println("Encerrando Leilão...");
                leilao.encerraLeilao();
            }            
        }
    }   
    
}