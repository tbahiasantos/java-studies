
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class ManipulaArquivoTexto {
    
    private Set<String> agenda;
    private String nomeArquivo;
    private boolean booleanFormatter;
    private boolean booleanFileReader;
    File arquivo;

    public ManipulaArquivoTexto(String nomeArquivo) {
        agenda = new LinkedHashSet<>();
        this.nomeArquivo = nomeArquivo;
        this.booleanFormatter = false;
        this.booleanFileReader = false;
        arquivo = new File(nomeArquivo + ".txt");
        String mensagem;
        try {
            arquivo.createNewFile();
            arquivo.exists();
            mensagem = "O arquivo foi criado com sucesso.\n";            
        } catch (IOException e) {
            mensagem = "Erro: Ocorreu um erro ao criar o arquivo.\n";            
        }
        retornoSistema(mensagem);
    }

    public Set<String> getAgenda() {
        return agenda;
    }

    public void setAgenda(Set<String> agenda) {
        this.agenda = agenda;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public boolean isBooleanFormatter() {
        return booleanFormatter;
    }

    public void setBooleanFormatter(boolean booleanFormatter) {
        this.booleanFormatter = booleanFormatter;
    }

    public boolean isBooleanFileReader() {
        return booleanFileReader;
    }

    public void setBooleanFileReader(boolean booleanFileReader) {
        this.booleanFileReader = booleanFileReader;
    }

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }    

    public boolean salvarContatoFormatter(Contato contato) {
        String mensagem;
        try {
            Formatter formatter;
            formatter = new Formatter(this.nomeArquivo + ".txt");
            formatter.format(contato.toString() + "\r\n", false);
            formatter.flush();
            formatter.close();
            mensagem = "O arquivo foi atualizado com sucesso.\n";
        } catch (IOException e) {
            System.out.println(e.getMessage());
            mensagem = "Erro: Ocorreu um erro ao salvar o contato.\n";            
        }
        return retornoSistema(mensagem);
    }
    
    public boolean salvarContatoFileWritter(Contato contato) {
        String mensagem;        
        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter(this.nomeArquivo + ".txt", true);
            BufferedWriter buffedWriter = new BufferedWriter(fileWriter);
            buffedWriter.write(contato.toString());
            buffedWriter.newLine();
            buffedWriter.close();
            mensagem = "Os dados foram inseridos com sucesso.\n";
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
            mensagem = "Erro: Ocorreu um erro ao inserir o contato no arquivo.\n";
        }
        return retornoSistema(mensagem);        
    }

    public boolean lerContatoScanner() {
        this.agenda.clear();
        String mensagem;
        try {
            Scanner scanner = new Scanner(new FileReader(this.nomeArquivo + ".txt"));
            while (scanner.hasNext()) {
                this.agenda.add(scanner.nextLine());                
            }
            mensagem = "Leitura realizada com sucesso.\n";
        } catch (IOException e) {
            System.out.println(e.getMessage());
            mensagem = "Erro: Ocorreu um erro ao ler o conteúdo do arquivo.\n";            
        }
        return retornoSistema(mensagem);
    }
    
    public boolean lerContatoFileReader() {
        String mensagem;
        try {
            FileReader fileReader = new FileReader(this.nomeArquivo + ".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String texto = "";
            while ((texto = bufferedReader.readLine()) != null) {
                this.agenda.add(texto);
            }
            bufferedReader.close();
            mensagem = "O arquivo foi fechado com sucesso.\n";
        } catch (IOException e) {
            System.out.println(e.getMessage());
            mensagem = "Erro: Ocorreu um erro ao ler o arquivo.\n";            
        }
        return retornoSistema(mensagem);
    }

    private boolean retornoSistema(String mensagem) {
        System.out.println(mensagem);
        if(mensagem.startsWith("Erro:")){
            return true;
        }
        else{
            return false;
        }
    }    
    
}
