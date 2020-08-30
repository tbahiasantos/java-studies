
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class TesteEnquete {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   
        System.out.print("Digite o numero de alunos pesquisados: ");
        int num = input.nextInt();
        Enquete enquete = new Enquete(num);        
        enquete.setEntrevistados(num);
        int[] vetor = new int[num];
        SecureRandom gerador = new SecureRandom();
        for (int i=0; i<vetor.length; i++)
            vetor[i] = gerador.nextInt(10)+1;       
        enquete.setNotas(vetor);
        System.out.print("Vetor de números aleatórios: ");
        System.out.println(Arrays.toString(enquete.getNotas()));
        enquete.setFrequencia();
        for (int i=0; i<10; i++)
            System.out.println("Frequência da nota " + (i+1) + " é: " + enquete.getFrequencia()[i]);
        enquete.setMedia(vetor);
        System.out.println("A nota média é: " + enquete.getMedia());
        
    }
    
}
