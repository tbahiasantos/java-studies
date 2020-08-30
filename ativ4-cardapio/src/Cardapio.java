/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class Cardapio {
    
    private Refeicao[][] cardapio;
    private String[] nomesSemana = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
    private String[] horarios = {"Cafe", "Lanche1", "Almoco", "Lanche2", "Jantar", "Ceia"};

    public Cardapio() {
        cardapio = new Refeicao[6][7];         
    }

    public Refeicao[][] getCardapio() {
        return cardapio;
    }

    public void setCardapio(Refeicao[][] cardapio) {
        this.cardapio = cardapio;
    }

    public String[] getNomesSemana() {
        return nomesSemana;
    }

    public void setNomesSemana(String[] nomesSemana) {
        this.nomesSemana = nomesSemana;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }
    
    public boolean incluirRefeicao(String dia, String horario, Refeicao refeicao) {
        for (int j=0; j<7; j++) {
            if (dia.equals(nomesSemana[j])) {
                for (int i=0; i<6; i++) {
                    if (horario.equals(horarios[i])) {
                        if (cardapio[i][j] == null) {
                            cardapio[i][j] = refeicao;
                            return true;
                        }                    
                    }
                }            
            }
        }          
        return false;
    }
    
    public boolean excluirRefeicao(String dia, String horario) {
        for (int j=0; j<7; j++) {
            if (dia.equals(nomesSemana[j])) {
                for (int i=0; i<6; i++) {
                    if (horario.equals(horarios[i])) {
                        if (cardapio[i][j] != null) {
                            cardapio[i][j] = null;
                            return true;
                        }                    
                    }
                }            
            }
        }          
        return false;
    }
    
    public boolean substituirRefeicao(String dia, String horario, Refeicao refeicao) {
        for (int j=0; j<7; j++) {
            if (dia.equals(nomesSemana[j])) {
                for (int i=0; i<6; i++) {
                    if (horario.equals(horarios[i])) {
                            cardapio[i][j] = refeicao;
                            return true;                    
                    }
                }            
            }
        }          
        return false;     
    }
    
    public void listarDia(String dia) {
        System.out.print("Refeições de " + dia);
        System.out.println();      
        for (int j=0; j<7; j++) {
            if (dia.equals(nomesSemana[j])) {
                for (int i=0; i<6; i++) {
                    if (cardapio[i][j] != null) {
                        System.out.println(horarios[i]);
                        System.out.println(cardapio[i][j].getDescricao());
                        System.out.println(cardapio[i][j].getValorCalorico());
                        System.out.println();
                    }
                    else if (cardapio[i][j] == null){
                        System.out.println(horarios[i]);
                        System.out.println("Vazio.");
                        System.out.println();                                                                     
                    }
                }
            }
        }
    }
    
    public void listarCardapio() {
        for (int j=0; j<7; j++){
            System.out.print(nomesSemana[j]);
            System.out.println();
            for (int i=0; i<6; i++){
                if (cardapio[i][j] != null) {                
                    System.out.println(horarios[i]);
                    System.out.println(cardapio[i][j].getDescricao());
                    System.out.println(cardapio[i][j].getValorCalorico());
                    System.out.println();
                }
                else if (cardapio[i][j] == null){
                    System.out.println(horarios[i]);
                    System.out.println("Vazio.");
                    System.out.println();                                                                     
                }                
            }
        }
    }
    
    public void totalCalorias() {
        double valorCalorico = 0.0;
        for (int j=0; j<7; j++){
            for (int i=0; i<6; i++){
                if (cardapio[i][j] != null)
                    valorCalorico = valorCalorico + cardapio[i][j].getValorCalorico();
            }           
        }
        System.out.println("Total de calorias consumidas na semana: " + valorCalorico);
    }
    
}
