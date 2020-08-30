/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.controle;

/**
 *
 * @author Thiago Lima Bahia Santos
 * @author Fúlvio Taroni Monteforte
 */
public class Editora {
    
    private String nome;

    public Editora() {
        nome = "";
    }

    public Editora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
