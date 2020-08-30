
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
public class TesteAgenda {
    
    private static AgendaPessoal agenda = new AgendaPessoal();
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int op = 0;        
        while (op != 4){
            
            System.out.println("MENU - AGENDA PESSOAL");
            System.out.println("1. Inserir um contato");
            System.out.println("2. Pesquisar um contato");
            System.out.println("3. Listar tudo");
            System.out.println("4. Sair");
            System.out.println();
            
            do {
                System.out.print("Entrada: ");
                op = teclado.nextInt();
                System.out.println();
            } while (op < 0 || op > 4);
            
            switch(op) {
                case 1:
                    inserirContato(); break;
                case 2:
                    pesquisarContato(); break;
                case 3:
                    listarContatos(); break;
                case 0:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
            }
        }
    }
    
   public static void inserirContato(){
       Contato contato;
       String nome, telefone, email;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Inserindo contato...");
       System.out.print("Nome: ");
       nome = input.nextLine();
       System.out.print("Telefone: ");
       telefone = input.nextLine();
       System.out.print("E-mail: ");
       email = input.nextLine();
       contato = new Contato(nome, telefone, email);
       agenda.adicionarContato(contato);
   }
   
   public static void pesquisarContato(){

       Contato contato;
       String nome, telefone;
       int op;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("SUBMENU - PESQUISAR");
       System.out.println("1. Pesquisar por nome");
       System.out.println("2. Pesquisar por telefone");
       System.out.println();
       
       System.out.println("Entrada: ");
       op = input.nextInt();
       System.out.println();
       
       if(op == 1){
           System.out.println("Pesquisando contato...");
           System.out.print("Informe o nome a ser pesquisado: ");
           nome = input.next();
           System.out.println(""+agenda.pesquisaNome(nome));
       }
       else{
           System.out.println("Pesquisando contato...");
           System.out.print("Informe o telefone a ser pesquisado: ");
           telefone = input.next();
           System.out.println(""+agenda.pesquisaTelefone(telefone));
       }
   }
   
   public static void listarContatos(){
       System.out.println(agenda.listaAgenda());
   }
   
}
