
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
public class TesteCardapio {
    
    public static void main(String[] args) {
        
        System.out.println("Cardápio Semanal");
        
        Cardapio cardapio = new Cardapio();
        Scanner input = new Scanner(System.in);

        int op = 0;
        
        while (op != 7) {
            System.out.println("MENU");
            System.out.println("1. Incluir Refeição");
            System.out.println("2. Excluir Refeição");
            System.out.println("3. Substituir Refeição");
            System.out.println("4. Listar Dia");
            System.out.println("5. Listar Cardápio");
            System.out.println("6. Valor Calórico");
            System.out.println("7. Sair");
            
            System.out.print("Opção: ");
            op = input.nextInt();
            
            if (op == 1) {
                System.out.println("Incluindo Refeição...");
                Refeicao refeicao = new Refeicao();
                System.out.print("Descriçao: ");
                refeicao.setDescricao(input.next());
                System.out.print("Valor calórico: ");
                refeicao.setValorCalorico(input.nextDouble());
                System.out.print("Dia: ");
                String dia = input.next();
                System.out.print("Horário: ");
                String horario = input.next();
                if (cardapio.incluirRefeicao(dia, horario, refeicao))
                    System.out.println("Refeição incluida com sucesso!");
                else
                    System.out.println("O dia/horário selecionado já possui uma refeição.");
                System.out.println();
                
            }
            
            else if (op == 2) {
                System.out.println("Excluindo Refeição...");
                System.out.print("Dia: ");
                String dia = input.next();
                System.out.print("Horário: ");
                String horario = input.next();
                if (cardapio.excluirRefeicao(dia, horario))
                    System.out.println("Refeição excluida com sucesso!");
                else
                    System.out.println("O dia/horário selecionado não possui uma refeição.");
                System.out.println();                
            }
            
            else if (op == 3) {
                System.out.println("Substituindo Refeição...");
                Refeicao refeicao = new Refeicao();                
                System.out.print("Descriçao: ");
                refeicao.setDescricao(input.next());
                System.out.print("Valor calórico: ");
                refeicao.setValorCalorico(input.nextDouble());
                System.out.print("Dia: ");
                String dia = input.next();
                System.out.print("Horário: ");
                String horario = input.next();
                if (cardapio.substituirRefeicao(dia, horario, refeicao))
                    System.out.println("Refeição substituida com sucesso!");
                else   
                    System.out.println("Não foi possível substituir a refeição.");
                System.out.println();
            }
            
            else if (op == 4) {
                System.out.println("Listando dia...");
                System.out.print("Dia: ");
                cardapio.listarDia(input.next());
                System.out.println();
            }
            
            else if (op == 5) {
                System.out.println("Listando Cardápio...");
                cardapio.listarCardapio();
                System.out.println();
            }

            else if (op == 6) {
                System.out.println("Calculando calorias totais...");
                cardapio.totalCalorias();
                System.out.println();                
            }
        }
        
        System.out.println("Programa encerrado.");        
    }
    
}
