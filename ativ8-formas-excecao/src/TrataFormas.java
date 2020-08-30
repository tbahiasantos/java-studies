

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tbahi
 */
public class TrataFormas {
    
    private ArrayList<Forma> colecaoForma;

    public TrataFormas() {
        colecaoForma = new ArrayList<>();
    }

    public ArrayList<Forma> getColecaoForma() {
        return colecaoForma;
    }

    public void setColecaoForma(ArrayList<Forma> colecaoForma) {
        this.colecaoForma = colecaoForma;
    }
    
    public void trataFormas() {    
        Iterator<Forma> iterator = colecaoForma.iterator();
        while (iterator.hasNext()) {
            Forma aux = iterator.next();
            if (aux instanceof Quadrado) {             
                System.out.println("Objeto: Quadrado.");
                System.out.println("Forma: Bidimensional");                  
                System.out.println("Lado: " + ((Quadrado)aux).getLado());
                System.out.println("Área: " + ((Quadrado)aux).obterArea());
                try {
                    ((Quadrado)aux).obterVolume();
                } catch (NaoExisteVolumeException ex) {
                    System.out.println(ex.getMessage());
                    System.out.println();                     
                }
            }
            else if (aux instanceof Circulo) {               
                System.out.println("Objeto: Circulo.");
                System.out.println("Forma: Bidimensional");                  
                System.out.println("Raio: " + ((Circulo)aux).getRaio());                
                System.out.println("Área: " + ((Circulo)aux).obterArea());
                try {
                    ((Circulo)aux).obterVolume();
                } catch (NaoExisteVolumeException ex) {
                    System.out.println(ex.getMessage());;
                    System.out.println();                     
                }                               
            }
            else if (aux instanceof Triangulo) {                 
                System.out.println("Objeto: Triangulo.");
                System.out.println("Forma: Bidimensional");                 
                System.out.println("Lado: " + ((Triangulo)aux).getLado());                
                System.out.println("Área: " + ((Triangulo)aux).obterArea());
                try {
                    ((Triangulo)aux).obterVolume();
                } catch (NaoExisteVolumeException ex) {
                    System.out.println(ex.getMessage());;
                    System.out.println();                     
                }                             
            }

            else if (aux instanceof Cubo) {                  
                System.out.println("Objeto: Cubo.");
                System.out.println("Forma: Tridimensional");                
                System.out.println("Lado: " + ((Cubo)aux).getLado());                
                System.out.println("Área: " + ((Cubo)aux).obterArea());
                System.out.println("Volume: " + ((Cubo)aux).obterVolume());
                System.out.println();                
            }
            else if (aux instanceof Esfera) {                
                System.out.println("Objeto: Esfera.");
                System.out.println("Forma: Tridimensional");                
                System.out.println("Raio: " + ((Esfera)aux).getRaio());                
                System.out.println("Área: " + ((Esfera)aux).obterArea());
                System.out.println("Volume: " + ((Esfera)aux).obterVolume());
                System.out.println();                
            }
            else if (aux instanceof Tetraedro) {
                System.out.println("Objeto: Tetraedro.");
                System.out.println("Forma: Tridimensional");                  
                System.out.println("Lado: " + ((Tetraedro)aux).getLado());                
                System.out.println("Área: " + ((Tetraedro)aux).obterArea());
                System.out.println("Volume: " + ((Tetraedro)aux).obterVolume());
                System.out.println();                
            }
        }
    }   
    
}
