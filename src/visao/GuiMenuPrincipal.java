
package visao;

import java.awt.event.KeyEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class GuiMenuPrincipal extends javax.swing.JFrame implements InternalFrameListener  {

    private boolean flagCadPaciente = false;
    private boolean flagManPaciente = false;
    
    public GuiMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpFundo = new javax.swing.JDesktopPane();
        jMenu = new javax.swing.JMenuBar();
        jmMenuPaciente = new javax.swing.JMenu();
        jmiAba = new javax.swing.JMenuItem();
        jmManPaciente = new javax.swing.JMenu();
        jmiAba2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpFundoLayout = new javax.swing.GroupLayout(jdpFundo);
        jdpFundo.setLayout(jdpFundoLayout);
        jdpFundoLayout.setHorizontalGroup(
            jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        jdpFundoLayout.setVerticalGroup(
            jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        jmMenuPaciente.setText("Paciente");

        jmiAba.setText("Cadastro");
        jmiAba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbaActionPerformed(evt);
            }
        });
        jmiAba.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiAbaKeyPressed(evt);
            }
        });
        jmMenuPaciente.add(jmiAba);

        jMenu.add(jmMenuPaciente);

        jmManPaciente.setText("Manutenção");

        jmiAba2.setText("Manutenção");
        jmiAba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAba2ActionPerformed(evt);
            }
        });
        jmiAba2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiAba2KeyPressed(evt);
            }
        });
        jmManPaciente.add(jmiAba2);

        jMenu.add(jmManPaciente);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpFundo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpFundo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbaActionPerformed
    abrirCadPaciente();
    }//GEN-LAST:event_jmiAbaActionPerformed

    private void jmiAbaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiAbaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirCadPaciente();
        }
    }//GEN-LAST:event_jmiAbaKeyPressed

    private void jmiAba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAba2ActionPerformed
        abrirManPaciente();
    }//GEN-LAST:event_jmiAba2ActionPerformed

    private void jmiAba2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiAba2KeyPressed
     if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirManPaciente();
        }
    }//GEN-LAST:event_jmiAba2KeyPressed
private void abrirCadPaciente(){
        
        if(!flagCadPaciente){
            
            CadPaciente ca = new CadPaciente();
            
            jdpFundo.add(ca);
            
            ca.setVisible(true);
            
            flagCadPaciente = true;
            
            ca.addInternalFrameListener(this);
            
        }
        
}
    
    private void abrirManPaciente(){
        
        if(!flagManPaciente){
            
            ManPaciente ma = new ManPaciente();
            
            jdpFundo.add(ma);
            
            ma.setVisible(true);
            
            flagManPaciente = true;
            
            ma.addInternalFrameListener(this);
            
        }
        
    }
            

    public static void main(String args[]) {    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JDesktopPane jdpFundo;
    private javax.swing.JMenu jmManPaciente;
    private javax.swing.JMenu jmMenuPaciente;
    private javax.swing.JMenuItem jmiAba;
    private javax.swing.JMenuItem jmiAba2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
     
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
      
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        
    }
    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
       
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
         
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
    }
}
