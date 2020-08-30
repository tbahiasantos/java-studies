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
public class PreLoading {
        
/*
 *  Classe de pré-carregamento de uma coleção de Usuários e Publicações.
 */    
    
    public static Aluno preLoadAluno1(){
       Aluno aluno = new Aluno();
       aluno.setId("001");
       aluno.setLogin("thiago");
       aluno.setSenha("thiago123");
       aluno.setNome("Thiago Lima Bahia Santos");
       aluno.setCurso("Administração");
       aluno.setPeriodo("7º Período");
       return aluno;
    }
   
    public static Aluno preLoadAluno2(){
       Aluno aluno = new Aluno();
       aluno.setId("002");
       aluno.setLogin("fulvio");
       aluno.setSenha("fulvio123");
       aluno.setNome("Fúlvio Taroni Monteforte");
       aluno.setCurso("Engenharia de Computação");
       aluno.setPeriodo("4º Período");
       return aluno;
    }   
   
    public static Professor preLoadProfessor1(){
       Professor professor = new Professor();
       professor.setId("001");
       professor.setLogin("luciana");
       professor.setNome("Luciana Maria de Assis Campos");
       professor.setSenha("luciana123");
       professor.setTitulacao("Ciência da Computação");
       professor.setGrauAcademico("Doutorado");
       professor.setDisciplina("Programação de Computadores II");   
       return professor;
    } 
   
    public static Professor preLoadProfessor2(){
       Professor professor = new Professor();
       professor.setId("002");
       professor.setLogin("joao");
       professor.setNome("João Ferreira dos Reis");
       professor.setSenha("joao123");
       professor.setTitulacao("Engenharia de Minas");
       professor.setGrauAcademico("Mestrado");
       professor.setDisciplina("Engenhação de Computaria");   
       return professor;
    }   
   
    public static Artigo preLoadArtigo1(){
       Artigo artigo = new Artigo();
       artigo.setId("14852"); 
       artigo.setTitulo("Realidade virtual e lógica do espaço");       
       artigo.setAssunto("Artigo Científico");             
       Autor autor1 = new Autor();
       autor1.setNome("Jaqueline Esther Schiavoni");
       Autor autor2 = new Autor();
       autor2.setNome("Marina Sabará");
       ArrayList<Autor> autores = new ArrayList<>();
       autores.add(autor1);
       autores.add(autor2);
       artigo.setAutor(autores);       
       artigo.setAno(2014);
       artigo.setLocal("São Paulo");
       artigo.setInstituicao("Universidade de São Paulo");
       artigo.setDisponivel(true);            
       return artigo;
    }
   
    public static Artigo preLoadArtigo2(){
       Artigo artigo = new Artigo();
       artigo.setId("64821"); 
       artigo.setTitulo("A ética na época da imaginação digital");       
       artigo.setAssunto("Artigo Científico");             
       Autor autor1 = new Autor();
       autor1.setNome("Dirk Michael Hennrich");
       Autor autor2 = new Autor();
       autor2.setNome("Tony Stark");
       ArrayList<Autor> autores = new ArrayList<>();
       autores.add(autor1);
       autores.add(autor2);
       artigo.setAutor(autores);       
       artigo.setAno(1996);
       artigo.setLocal("Lisboa");
       artigo.setInstituicao("Universidade de Lisboa");
       artigo.setDisponivel(true);            
       return artigo;
    }   

    public static Jornal preLoadJornal1(){
       Jornal jornal = new Jornal();
       jornal.setId("67898");
       jornal.setTitulo("The New York Times");       
       jornal.setAssunto("Atualidades");       
       Autor autor1 = new Autor();
       autor1.setNome("Fernando Souza Laube");
       Autor autor2 = new Autor();
       autor2.setNome("Henrique Assunção Brasil");
       Autor autor3 = new Autor();
       autor3.setNome("Ayrton Senna de Souza");
       ArrayList<Autor> autores = new ArrayList<>();
       autores.add(autor1);
       autores.add(autor2);
       autores.add(autor3);     
       jornal.setAutor(autores);
       jornal.setAno(1999);
       jornal.setMes(11);
       jornal.setDia(23);
       jornal.setIssn(4567876);
       jornal.setDisponivel(true);
       return jornal;
    }
   
