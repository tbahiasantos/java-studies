

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tbahi
 */
public abstract class FormaBidimensional extends Forma {
    
    public abstract double obterArea();  
    public void obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException("Não foi possível obter o volume.");
    }
        
}
