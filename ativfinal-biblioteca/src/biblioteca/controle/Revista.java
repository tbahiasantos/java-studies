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
public class Revista extends Periodico {
    
    private Editora editora;

    public Revista() {
        editora = new Editora();
    }    

    public Revista(Editora editora) {
        this.editora = editora;
    }

    public Revista(Editora editora, int issn, int mes) {
        super(issn, mes);
        this.editora = editora;
    }

    public Revista(Editora editora, int issn, int mes, String id, int ano, boolean disponivel, String titulo, String assunto, ArrayList<Autor> autor) {
        super(issn, mes, id, ano, disponivel, titulo, assunto, autor);
        this.editora = editora;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    } 
    
}