    public static Jornal preLoadJornal2(){
       Jornal jornal = new Jornal();
       jornal.setId("64431");
       jornal.setTitulo("Estado de Minas");       
       jornal.setAssunto("Notícias Diárias");       
       Autor autor1 = new Autor();
       autor1.setNome("Gabriel Dias Ribeiro");
       Autor autor2 = new Autor();
       autor2.setNome("Marta Assunção dos Santos");
       Autor autor3 = new Autor();
       autor3.setNome("Rubinho Barrichelo");
       ArrayList<Autor> autores = new ArrayList<>();
       autores.add(autor1);
       autores.add(autor2);
       autores.add(autor3);     
       jornal.setAutor(autores);
       jornal.setAno(1999);
       jornal.setMes(11);
       jornal.setDia(23);
       jornal.setIssn(4567876);
       jornal.setDisponivel(true);
       return jornal;
    }
   
    public static Livro preLoadLivro1(){
       Livro livro = new Livro();
       livro.setId("54321"); 
       livro.setTitulo("Harry Potter e o Enigma do Príncipe");       
       livro.setAssunto("Fantasia");
       Autor autor1 = new Autor();
       autor1.setNome("J. K. Rowling");
       Autor autor2 = new Autor();
       autor2.setNome("Nick Fury");      
       ArrayList<Autor> autores = new ArrayList<>();
       autores.add(autor1);
       autores.add(autor2);
       livro.setAutor(autores);
       livro.setAno(2005);       
       livro.setIsbn(747581088);
       livro.setVolume(6);
       livro.setEdicao(1);
       Editora editora = new Editora();
       editora.setNome("Rocco");
       livro.setEditora(editora);       
       livro.setDisponivel(true);   
       return livro;
    }
   
    public static Livro preLoadLivro2(){
       Livro livro = new Livro();
       livro.setId("94451"); 
       livro.setTitulo("Harry Potter e a Pedra Filosofal");       
       livro.setAssunto("Fantasia");
       Autor autor1 = new Autor();
       autor1.setNome("J. K. Rowling");
       Autor autor2 = new Autor();
       autor2.setNome("Bruce Banner");      
       Autor autor3 = new Autor();
       autor3.setNome("Natasha Romanoff");      
       ArrayList<Autor> autores = new ArrayList<>();
       autores.add(autor1);
       autores.add(autor2);
       autores.add(autor3);
       livro.setAutor(autores);
       livro.setAno(1997);       
       livro.setIsbn(978870063);
       livro.setVolume(1);
       livro.setEdicao(7);
       Editora editora = new Editora();
       editora.setNome("Rocco");
       livro.setEditora(editora);       
       livro.setDisponivel(true);   
       return livro;
    }
   
    public static Revista preLoadRevista1(){
       Revista revista = new Revista();
       revista.setId("55198");
       revista.setTitulo("Caras");
       revista.setAssunto("Fofoca");
       Autor autor1 = new Autor();
       Autor autor2 = new Autor();
       autor1.setNome("Carla Campos");
       autor2.setNome("Carol Mafra");
       ArrayList<Autor> autores = new ArrayList<>();
       autores.add(autor1);
       autores.add(autor2);
       revista.setAutor(autores);       
       revista.setAno(2018); 
       revista.setIssn(13245);
       revista.setMes(4);        
       Editora editora = new Editora();
       editora.setNome("Caras");   
       revista.setEditora(editora);
       revista.setDisponivel(true);  
       return revista;
    }
   
    public static Revista preLoadRevista2(){
       Revista revista = new Revista();
       revista.setId("33485");
       revista.setTitulo("Veja");
       revista.setAssunto("Atualidades");
       Autor autor1 = new Autor();
       Autor autor2 = new Autor();
       autor1.setNome("Maria dos Campos Reis");
       autor2.setNome("Roberto Campolina Faria");
       ArrayList<Autor> autores = new ArrayList<>();
       autores.add(autor1);
       autores.add(autor2);
       revista.setAutor(autores);       
       revista.setAno(2018); 
       revista.setIssn(13245);
       revista.setMes(4);        
       Editora editora = new Editora();
       editora.setNome("Abril");   
       revista.setEditora(editora);
       revista.setDisponivel(true);  
       return revista;
    }   
   
}
