package velha.visao;

import velha.controle.JogoDaVelha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbahi
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    JogoDaVelha velha;
    
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
        velha = new JogoDaVelha();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPaneMensagem = new javax.swing.JOptionPane();
        jLabel = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jToggleButtonX = new javax.swing.JToggleButton();
        jToggleButtonO = new javax.swing.JToggleButton();
        jTextField00 = new javax.swing.JTextField();
        jTextField01 = new javax.swing.JTextField();
        jTextField02 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Escolha sua peça e clique na opção desejada.");

        jToggleButtonX.setText("X");
        jToggleButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonXActionPerformed(evt);
            }
        });

        jToggleButtonO.setText("O");
        jToggleButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonOActionPerformed(evt);
            }
        });

        jTextField00.setEditable(false);
        jTextField00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField00MouseClicked(evt);
            }
        });

        jTextField01.setEditable(false);
        jTextField01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField01MouseClicked(evt);
            }
        });

        jTextField02.setEditable(false);
        jTextField02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField02MouseClicked(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });

        jTextField20.setEditable(false);
        jTextField20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField20MouseClicked(evt);
            }
        });

        jTextField21.setEditable(false);
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField21MouseClicked(evt);
            }
        });

        jTextField22.setEditable(false);
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField00, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField01, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonSair))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextField00.setText("");
        jTextField01.setText("");
        jTextField02.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jToggleButtonX.setEnabled(true);        
        jToggleButtonO.setEnabled(true);

        velha.limpaTabuleiro();
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextField00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField00MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField00.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);
            
            velha.recebeJogada("X", 0, 0);
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE); 
        
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField00.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true); 
            
             velha.recebeJogada("O", 0, 0);  
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);             
             
        }
    }//GEN-LAST:event_jTextField00MouseClicked

    private void jTextField01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField01MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField01.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);
            
            velha.recebeJogada("X", 0, 1);
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);             
            
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField01.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true); 
            
            velha.recebeJogada("O", 0, 1); 
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);             
            
        }
    }//GEN-LAST:event_jTextField01MouseClicked

    private void jTextField02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField02MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField02.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);
            
            velha.recebeJogada("X", 0, 2); 
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);            
            
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField02.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true);  
            
            velha.recebeJogada("O", 0, 2); 
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);             
            
        }
    }//GEN-LAST:event_jTextField02MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField10.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);
            
            velha.recebeJogada("X", 1, 0);    
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);             
            
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField10.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true);   
            
            velha.recebeJogada("O", 1, 0);   
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);             
            
        }
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField11.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);
            
            velha.recebeJogada("X", 1, 1);  
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);            
            
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField11.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true);

            velha.recebeJogada("O", 1, 1); 
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);            
            
        }
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField12.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);

            velha.recebeJogada("X", 1, 2);  
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);            
            
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField12.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true); 
            
            velha.recebeJogada("O", 1, 2); 
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);            
            
        }
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField20MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField20.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);
            
            velha.recebeJogada("X", 2, 0);
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);          
            
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField20.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true);

            velha.recebeJogada("O", 2, 0);  
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);             
            
        }
    }//GEN-LAST:event_jTextField20MouseClicked

    private void jTextField21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField21.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);
            
            velha.recebeJogada("X", 2, 1);
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);            
            
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField21.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true);

            velha.recebeJogada("O", 2, 1); 
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);            
            
        }
    }//GEN-LAST:event_jTextField21MouseClicked

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
        if (jToggleButtonX.isSelected()) {
            jTextField22.setText("X");
            jToggleButtonX.doClick();
            jToggleButtonX.setEnabled(false);
            jToggleButtonO.setEnabled(true);
            
            velha.recebeJogada("X", 2, 2); 
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);             
            
        }            
        if (jToggleButtonO.isSelected()) {
            jTextField22.setText("O");
            jToggleButtonO.doClick();            
            jToggleButtonO.setEnabled(false);
            jToggleButtonX.setEnabled(true);

            velha.recebeJogada("O", 2, 2);
            if (velha.verificaFinalDeJogo())
                jOptionPaneMensagem.showMessageDialog(jSeparator, velha.getJogadorVencedor(), "Final de Jogo", 
                        jOptionPaneMensagem.INFORMATION_MESSAGE);            
            
        }
    }//GEN-LAST:event_jTextField22MouseClicked

    private void jToggleButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonXActionPerformed
        if (jToggleButtonX.isSelected() && jToggleButtonO.isSelected())
            jToggleButtonO.doClick();
    }//GEN-LAST:event_jToggleButtonXActionPerformed

    private void jToggleButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonOActionPerformed
        if (jToggleButtonX.isSelected() && jToggleButtonO.isSelected())
            jToggleButtonX.doClick();
    }//GEN-LAST:event_jToggleButtonOActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel;
    private javax.swing.JOptionPane jOptionPaneMensagem;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTextField00;
    private javax.swing.JTextField jTextField01;
    private javax.swing.JTextField jTextField02;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JToggleButton jToggleButtonO;
    private javax.swing.JToggleButton jToggleButtonX;
    // End of variables declaration//GEN-END:variables
}