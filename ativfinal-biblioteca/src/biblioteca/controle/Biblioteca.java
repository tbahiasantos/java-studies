/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.controle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Thiago Lima Bahia Santos
 * @author Fúlvio Taroni Monteforte
 */
public class Biblioteca {
    
    private ArrayList<Usuario> usuario;
    private ArrayList<Publicacao> acervo;

    public Biblioteca() {
        usuario = new ArrayList<>();
        acervo = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Usuario> usuario, ArrayList<Publicacao> acervo) {
        this.usuario = usuario;
        this.acervo = acervo;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Publicacao> getAcervo() {
        return acervo;
    }

    public void setAcervo(ArrayList<Publicacao> acervo) {
        this.acervo = acervo;
    }
       
    public ArrayList<Autor> cadastrarColecaoAutor(String[] vetorAutor) {       
        ArrayList<Autor> colecaoAutor = new ArrayList<>();
        for (int i=0; i<vetorAutor.length; i++) {
            String nome = vetorAutor[i];            
            Autor autor = new Autor();
            autor.setNome(nome);
            colecaoAutor.add(autor);
        }
        return colecaoAutor;
    }
    
    private Editora cadastrarEditora(String nome) {
        Editora editora = new Editora();
        editora.setNome(nome);
        return editora;
    }
    
    public Livro cadastrarLivro(String id, int ano, String titulo, String assunto, String[] vetorAutor,
            int isbn, int volume, int edicao, String editora) {
        Scanner input = new Scanner(System.in);
        Livro livro = new Livro();
        livro.setId(id);
        livro.setAno(ano);
        livro.setDisponivel(true);
        livro.setTitulo(titulo);
        livro.setAssunto(assunto);  
        livro.setAutor(cadastrarColecaoAutor(vetorAutor));
        livro.setIsbn(isbn);
        livro.setVolume(volume);
        livro.setEdicao(edicao);
        livro.setEditora(cadastrarEditora(editora));
        return livro;
    }
    
    public Artigo cadastrarArtigo(String id, int ano, String titulo, String assunto, String[] vetorAutor,
            String local, String instituicao) {
        Artigo artigo = new Artigo();
        artigo.setId(id);
        artigo.setAno(ano);
        artigo.setDisponivel(true);
        artigo.setTitulo(titulo);
        artigo.setAssunto(assunto);
        artigo.setAutor(cadastrarColecaoAutor(vetorAutor));
        artigo.setLocal(local);
        artigo.setInstituicao(instituicao);
        return artigo;
    }
    
    public Jornal cadastrarJornal(String id, int ano, String titulo, String assunto, String[] vetorAutor,
            int issn, int mes, int dia) {
        Jornal jornal = new Jornal();
        jornal.setId(id);
        jornal.setAno(ano);
        jornal.setDisponivel(true);
        jornal.setTitulo(titulo);
        jornal.setAssunto(assunto);
        jornal.setAutor(cadastrarColecaoAutor(vetorAutor));
        jornal.setIssn(issn);
        jornal.setMes(mes);
        jornal.setDia(dia);
        return jornal;
    }
    
    public Revista cadastrarRevista(String id, int ano, String titulo, String assunto, String[] vetorAutor,
            int issn, int mes, String editora) {
        Revista revista = new Revista();
        revista.setId(id);
        revista.setAno(ano);
        revista.setDisponivel(true);
        revista.setTitulo(titulo);
        revista.setAssunto(assunto);
        revista.setAutor(cadastrarColecaoAutor(vetorAutor));
        revista.setIssn(issn);
        revista.setMes(mes);
        revista.setEditora(cadastrarEditora(editora));        
        return revista;
    }
 
    public Aluno cadastrarAluno(String id, String login, String senha, String nome, String curso, String periodo) {
        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno.setLogin(login);
        aluno.setSenha(senha);
        aluno.setNome(nome);
        aluno.setCurso(curso);
        aluno.setPeriodo(periodo);
        return aluno;
    }
    
    public Professor cadastrarProfessor(String id, String login, String senha, String nome,
            String titulacao, String grauAcademico, String disciplina) {
        Professor professor = new Professor();
        professor.setId(id);
        professor.setLogin(login);
        professor.setSenha(senha);
        professor.setNome(nome);
        professor.setTitulacao(titulacao);
        professor.setGrauAcademico(grauAcademico);
        professor.setDisciplina(disciplina);
        return professor;
    }
    
    public Usuario pesquisarUsuario(String login, String senha) {
        Iterator<Usuario> iterator = usuario.iterator();
        while(iterator.hasNext()) {
            Usuario aux = iterator.next();
            if (aux instanceof Aluno) { 
                if (((Aluno) aux).getLogin().equals(login) && ((Aluno) aux).getSenha().equals(senha))
                    return (Aluno) aux;
            }
            else if (aux instanceof Professor) {
                if (((Professor) aux).getLogin().equals(login) && ((Professor) aux).getSenha().equals(senha))
                    return (Professor) aux;     
            }
        }
        return null;
    }
    
    public Publicacao pesquisarPublicacao(String id, String titulo) {
         Iterator<Publicacao> iterator = acervo.iterator(); 
         while(iterator.hasNext()) {
             Publicacao aux = iterator.next();
             if (aux.getId().equals(id) | aux.getTitulo().equals(titulo))
                return aux;            
         }
         return null;
    }    
    
    public Artigo pesquisarArtigo(String id, String titulo) {
        Iterator<Publicacao> iterator = acervo.iterator(); 
        while(iterator.hasNext()) {
            Publicacao aux = iterator.next();
            if (aux instanceof Artigo) {
                if (((Artigo) aux).getId().equals(id) |  ((Artigo) aux).getTitulo().equals(titulo))
                    return (Artigo) aux;
            }            
        }
        return null;
    }
    
    public Livro pesquisarLivro(String id, String titulo) {
        Iterator<Publicacao> iterator = acervo.iterator(); 
        while(iterator.hasNext()) {
            Publicacao aux = iterator.next();
            if (aux instanceof Livro) {
                if (((Livro) aux).getId().equals(id) |  ((Livro) aux).getTitulo().equals(titulo))
                    return (Livro) aux;
            }            
        }
        return null;
    } 
    
    public Jornal pesquisarJornal(String id, String titulo) {
        Iterator<Publicacao> iterator = acervo.iterator(); 
        while(iterator.hasNext()) {
            Publicacao aux = iterator.next();
            if (aux instanceof Jornal) {
                if (((Jornal) aux).getId().equals(id) |  ((Jornal) aux).getTitulo().equals(titulo))
                    return (Jornal) aux;
            }            
        }
        return null;
    }   
    
    public Revista pesquisarRevista(String id, String titulo) {
        Iterator<Publicacao> iterator = acervo.iterator(); 
        while(iterator.hasNext()) {
            Publicacao aux = iterator.next();
            if (aux instanceof Revista) {
                if (((Revista) aux).getId().equals(id) |  ((Revista) aux).getTitulo().equals(titulo))
                    return (Revista) aux;
            }            
        }
        return null;
    }

    public int pesquisarIndicePublicacao(String id, String titulo) {
        Iterator<Publicacao> iterator = acervo.iterator();
        while(iterator.hasNext()) {
            Publicacao aux = iterator.next();
            if (aux.getId().equals(id) | aux.getTitulo().equals(titulo)) {
                    int indice = acervo.indexOf(aux);
                    return indice;
            }            
        }
        return -1;
    }
    
    public int pesquisarIndiceUsuario(String login, String senha) {
        Iterator<Usuario> iterator = usuario.iterator();
        while(iterator.hasNext()) {
            Usuario aux = iterator.next();
            if (aux.getLogin().equals(login) & aux.getSenha().equals(senha)) {
                    int indice = usuario.indexOf(aux);
                    return indice;
            }            
        }
        return -1;
    }    
    
/*   INSTRUÇÕES SOBRE O MÉTODO EMPRESTARPUBLICAÇÃO   
 *   O retorno de 0, 1, 2 e 3 visa corroborar as 4 situações de empréstimo possíveis.
 *   Opção (0) - A publicação não existe no acervo, 
 *   Opção (1) - A publicação existe, mas o usuário não existe, 
 *   Opção (2) - A publicação existe, está disponível e o usuário existe.
 *   Opção (3) - A publicação existe, mas não está disponível e o usuário existe.
 */
    public int emprestarPublicacao(String id, String titulo, String login, String senha) {
        int indicePublicacao = pesquisarIndicePublicacao(id, titulo);
        int indiceUsuario = pesquisarIndiceUsuario(login, senha);
        if (indicePublicacao == -1)
            return 0;
        else {
            if (indiceUsuario == -1)
                return 1;
            else {
                if (acervo.get(indicePublicacao).isDisponivel()) {
                    usuario.get(indiceUsuario).getCarteira().add(acervo.get(indicePublicacao));
                    acervo.get(indicePublicacao).setDisponivel(false);
                    return 2;
                }
                else {
                    return 3;
                }
            }
        }
    }

    
/*   INSTRUÇÕES SOBRE O MÉTODO DEVOLVERPUBLICAÇÃO   
 *   O retorno de 0, 1, 2 e 3 visa corroborar as 4 situações de empréstimo possíveis.
 *   Opção (0) - A publicação não existe no acervo, 
 *   Opção (1) - A publicação existe, mas o usuário não existe, 
 *   Opção (2) - A publicação existe, não está disponível e o usuário existe.
 *   Opção (3) - A publicação existe, mas está disponível e o usuário existe.
 */    
    public int devolverPublicacao(String id, String titulo, String login, String senha) {
        int indicePublicacao = pesquisarIndicePublicacao(id, titulo);
        int indiceUsuario = pesquisarIndiceUsuario(login, senha);
        if (indicePublicacao == -1)
            return 0;
        else {
            if (indiceUsuario == -1)
                return 1;
            else {
                if (!acervo.get(indicePublicacao).isDisponivel()) {
                    usuario.get(indiceUsuario).getCarteira().remove(acervo.get(indicePublicacao));
                    acervo.get(indicePublicacao).setDisponivel(true);
                    return 2;
                }
                else {
                    return 3;
                }
            }
        }
    }    
    
}
