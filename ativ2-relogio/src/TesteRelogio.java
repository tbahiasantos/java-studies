
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class TesteRelogio {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Relogio r1 = new Relogio();
        
        System.out.print("Digite o formato das horas (12: AM/PM, 24: 24H): ");
        int formato = input.nextInt();

        if (formato == 12)
            System.out.println("Formato 12 horas");
        if (formato == 24)
            System.out.println("Formato 24 horas");
        
        for (int i=0; i<1440; i++){
            if (formato == 12){ 
                if (i < 719){
                    r1.ticTac(12);
                    System.out.printf("%02d:%02d a.m.\n", r1.getHora().getValor(), r1.getMinuto().getValor());
                }
                else {
                    r1.ticTac(12);
                    System.out.printf("%02d:%02d p.m.\n", r1.getHora().getValor(), r1.getMinuto().getValor());               
                }
            }
            if(formato == 24){
                r1.ticTac(24);
                System.out.printf("%02d:%02d\n", r1.getHora().getValor(), r1.getMinuto().getValor());
            }             
        }
    }
}
