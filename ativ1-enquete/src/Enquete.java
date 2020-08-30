/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Enquete {
    
    private int[] notas;
    private int[] frequencia;
    private double media;
    private int entrevistados;

    public Enquete(int num) {
        notas = new int[num];
        frequencia = new int[10];
        media = 0.0;
        entrevistados = 0;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int[] getFrequencia() {
        return frequencia;
    }

    public void setFrequencia() {      
        for (int i=0; i<notas.length; i++){
            if (notas[i] == 1)
                frequencia[0]++;
            else if (notas[i] == 2)
                frequencia[1]++;                
            else if (notas[i] == 3)  
                frequencia[2]++;                
            else if (notas[i] == 4)
                frequencia[3]++;                
            else if (notas[i] == 5)
                frequencia[4]++;                
            else if (notas[i] == 6)
                frequencia[5]++;                
            else if (notas[i] == 7)
                frequencia[6]++;                
            else if (notas[i] == 8)
                frequencia[7]++;                
            else if (notas[i] == 9)
                frequencia[8]++;                
            else if (notas[i] == 10) 
                frequencia[9]++;                        
        }             
    }  

    public double getMedia() {
        return media;
    }

    public void setMedia(int[] notas) {
        for (int i=0; i<notas.length; i++)
            media += notas[i];
        media /= entrevistados;
    }

    public int getEntrevistados() {
        return entrevistados;
    }

    public void setEntrevistados(int entrevistados) {
        this.entrevistados = entrevistados;
    }
    
}
