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
public class Livro extends Publicacao {
    
    private int isbn;
    private int volume;
    private int edicao;
    private Editora editora;

    public Livro() {
        super();
        isbn = 0;
        volume = 0;
        edicao = 0;
        editora = new Editora();
    }

    public Livro(int isbn, int volume, int edicao, Editora editora) {
        this.isbn = isbn;
        this.volume = volume;
        this.edicao = edicao;
        this.editora = editora;
    }

    public Livro(int isbn, int volume, int edicao, Editora editora, String id, int ano, boolean disponivel, String titulo, String assunto, ArrayList<Autor> autor) {
        super(id, ano, disponivel, titulo, assunto, autor);
        this.isbn = isbn;
        this.volume = volume;
        this.edicao = edicao;
        this.editora = editora;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
}
