package ProjetoFinal;

/**
 * @author gustavop
 */
public class Calculadora extends javax.swing.JFrame {
    
    public Calculadora() {
        initComponents();
    }
    float convSinal;
    String acao;  // A - adicao / S - subtracao / M - multiplicacao / D - divisao
    float numero;
    //float converterSinal;
    //String operacao;
   // float numero1; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tela = new javax.swing.JTextArea();
        BotaoUm = new javax.swing.JButton();
        BotaoSete = new javax.swing.JButton();
        BotaoQuatro = new javax.swing.JButton();
        BotaoDois = new javax.swing.JButton();
        BotaoTres = new javax.swing.JButton();
        BotaoCinco = new javax.swing.JButton();
        BotaoOito = new javax.swing.JButton();
        BotaoNove = new javax.swing.JButton();
        BotaoSeis = new javax.swing.JButton();
        BotaoZero = new javax.swing.JButton();
        BotaoVirgula = new javax.swing.JButton();
        BotaoSinal = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoSoma = new javax.swing.JButton();
        BotaoSubtracao = new javax.swing.JButton();
        BotaoMultiplicacao = new javax.swing.JButton();
        BotaoDivisao = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Tela.setColumns(1);
        Tela.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Tela.setLineWrap(true);
        Tela.setRows(1);
        Tela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora Pacetech", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jScrollPane1.setViewportView(Tela);
        Tela.getAccessibleContext().setAccessibleName("Calculadora Pacetech");

        BotaoUm.setText("1");
        BotaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUmActionPerformed(evt);
            }
        });

        BotaoSete.setText("7");
        BotaoSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSeteActionPerformed(evt);
            }
        });

        BotaoQuatro.setText("4");
        BotaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoQuatroActionPerformed(evt);
            }
        });

        BotaoDois.setText("2");
        BotaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDoisActionPerformed(evt);
            }
        });

        BotaoTres.setText("3");
        BotaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTresActionPerformed(evt);
            }
        });

        BotaoCinco.setText("5");
        BotaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCincoActionPerformed(evt);
            }
        });

        BotaoOito.setText("8");
        BotaoOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOitoActionPerformed(evt);
            }
        });

        BotaoNove.setText("9");
        BotaoNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNoveActionPerformed(evt);
            }
        });

        BotaoSeis.setText("6");
        BotaoSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSeisActionPerformed(evt);
            }
        });

        BotaoZero.setText("0");
        BotaoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoZeroActionPerformed(evt);
            }
        });

        BotaoVirgula.setText(",");
        BotaoVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVirgulaActionPerformed(evt);
            }
        });

        BotaoSinal.setText("+/-");
        BotaoSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSinalActionPerformed(evt);
            }
        });

        BotaoIgual.setText("=");
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });

        BotaoSoma.setText("+");
        BotaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSomaActionPerformed(evt);
            }
        });

        BotaoSubtracao.setText("-");
        BotaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSubtracaoActionPerformed(evt);
            }
        });

        BotaoMultiplicacao.setText("x");
        BotaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicacaoActionPerformed(evt);
            }
        });

        BotaoDivisao.setText("/");
        BotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivisaoActionPerformed(evt);
            }
        });

        BotaoLimpar.setText("CE");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BotaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUmActionPerformed
       Tela.setText(Tela.getText()+BotaoUm.getText());
    }//GEN-LAST:event_BotaoUmActionPerformed

    private void BotaoSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSeteActionPerformed
        Tela.setText(Tela.getText()+BotaoSete.getText());
    }//GEN-LAST:event_BotaoSeteActionPerformed

    private void BotaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoQuatroActionPerformed
        Tela.setText(Tela.getText()+BotaoQuatro.getText());
    }//GEN-LAST:event_BotaoQuatroActionPerformed

    private void BotaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDoisActionPerformed
       Tela.setText(Tela.getText()+BotaoDois.getText());
    }//GEN-LAST:event_BotaoDoisActionPerformed

    private void BotaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTresActionPerformed
         Tela.setText(Tela.getText()+BotaoTres.getText());
    }//GEN-LAST:event_BotaoTresActionPerformed

    private void BotaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCincoActionPerformed
         Tela.setText(Tela.getText()+BotaoCinco.getText());
    }//GEN-LAST:event_BotaoCincoActionPerformed

    private void BotaoOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOitoActionPerformed
        Tela.setText(Tela.getText()+BotaoOito.getText());
    }//GEN-LAST:event_BotaoOitoActionPerformed

    private void BotaoNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNoveActionPerformed
        Tela.setText(Tela.getText()+BotaoNove.getText());
    }//GEN-LAST:event_BotaoNoveActionPerformed

    private void BotaoSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSeisActionPerformed
        Tela.setText(Tela.getText()+BotaoSeis.getText());
    }//GEN-LAST:event_BotaoSeisActionPerformed

    private void BotaoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoZeroActionPerformed
          Tela.setText(Tela.getText()+BotaoZero.getText());
    }//GEN-LAST:event_BotaoZeroActionPerformed

    private void BotaoVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVirgulaActionPerformed
        Tela.setText(Tela.getText()+".");
    }//GEN-LAST:event_BotaoVirgulaActionPerformed

    private void BotaoSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSinalActionPerformed
        convSinal = Float.parseFloat(Tela.getText());
        Tela.setText(Float.toString(convSinal*(-1)));
    }//GEN-LAST:event_BotaoSinalActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
       switch (acao) {
            case "A":
            Tela.setText(Float.toString(numero+(Float.parseFloat(Tela.getText()))));
            break;
            case "S":
            Tela.setText(Float.toString(numero-(Float.parseFloat(Tela.getText()))));
            break;
            case "M":
            Tela.setText(Float.toString(numero*(Float.parseFloat(Tela.getText()))));  
            break;
            case "D":
            Tela.setText(Float.toString(numero/(Float.parseFloat(Tela.getText()))));  
            break;
        }
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSomaActionPerformed
        numero = Float.parseFloat(Tela.getText());
        acao = "A";
        Tela.setText("");
    }//GEN-LAST:event_BotaoSomaActionPerformed

    private void BotaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSubtracaoActionPerformed
        numero = Float.parseFloat(Tela.getText());
        acao = "S";
        Tela.setText("");
    }//GEN-LAST:event_BotaoSubtracaoActionPerformed

    private void BotaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicacaoActionPerformed
        numero = Float.parseFloat(Tela.getText());
        acao = "M";
        Tela.setText("");
    }//GEN-LAST:event_BotaoMultiplicacaoActionPerformed

    private void BotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivisaoActionPerformed
        numero = Float.parseFloat(Tela.getText());
        acao = "D";
        Tela.setText("");
    }//GEN-LAST:event_BotaoDivisaoActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        Tela.setText("");
    }//GEN-LAST:event_BotaoLimparActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCinco;
    private javax.swing.JButton BotaoDivisao;
    private javax.swing.JButton BotaoDois;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoMultiplicacao;
    private javax.swing.JButton BotaoNove;
    private javax.swing.JButton BotaoOito;
    private javax.swing.JButton BotaoQuatro;
    private javax.swing.JButton BotaoSeis;
    private javax.swing.JButton BotaoSete;
    private javax.swing.JButton BotaoSinal;
    private javax.swing.JButton BotaoSoma;
    private javax.swing.JButton BotaoSubtracao;
    private javax.swing.JButton BotaoTres;
    private javax.swing.JButton BotaoUm;
    private javax.swing.JButton BotaoVirgula;
    private javax.swing.JButton BotaoZero;
    private javax.swing.JTextArea Tela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
