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
public abstract class Publicacao {
    
    protected String id;
    protected int ano;
    protected boolean disponivel;
    protected String titulo;
    protected String assunto;
    protected ArrayList<Autor> autor;

    public Publicacao() {
        id = "";
        ano = 0;
        disponivel = true;
        titulo = "";
        assunto = "";
        autor = new ArrayList<>();
    }

    public Publicacao(String id, int ano, boolean disponivel, String titulo, String assunto, ArrayList<Autor> autor) {
        this.id = id;
        this.ano = ano;
        this.disponivel = disponivel;
        this.titulo = titulo;
        this.assunto = assunto;
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public ArrayList<Autor> getAutor() {
        return autor;
    }

    public void setAutor(ArrayList<Autor> autor) {
        this.autor = autor;
    }
    
}
