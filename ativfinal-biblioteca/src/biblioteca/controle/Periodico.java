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
public abstract class Periodico extends Publicacao {
    
    protected int issn;
    protected int mes;

    public Periodico() {
        issn = 0;
        mes = 0;
    }

    public Periodico(int issn, int mes) {
        this.issn = issn;
        this.mes = mes;
    }

    public Periodico(int issn, int mes, String id, int ano, boolean disponivel, String titulo, String assunto, ArrayList<Autor> autor) {
        super(id, ano, disponivel, titulo, assunto, autor);
        this.issn = issn;
        this.mes = mes;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
}
