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
public class Professor extends Usuario {
    
    private String titulacao;
    private String grauAcademico;
    private String disciplina;

    public Professor() {
        titulacao = "";
        grauAcademico = "";
        disciplina = "";
    }

    public Professor(String titulacao, String grauAcademico, String disciplina) {
        this.titulacao = titulacao;
        this.grauAcademico = grauAcademico;
        this.disciplina = disciplina;
    }

    public Professor(String titulacao, String grauAcademico, String disciplina, String id, String login, String senha, String nome, ArrayList<Publicacao> carteira) {
        super(id, login, senha, nome, carteira);
        this.titulacao = titulacao;
        this.grauAcademico = grauAcademico;
        this.disciplina = disciplina;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getGrauAcademico() {
        return grauAcademico;
    }

    public void setGrauAcademico(String grauAcademico) {
        this.grauAcademico = grauAcademico;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
