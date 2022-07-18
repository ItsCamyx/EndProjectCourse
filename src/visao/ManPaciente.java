/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.PacienteVO;
import dao.PacienteDAO;
import servicos.PacienteServicos;
import servicos.ServicosFactory;
public class ManPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManPaciente
     */
    public ManPaciente() {
        initComponents();
    }
DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código","Nome","DataNasc","Exame 1","Exame 2","Exame 3"});
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jpPesquisa = new javax.swing.JPanel();
        jcbPesquisa = new javax.swing.JComboBox();
        jtPesquisa = new javax.swing.JTextField();
        jpAções = new javax.swing.JPanel();
        jbDeletar1 = new javax.swing.JButton();
        jbPreencherTabela = new javax.swing.JButton();
        jbLimparTabela = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtDataNasc = new javax.swing.JTextField();
        jbConfirmarAlteracao = new javax.swing.JButton();

        jbDeletar.setText("Deletar Aluno");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });
        jbDeletar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbDeletarKeyPressed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data de Nasc.", "Exame 1", "Exame 2", "Exame 3"
            }
        ));
        jScrollPane1.setViewportView(jtTabela);

        jpPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(0), "Pesquisa"));

        jcbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Data de Nasc." }));

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpPesquisaLayout = new javax.swing.GroupLayout(jpPesquisa);
        jpPesquisa.setLayout(jpPesquisaLayout);
        jpPesquisaLayout.setHorizontalGroup(
            jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jpPesquisaLayout.setVerticalGroup(
            jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpAções.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(0), "Ações"));

        jbDeletar1.setText("Deletar Paciente");
        jbDeletar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletar1ActionPerformed(evt);
            }
        });
        jbDeletar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbDeletar1KeyPressed(evt);
            }
        });

        jbPreencherTabela.setText("Preencher Tabela");
        jbPreencherTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreencherTabelaActionPerformed(evt);
            }
        });
        jbPreencherTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbPreencherTabelaKeyPressed(evt);
            }
        });

        jbLimparTabela.setText("Limpar Tabela");
        jbLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparTabelaActionPerformed(evt);
            }
        });
        jbLimparTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparTabelaKeyPressed(evt);
            }
        });

        jbAlterar.setText("Alterar Aluno");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jbAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAlterarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jpAçõesLayout = new javax.swing.GroupLayout(jpAções);
        jpAções.setLayout(jpAçõesLayout);
        jpAçõesLayout.setHorizontalGroup(
            jpAçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDeletar1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLimparTabela)
                .addGap(17, 17, 17)
                .addComponent(jbPreencherTabela)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jpAçõesLayout.setVerticalGroup(
            jpAçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAçõesLayout.createSequentialGroup()
                .addGroup(jpAçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeletar1)
                    .addComponent(jbLimparTabela)
                    .addComponent(jbPreencherTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterações"));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Data de Nascimento:");

        jtCodigo.setEditable(false);
        jtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtNome.setEditable(false);

        jtDataNasc.setEditable(false);
        jtDataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jbConfirmarAlteracao.setText("Confirmar Alteração");
        jbConfirmarAlteracao.setEnabled(false);
        jbConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAlteracaoActionPerformed(evt);
            }
        });
        jbConfirmarAlteracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbConfirmarAlteracaoKeyPressed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtDataNasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbConfirmarAlteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConfirmarAlteracao)
                        .addGap(99, 99, 99))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(131, Short.MAX_VALUE))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jbConfirmarAlteracao)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpAções, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 248, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpAções, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void preencherTabela(){
        
         try{
            
            PacienteServicos ps = ServicosFactory.getPacienteServicos();
            
            ArrayList<PacienteVO> paciente = new ArrayList<>();
            
            paciente = ps.buscarPaciente();
            
            for(int i = 0; i < paciente.size(); i++){
                
                dtm.addRow(new String[]{
                    String.valueOf(paciente.get(i).getIdPaciente()),
                    String.valueOf(paciente.get(i).getNome()),
                    String.valueOf(paciente.get(i).getDataNasc()),
                    String.valueOf(paciente.get(i).getEx1()),
                    String.valueOf(paciente.get(i).getEx2()),
                    String.valueOf(paciente.get(i).getEx3()),

                });
            }
                jtTabela.setModel(dtm);
                   
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,
                    "Erro: "+ e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
}
private void deletarAluno(){
        
        try{
            
            int linha = jtTabela.getSelectedRow();
            
            if(linha == -1){
                
                JOptionPane.showMessageDialog(rootPane,
                    "Você não selecionou nenhuma linha !",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                
            }else{
                
                PacienteServicos ps = ServicosFactory.getPacienteServicos();
                
                String idPaciente = (String) jtTabela.getValueAt(linha, 0);
               
                ps.deletarPaciente(Integer.parseInt(idPaciente));
                
                JOptionPane.showMessageDialog(rootPane,
                    "Aluno deletado com sucesso !",
                    "Sucesso",
                    JOptionPane.PLAIN_MESSAGE);
                
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(rootPane,
                    "Erro ao deletar: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
private void filtrar(){
        
        try{
            
            if(jtPesquisa.getText().isEmpty()){
                preencherTabela();
            }else{
                
               PacienteServicos ps = ServicosFactory.getPacienteServicos();                
                String pesquisa = (String) jcbPesquisa.getSelectedItem();                
                String query;
                
                if(pesquisa.equals("Código")){
                    query = "where idPaciente = " + jtPesquisa.getText();
                }else if(pesquisa.equals("Nome")){
                    query = "where nome like '%" + jtPesquisa.getText() + "%'";                    
                }else{
                    query = "where dataNasc = " + jtPesquisa.getText();
                }
                
                ArrayList<PacienteVO> paciente = new ArrayList<>();                
                paciente = ps.filtrarPacientes(query);
                
                for(int i = 0; i < paciente.size(); i++){
                    
                    dtm.addRow(new String[]{
                        String.valueOf(paciente.get(i).getIdPaciente()),
                        String.valueOf(paciente.get(i).getNome()),
                        String.valueOf(paciente.get(i).getDataNasc())
                    });
                    
                    jtTabela.setModel(dtm);
                    
                }
                
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(rootPane,
                    "Erro ao filtrar: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
private void alterar() {

        int linha = jtTabela.getSelectedRow();
        
        if(linha != -1){
            
            jbAlterar.setEnabled(false);
            jbDeletar.setEnabled(false);
            jbLimparTabela.setEnabled(false);
            jbPreencherTabela.setEnabled(false);
            jtNome.setEnabled(true);
            jtNome.setEditable(true);
            jtDataNasc.setEnabled(true);
            jtDataNasc.setEditable(true);
            
            jtCodigo.setText((String)jtTabela.getValueAt(linha, 0));
            jtNome.setText((String)jtTabela.getValueAt(linha, 1));
            jtDataNasc.setText((String)jtTabela.getValueAt(linha, 2));
            jbConfirmarAlteracao.setEnabled(true);
            
        }else{
            
            JOptionPane.showMessageDialog(rootPane, 
                    "Selecione um aluno da tabela !",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            
        }
        
    }

    private void confirmarAlteracao() {

        try {

            PacienteVO pVO = new PacienteVO();
            
            pVO.setIdPaciente(Integer.parseInt(jtCodigo.getText()));
            pVO.setNome(jtNome.getText());
            pVO.setDataNasc(jtDataNasc.getText());
            
            PacienteServicos as = ServicosFactory.getPacienteServicos();
            
            as.alterarPaciente(pVO);
            
            JOptionPane.showMessageDialog(rootPane, 
                    "Paciente alterado com sucesso !",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

            jbConfirmarAlteracao.setEnabled(false);
            
            jtNome.setEnabled(false);
            jtNome.setEditable(false);
            jtDataNasc.setEnabled(false);
            jtDataNasc.setEditable(false);

            jbAlterar.setEnabled(true);
            jbDeletar.setEnabled(true);
            jbLimparTabela.setEnabled(true);
            jbPreencherTabela.setEnabled(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane,
                    "Erro ao alterar Paciente: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }

    } private void limparCampos() {
        
        jtCodigo.setText(null);
        jtNome.setText(null);
        jtDataNasc.setText(null);

    }

          private void limparTabela(){
        
        dtm.setNumRows(0);
        
    }
    
    private void jbPreencherTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreencherTabelaActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbPreencherTabelaActionPerformed

    private void jbPreencherTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbPreencherTabelaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limparTabela();
            preencherTabela();
        }
    }//GEN-LAST:event_jbPreencherTabelaKeyPressed

    private void jbLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparTabelaActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparTabelaActionPerformed

    private void jbLimparTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparTabelaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limparTabela();
        }//fecha if
    }//GEN-LAST:event_jbLimparTabelaKeyPressed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        deletarAluno();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbDeletarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbDeletarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            deletarAluno();
            limparTabela();
            preencherTabela();
        }
    }//GEN-LAST:event_jbDeletarKeyPressed

    private void jbDeletar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletar1ActionPerformed
        deletarAluno();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbDeletar1ActionPerformed

    private void jbDeletar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbDeletar1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            deletarAluno();
            limparTabela();
            preencherTabela();
        }
    }//GEN-LAST:event_jbDeletar1KeyPressed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAlterarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alterar();
        }//fecha if
    }//GEN-LAST:event_jbAlterarKeyPressed

    private void jbConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoActionPerformed
        confirmarAlteracao();
        limparCampos();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbConfirmarAlteracaoActionPerformed

    private void jbConfirmarAlteracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            confirmarAlteracao();
            limparCampos();
            limparTabela();
            preencherTabela();
        }
    }//GEN-LAST:event_jbConfirmarAlteracaoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConfirmarAlteracao;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbDeletar1;
    private javax.swing.JButton jbLimparTabela;
    private javax.swing.JButton jbPreencherTabela;
    private javax.swing.JComboBox jcbPesquisa;
    private javax.swing.JPanel jpAções;
    private javax.swing.JPanel jpPesquisa;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDataNasc;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTable jtTabela;
    // End of variables declaration//GEN-END:variables
}
