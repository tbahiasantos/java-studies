
import java.security.SecureRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Baralho {
    
    private Carta[] baralho;

    public Baralho() {
        baralho = new Carta[52];
    }
    
    public Carta[] getBaralho() {
        return baralho;
    }

    public void setBaralho(Carta[] baralho) {
        this.baralho = baralho;
    }
    
    public void montarBaralho() {
        for (int i=0, j=0; i<13; i++, j++) {
            Carta carta = new Carta();
            carta.setNaipe("Paus");
            carta.setValor(i+1);
            baralho[j] = carta;
        }
        for (int i=0, j=13; i<13; i++, j++) {
            Carta carta = new Carta();
            carta.setNaipe("Ouros");
            carta.setValor(i+1);
            baralho[j] = carta;
        }   
        for (int i=0, j=26; i<13; i++, j++) {
            Carta carta = new Carta();
            carta.setNaipe("Copas");
            carta.setValor(i+1);
            baralho[j] = carta;
        }           
        for (int i=0, j=39; i<13; i++, j++) {
            Carta carta = new Carta();
            carta.setNaipe("Espadas");
            carta.setValor(i+1);
            baralho[j] = carta;
        }           
    }
    
    public void embaralharCartas() {
        Carta carta;
        SecureRandom random = new SecureRandom();
        for (int i=0; i<1000; i++) {
            int j = random.nextInt(52);
            int k = random.nextInt(52);
            carta = baralho[j];
            baralho[j] = baralho[k];
            baralho[k] = carta;
        }
    }
    
}
