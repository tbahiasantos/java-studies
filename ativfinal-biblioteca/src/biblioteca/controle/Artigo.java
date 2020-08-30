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
public class Artigo extends Publicacao {
    
    private String local;
    private String instituicao;

    public Artigo() {
        local = "";
        instituicao = "";
    }

    public Artigo(String local, String instituicao) {
        this.local = local;
        this.instituicao = instituicao;
    }

    public Artigo(String local, String instituicao, String id, int ano, boolean disponivel, String titulo, String assunto, ArrayList<Autor> autor) {
        super(id, ano, disponivel, titulo, assunto, autor);
        this.local = local;
        this.instituicao = instituicao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
}
