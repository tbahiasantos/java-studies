
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
public class SistemaPagamentoTeste {
    
    public static void main(String[] args) {
        
        ControlePagamento controle = new ControlePagamento();
        
        Scanner input = new Scanner(System.in);
        
        int op = 0;
        int subop = 0;
        while (op != 4){
            System.out.println();
            System.out.println("MENU - PAGAMENTO");
            System.out.println("1. Adicionar Vencimento");
            System.out.println("2. Adicionar Conta");
            System.out.println("3. Exibir");
            System.out.println("4. Sair");
            
            System.out.print("Opção: ");
            op = input.nextInt();
            System.out.println();
            
            if (op == 1){
                System.out.println("SUBMENU - ADICIONAR VENCIMENTO");
                System.out.println("1. Funcionário Assalariado");
                System.out.println("2. Funcionário Terceirizado");
                System.out.println("3. Funcionário Comissionado");
                System.out.println("4. Funcionário Assalariado/Comissionado");
                
                System.out.print("Opção: ");
                subop = input.nextInt();
                System.out.println();                
                
                if (subop == 1){
                    System.out.println("Adicionando Vencimento de Funcionário Assalariado...");
                    Assalariado assalariado = new Assalariado();
                    System.out.print("Nome: ");
                    assalariado.setNome(input.next());
                    System.out.print("Sobrenome: ");
                    assalariado.setSobrenome(input.next());
                    System.out.print("Número de Identificação: ");
                    assalariado.setNumIdent(input.nextInt());
                    System.out.print("Horas Trabalhadas/Semana: ");
                    assalariado.setValorAPagar(input.nextInt());
                    //Adicionando funcionário assalariado na lista de pagamentos.
                    controle.getListaPagavel().add(assalariado);
                }
                
                else if (subop == 2){
                    System.out.println("Adicionando Vencimento de Funcionário Terceirizado...");
                    Terceirizado terceirizado = new Terceirizado();
                    System.out.print("Nome: ");
                    terceirizado.setNome(input.next());
                    System.out.print("Sobrenome: ");
                    terceirizado.setSobrenome(input.next());
                    System.out.print("Número de Identificação: ");
                    terceirizado.setNumIdent(input.nextInt());
                    System.out.print("Horas Trabalhadas: ");
                    terceirizado.setValorAPagar(input.nextInt());                    
                    //Adicionando funcionário terceirizado na lista de pagamentos.                    
                    controle.getListaPagavel().add(terceirizado);                    
                }
                
                else if (subop == 3){
                    System.out.println("Adicionando Vencimento de Funcionário Comissionado...");
                    Comissionado comissionado = new Comissionado();
                    System.out.print("Nome: ");
                    comissionado.setNome(input.next());
                    System.out.print("Sobrenome: ");
                    comissionado.setSobrenome(input.next());
                    System.out.print("Número de Identificação: ");
                    comissionado.setNumIdent(input.nextInt());
                    System.out.print("Vendas Realizadas: ");
                    comissionado.setValorAPagar(input.nextDouble());                    
                    //Adicionando funcionário comissionado na lista de pagamentos.                    
                    controle.getListaPagavel().add(comissionado);                    
                }
                
                else if (subop == 4){
                    System.out.println("Adicionando Vencimento de Funcionário Assalariado/Comissionado...");
                    AssalariadoComissionado assalariadocomissionado = new AssalariadoComissionado();
                    System.out.print("Nome: ");
                    assalariadocomissionado.setNome(input.next());
                    System.out.print("Sobrenome: ");
                    assalariadocomissionado.setSobrenome(input.next());
                    System.out.print("Número de Identificação: ");
                    assalariadocomissionado.setNumIdent(input.nextInt());
                    System.out.print("Vendas Realizadas: ");
                    assalariadocomissionado.setValorAPagar(input.nextDouble());                    
                    //Adicionando funcionário assalariado/comissionado na lista de pagamentos.                    
                    controle.getListaPagavel().add(assalariadocomissionado);                                         
                }                
            }
            
            else if (op == 2){
                System.out.println("SUBMENU - ADICIONAR CONTA");
                System.out.println("1. Título");
                System.out.println("2. Concessionária");

                System.out.print("Opção: ");
                subop = input.nextInt();
                System.out.println();

                if (subop == 1){
                    System.out.println("Adicionando Título...");
                    Titulo titulo = new Titulo();
                    System.out.print("Dia de Vencimento: ");
                    titulo.setDia(input.nextInt());
                    System.out.print("Mês de Vencimento: ");
                    titulo.setMes(input.nextInt());
                    System.out.print("Valor: ");
                    titulo.setValor(input.nextDouble());
                    System.out.print("Dia de Pagamento: ");
                    int diaPagamento = input.nextInt();
                    System.out.println("Mês de Pagamento: ");
                    int mesPagamento = input.nextInt();
                    titulo.setValorAPagar(diaPagamento, mesPagamento);
                    //Adicionando título na lista de pagamentos.                     
                    controle.getListaPagavel().add(titulo);
                }

                else if (subop == 2){
                    System.out.println("Adicionando Concessionária...");
                    Concessionaria concessionaria = new Concessionaria();
                    System.out.print("Dia de Vencimento: ");
                    concessionaria.setDia(input.nextInt());
                    System.out.print("Mês de Vencimento: ");
                    concessionaria.setMes(input.nextInt());
                    System.out.print("Valor: ");
                    concessionaria.setValor(input.nextDouble());
                    concessionaria.setValorAPagar();
                    //Adicionando conta de concessionária na lista de pagamentos.                     
                    controle.getListaPagavel().add(concessionaria);                    
                }                
            }
            
            else if (op == 3){
                System.out.println("SUBMENU - EXIBIR"); 
                System.out.println("1. Exibir Funcionários");
                System.out.println("2. Exibir Contas");
                System.out.println("3. Exibir Mês");
                
                System.out.print("Opção: ");
                subop = input.nextInt();
                System.out.println();
                
                if (subop == 1){
                    System.out.println("Exibindo Vencimentos dos Funcionários...");
                    controle.valorAPagarTotalFuncionario();
                }
                
                else if (subop == 2){
                    System.out.println("Exibindo Faturas das Contas...");
                    controle.valorAPagarTotalConta();
                }
                
                else if (subop == 3){
                    System.out.println("Exibindo Mês...");
                    controle.valorAPagarTotalMes();
                }
            }           
        }      
    }    
}
