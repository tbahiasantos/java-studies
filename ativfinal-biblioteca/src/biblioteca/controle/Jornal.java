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
public class Jornal extends Periodico {
    
    private int dia;

    public Jornal() {
        dia = 0;
    }

    public Jornal(int dia) {
        this.dia = dia;
    }

    public Jornal(int dia, int issn, int mes) {
        super(issn, mes);
        this.dia = dia;
    }

    public Jornal(int dia, int issn, int mes, String id, int ano, boolean disponivel, String titulo, String assunto, ArrayList<Autor> autor) {
        super(issn, mes, id, ano, disponivel, titulo, assunto, autor);
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
}
