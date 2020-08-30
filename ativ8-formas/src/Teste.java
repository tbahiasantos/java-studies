/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author tbahi
 */
public class Teste {
    
    public static void main(String[] args) {
        
        TrataFormas trataFormas = new TrataFormas();
        
        Scanner input = new Scanner(System.in);
        
        int op = 0;
        int subop = 0;
        while (op != 4) {
            System.out.println();
            System.out.println("MENU - FORMAS");
            System.out.println("1. Adicionar Forma Bidimensional");
            System.out.println("2. Adicionar Forma Tridimensional");
            System.out.println("3. Tratar Formas");
            System.out.println("4. Sair");
            
            System.out.print("Entrada: ");
            op = input.nextInt();
            System.out.println();
            
            if (op == 1) {
                System.out.println("SUBMENU - ADD BIDIMENSIONAL");
                System.out.println("1. Quadrado");
                System.out.println("2. Circulo");
                System.out.println("3. Triangulo");
                
                System.out.print("Entrada: ");
                subop = input.nextInt();
                System.out.println();                
                
                if (subop == 1) {
                    System.out.println("Adicionando Quadrado...");
                    Quadrado quadrado = new Quadrado();
                    System.out.print("Lado: ");
                    quadrado.setLado(input.nextDouble());
                    trataFormas.getColecaoForma().add(quadrado);
                }
                else if (subop == 2) {
                    System.out.println("Adicionando Circulo...");
                    Circulo circulo = new Circulo();
                    System.out.print("Raio: ");
                    circulo.setRaio(input.nextDouble());
                    trataFormas.getColecaoForma().add(circulo);                    
                }      
                else if (subop == 3) {
                    System.out.println("Adicionando Triangulo...");
                    Triangulo triangulo = new Triangulo();
                    System.out.print("Lado: ");
                    triangulo.setLado(input.nextDouble());
                    trataFormas.getColecaoForma().add(triangulo);                    
                }                  
            }
            
            else if (op == 2) {
                System.out.println("SUBMENU - ADD TRIDIMENSIONAL");
                System.out.println("1. Cubo");
                System.out.println("2. Esfera");
                System.out.println("3. Tetraedro");
                
                System.out.print("Entrada: ");
                subop = input.nextInt();
                System.out.println();
                
                if (subop == 1) {
                    System.out.println("Adicionando Cubo...");
                    Cubo cubo = new Cubo();
                    System.out.print("Lado: ");
                    cubo.setLado(input.nextDouble());
                    trataFormas.getColecaoForma().add(cubo);
                }
                else if (subop == 2) {
                    System.out.println("Adicionando Esfera...");
                    Esfera esfera = new Esfera();
                    System.out.print("Raio: ");
                    esfera.setRaio(input.nextDouble());
                    trataFormas.getColecaoForma().add(esfera);                    
                }      
                else if (subop == 3) {
                    System.out.println("Adicionando Tetraedro...");
                    Tetraedro tetraedro = new Tetraedro();
                    System.out.print("Lado: ");
                    tetraedro.setLado(input.nextDouble());
                    trataFormas.getColecaoForma().add(tetraedro);                    
                }                  
            }
            
            else if (op == 3) {
                System.out.println("Tratando Formas...");
                trataFormas.trataBidimensional();            
                trataFormas.trataTridimensional();
            }
        }     
    }
    
}
