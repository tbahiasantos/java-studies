
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class ControlePagamento {
    
    public static final double SALARIO = 954.00;
    public static final double HORA = 8.00;
    
    public ArrayList<Pagavel> listaPagavel; 

    public ControlePagamento() {
        listaPagavel = new ArrayList();
    }

    public ArrayList<Pagavel> getListaPagavel() {
        return listaPagavel;
    }

    public void setListaPagavel(ArrayList<Pagavel> listaPagavel) {
        this.listaPagavel = listaPagavel;
    } 
    
    public void valorAPagarTotalFuncionario(){
        double total = 0.0;
        Iterator<Pagavel> iterator = listaPagavel.iterator();
        while (iterator.hasNext()){
            Pagavel aux = iterator.next();
            if (aux instanceof Empregado){
                System.out.println("Funcionário: ");
                System.out.println("Id: " + ((Empregado) aux).getNumIdent() + ", Nome: " + ((Empregado) aux).getNome() 
                        + " " + ((Empregado) aux).getSobrenome() + ", Valor a Pagar: " + aux.getValorAPagar());
                total = total + aux.getValorAPagar();
            }
        }
        System.out.print("Total a Pagar para Funcionários: ");
        System.out.println("RS " + total);
    }
    
    public void valorAPagarTotalConta(){
        double total = 0.0;         
        Iterator<Pagavel> iterator = listaPagavel.iterator();
        while (iterator.hasNext()){
            Pagavel aux = iterator.next();
            if (aux instanceof Conta){
                System.out.println("Conta: ");
                System.out.println("Data de Vencimento: " + ((Conta) aux).getDia() + "/" + ((Conta) aux).getMes() 
                        + ", Valor da Conta: " + ((Conta) aux).getValor() + ", Valor Pago: " + aux.getValorAPagar());
                total = total + aux.getValorAPagar();                
            }
        }
        System.out.print("Total a Pagar em Contas: ");
        System.out.println("RS " + total);        
    }

    public void valorAPagarTotalMes(){
        double total = 0.0;
        Iterator<Pagavel> iterator = listaPagavel.iterator();
        while (iterator.hasNext()){
            Pagavel aux = iterator.next();
            if (aux instanceof Empregado){
                System.out.println("Funcionário: ");                
                System.out.println("Id: " + ((Empregado) aux).getNumIdent() + ", Nome: " + ((Empregado) aux).getNome() 
                        + " " + ((Empregado) aux).getSobrenome() + ", Valor a Pagar: " + aux.getValorAPagar());
                total = total + aux.getValorAPagar();                  
            }
            else if (aux instanceof Conta){
                System.out.println("Conta: ");                
                System.out.println("Data de Vencimento: " + ((Conta) aux).getDia() + "/" + ((Conta) aux).getMes() 
                        + ", Valor da Conta: " + ((Conta) aux).getValor() + ", Valor Pago: " + aux.getValorAPagar());
                total = total + aux.getValorAPagar();                  
            }
        }
        System.out.print("Total a Pagar no Mês: ");
        System.out.println("RS " + total);          
    }
    
}
