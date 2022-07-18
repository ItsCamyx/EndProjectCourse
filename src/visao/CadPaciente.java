/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.PacienteVO;
import servicos.PacienteServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Aluno
 */
public class CadPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadPaciente
     */
    public CadPaciente() {
        initComponents();
    }
 private void cadastrar(){
    try{
        PacienteVO pVO = new PacienteVO();
    
     pVO.setNome(jtNome.getText());
     pVO.setDataNasc(jtDataNasc.getText());
     pVO.setEx1(jtExame1.getText());
     pVO.setEx2(jtExame2.getText());
     pVO.setEx3(jtExame3.getText());
    
     JOptionPane.showMessageDialog(
     rootPane,
             "Cadastro realizado com Sucesso !",
             "Sucesso!",
             JOptionPane.PLAIN_MESSAGE);
     PacienteServicos ps = ServicosFactory.getPacienteServicos();
     ps.cadastrarPaciente(pVO);
    }catch(Exception e){
 JOptionPane.showMessageDialog(
        rootPane,
         "Erro ao realizar Cadastro !" + e.getMessage(),
         "ERRO!",
          JOptionPane.ERROR_MESSAGE);
    }
 }
    private void limpar(){
        
        jtNome.setText(null);
        jtExame1.setText(null);
        jtExame2.setText(null);
        jtExame3.setText(null);
        jtDataNasc.setText(null);
        
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlDataNasc = new javax.swing.JLabel();
        jtDataNasc = new javax.swing.JTextField();
        jlExame1 = new javax.swing.JLabel();
        jtExame1 = new javax.swing.JTextField();
        jlExame2 = new javax.swing.JLabel();
        jtExame2 = new javax.swing.JTextField();
        jlExame3 = new javax.swing.JLabel();
        jtExame3 = new javax.swing.JTextField();
        jtbCadastrar = new javax.swing.JButton();
        jtbLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jlNome.setText("Nome:");

        jlDataNasc.setText("Data de Nascimento");

        jlExame1.setText("Exame 1:");

        jlExame2.setText("Exame 2:");

        jlExame3.setText("Exame 3:");

        jtbCadastrar.setText("Cadastrar");
        jtbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbCadastrarActionPerformed(evt);
            }
        });
        jtbCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbCadastrarKeyPressed(evt);
            }
        });

        jtbLimpar.setText("Limpar");
        jtbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbLimparActionPerformed(evt);
            }
        });
        jtbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbLimparKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlDataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlExame1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtExame1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlExame2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtExame2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlExame3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtExame3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jtbCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtbLimpar)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataNasc)
                    .addComponent(jtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlExame1)
                    .addComponent(jtExame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlExame2)
                    .addComponent(jtExame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlExame3)
                    .addComponent(jtExame3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbCadastrar)
                    .addComponent(jtbLimpar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbCadastrarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_jtbCadastrarActionPerformed

    private void jtbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbLimparActionPerformed

       limpar();
    }//GEN-LAST:event_jtbLimparActionPerformed

    private void jtbCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbCadastrarKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrar();
            limpar();   
    }
    }//GEN-LAST:event_jtbCadastrarKeyPressed

    private void jtbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbLimparKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limpar();
        }
    }//GEN-LAST:event_jtbLimparKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlExame1;
    private javax.swing.JLabel jlExame2;
    private javax.swing.JLabel jlExame3;
    private javax.swing.JLabel jlNome;
    private javax.swing.JTextField jtDataNasc;
    private javax.swing.JTextField jtExame1;
    private javax.swing.JTextField jtExame2;
    private javax.swing.JTextField jtExame3;
    private javax.swing.JTextField jtNome;
    private javax.swing.JButton jtbCadastrar;
    private javax.swing.JButton jtbLimpar;
    // End of variables declaration//GEN-END:variables
}
