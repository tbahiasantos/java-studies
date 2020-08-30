/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.controle;

import java.util.ArrayList;

/**
 *
 * @author Thiago Lima Bahia Santos
 * @author Fúlvio Taroni Monteforte
 */
public abstract class Usuario {
    
    protected String id;
    protected String login;
    protected String senha;
    protected String nome;
    protected ArrayList<Publicacao> carteira;

    public Usuario() {
        id = "";
        login = "";
        senha = "";
        nome = "";
        carteira = new ArrayList<>();
    }

    public Usuario(String id, String login, String senha, String nome, ArrayList<Publicacao> carteira) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.carteira = carteira;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Publicacao> getCarteira() {
        return carteira;
    }

    public void setCarteira(ArrayList<Publicacao> carteira) {
        this.carteira = carteira;
    }
    
}
