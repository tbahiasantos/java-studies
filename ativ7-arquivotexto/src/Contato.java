/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Contato {
    
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        nome = "";
        telefone = "";
        email = "";
    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  nome + ";" + telefone + ";" + email+";" ;
    }
    
    @Override
    public boolean equals(Object contato) {
        if (telefone.equals(((Contato)contato).getTelefone()) && email.equals(((Contato)contato).getEmail())){
            return true;
        }
        return false;            
    }
    
}
