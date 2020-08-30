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
public class Aluno extends Usuario {
    
    private String curso;
    private String periodo;

    public Aluno() {
        curso = "";
        periodo = "";
    }    

    public Aluno(String curso, String periodo) {
        this.curso = curso;
        this.periodo = periodo;
    }

    public Aluno(String curso, String periodo, String id, String login, String senha, String nome, ArrayList<Publicacao> carteira) {
        super(id, login, senha, nome, carteira);
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
}
