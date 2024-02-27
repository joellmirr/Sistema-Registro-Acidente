/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;
import controller.UsuarioDao;
import controller.conn;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UsuarioM;

/**
 *
 * @author joelmir
 */
public class ConsultarUsuario extends javax.swing.JInternalFrame {
    UsuarioDao Udao = new UsuarioDao() {};
    /**
     * Creates new form Consultar
     */
    public ConsultarUsuario() {
        initComponents();
          //Comando para centralizar janela
        // Obtém as dimensões da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcula a posição para centralizar a janela
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;

        // Define a posição da janela
        setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Buscar_ = new javax.swing.JButton();
        jButton_sair_ = new javax.swing.JButton();
        jButton_BuscaCompleta_ = new javax.swing.JButton();
        jButton_atualizar_ = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Usuario = new javax.swing.JTable();
        jButton_LimparTabela_ = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Usuario");

        jButton_Buscar_.setText("Buscar Usuario");
        jButton_Buscar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Buscar_ActionPerformed(evt);
            }
        });

        jButton_sair_.setText("Sair");
        jButton_sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sair_ActionPerformed(evt);
            }
        });

        jButton_BuscaCompleta_.setText("Busca Completa");
        jButton_BuscaCompleta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscaCompleta_ActionPerformed(evt);
            }
        });

        jButton_atualizar_.setText("Ataulizar");
        jButton_atualizar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atualizar_ActionPerformed(evt);
            }
        });

        jButton_excluir.setText("Excluir");
        jButton_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluirActionPerformed(evt);
            }
        });

        jTable_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_Usuario);

        jButton_LimparTabela_.setText("Limpar Tabela");
        jButton_LimparTabela_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimparTabela_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton_Buscar_, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton_atualizar_)
                .addGap(64, 64, 64)
                .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton_LimparTabela_)
                .addGap(71, 71, 71)
                .addComponent(jButton_BuscaCompleta_, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton_sair_)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Buscar_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_atualizar_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_BuscaCompleta_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_LimparTabela_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Buscar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Buscar_ActionPerformed
        String sqlcpfM = "SELECT * FROM Usuario WHERE cpf = ?";
        this.BuscarTab(sqlcpfM);
        
       
    }//GEN-LAST:event_jButton_Buscar_ActionPerformed

    private void jButton_sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sair_ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jButton_sair_ActionPerformed

    private void jButton_BuscaCompleta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscaCompleta_ActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM Usuario";
        this.GerarTab(sql);
    }//GEN-LAST:event_jButton_BuscaCompleta_ActionPerformed

    private void jButton_atualizar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atualizar_ActionPerformed
        // TODO add your handling code here:
        this.Atualizar();
    }//GEN-LAST:event_jButton_atualizar_ActionPerformed

    private void jButton_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluirActionPerformed
        // TODO add your handling code here:
        this.Excluir();
    }//GEN-LAST:event_jButton_excluirActionPerformed

    private void jButton_LimparTabela_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimparTabela_ActionPerformed
        this.LimparTab();
    }//GEN-LAST:event_jButton_LimparTabela_ActionPerformed
    
    public void LimparTab(){
        DefaultTableModel ModeloTab = (DefaultTableModel) jTable_Usuario.getModel();
        ModeloTab.setRowCount(0); // Remover todas as linhas
        ModeloTab.setColumnCount(0); // Remover todas as colunas
    }
    
    public void GerarTab(String sql){
        //DefaultTableModel ModeloTabela = new DefaultTableModel();
        DefaultTableModel ModeloTab = (DefaultTableModel) jTable_Usuario.getModel();
        // Conectar ao banco de dados e obter dados da tabela
        try {
            //JOptionPane.showMessageDialog(null,sql);
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                        
            // Obter informações sobre as colunas
            ResultSetMetaData metaData = rs.getMetaData();
            int colCount = metaData.getColumnCount();

            // Adicionar colunas ao modelo
            for (int i = 1; i <= colCount; i++) {
                ModeloTab.addColumn(metaData.getColumnName(i));
            }

            // Adicionar linhas ao modelo com dados do banco de dados
            while (rs.next()) {
                Object[] rowData = new Object[colCount];
                for (int i = 1; i <= colCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                ModeloTab.addRow(rowData);
            }
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados");
            dispose();
        }
       
    }
    
    public void BuscarTab(String sql){
        //DefaultTableModel ModeloTab = new DefaultTableModel();
        DefaultTableModel ModeloTab = (DefaultTableModel) jTable_Usuario.getModel();
        
           // Conectar ao banco de dados e obter dados da tabela
            String SQL = JOptionPane.showInputDialog("Digite CPF:");
            try {
                //JOptionPane.showMessageDialog(null,sql);
                PreparedStatement ps = conn.getConexao().prepareStatement(sql);
                ps.setString(1, SQL);
                ResultSet rs = ps.executeQuery();
                // Obter informações sobre as colunas
                ResultSetMetaData metaData = rs.getMetaData();
                int colCount = metaData.getColumnCount();
                // Adicionar colunas ao modelo
                for (int i = 1; i <= colCount; i++) {
                     ModeloTab.addColumn(metaData.getColumnName(i));
                }
                // Adicionar linhas ao modelo com dados do banco de dados
                while (rs.next()) {
                    Object[] rowData = new Object[colCount];
                    for (int i = 1; i <= colCount; i++) {
                        rowData[i - 1] = rs.getObject(i);
                    }
                    ModeloTab.addRow(rowData);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                //dispose();
            }
    }
            
    public void Atualizar(){
        int i = jTable_Usuario.getSelectedRow();
        // Obtendo o dados da primeira linha selecionada
        UsuarioM u = new UsuarioM();
        u.setId(jTable_Usuario.getModel().getValueAt(i,0).toString());
        u.setCpf(jTable_Usuario.getModel().getValueAt(i,1).toString());
        u.setSenha(jTable_Usuario.getModel().getValueAt(i,2).toString());
        u.setNome(jTable_Usuario.getModel().getValueAt(i,3).toString());
        u.setEmail(jTable_Usuario.getModel().getValueAt(i,4).toString());
        u.setTelefone(jTable_Usuario.getModel().getValueAt(i,5).toString());
        u.setEndereco(jTable_Usuario.getModel().getValueAt(i,6).toString());
        
        Udao.atualizar(u);
    }
    
    public void Excluir(){
        
        int i = jTable_Usuario.getSelectedRow();
        // Obtendo o valor da primeira coluna na linha selecionada
        int o = (int) jTable_Usuario.getValueAt(i, 0);
        Udao.excluir(o);
      
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BuscaCompleta_;
    private javax.swing.JButton jButton_Buscar_;
    private javax.swing.JButton jButton_LimparTabela_;
    private javax.swing.JButton jButton_atualizar_;
    private javax.swing.JButton jButton_excluir;
    private javax.swing.JButton jButton_sair_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Usuario;
    // End of variables declaration//GEN-END:variables

   
}
