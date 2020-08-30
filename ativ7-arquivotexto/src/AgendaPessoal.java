
import java.util.LinkedHashMap;
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
public class AgendaPessoal {
    
        private LinkedHashMap<Contato, Contato> agenda;
        private ManipulaArquivoTexto arquivo;

    public AgendaPessoal() {
        agenda = new LinkedHashMap<>();
        this.salvarAgenda();
    }

    public LinkedHashMap<Contato, Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(LinkedHashMap<Contato, Contato> agenda) {
        this.agenda = agenda;
    }

    public ManipulaArquivoTexto getArquivo() {
        return arquivo;
    }

    public void setArquivo(ManipulaArquivoTexto arquivo) {
        this.arquivo = arquivo;
    }
        
    public String pesquisaNome(String nome) {
        for (Contato contato : agenda.keySet()) {
            if (contato.getNome().equals(nome)) {
                return "Nome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone() 
                        + "\nEmail: " + contato.getEmail();
            }
        }
        return "O contato pesquisado não existe.";
    }
    
    public String pesquisaTelefone(String telefone) {
        for (Contato contato : agenda.keySet()) {
            if (contato.getTelefone().equals(telefone)) {
                return "Nome: " + contato.getNome()+"\nTelefone: " + contato.getTelefone()
                        + "\nEmail: "+contato.getEmail();
            }
        }
        return "O telefone pesquisado não existe.";
    }
    
    public String listaAgenda() {
        this.lerAgendaSalva();
        String lista = "";
        System.out.println();
        for (Contato contato : this.agenda.values()) {
            lista = lista + "\nNome: " + contato.getNome()+"\nTelefone: " + contato.getTelefone() 
                    + "\nEmail: " + contato.getEmail() + "\n";
        }
        return lista + "\n";
    }
    
    public void adicionarContato(Contato contato) {
        if(this.arquivo.isBooleanFormatter()){
            this.arquivo.salvarContatoFileWritter(contato);
        }
        else{
            this.arquivo.salvarContatoFormatter(contato);
            this.arquivo.setBooleanFormatter(true);
        }
    }    
    
     public void salvarAgenda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();
        this.arquivo = new ManipulaArquivoTexto(nomeArquivo);
    }
    
    public void lerAgendaSalva() {
        Contato contato;
        String nome, telefone, email;
        if (this.arquivo.isBooleanFileReader()) {
            this.arquivo.lerContatoScanner();
        } else {
            this.arquivo.lerContatoFileReader();
            this.arquivo.setBooleanFileReader(true);
        }
        for (String aux : this.arquivo.getAgenda()) {
            nome = aux.split(";")[0];
            telefone = aux.split(";")[1];
            email = aux.split(";")[2];
            contato = new Contato(nome, telefone, email);
            this.agenda.put(contato, contato);
        }
    }
    
}
