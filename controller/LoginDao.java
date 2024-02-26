/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.LoginM;
import view.Principal;


/**
 *
 * @author joelmir
 */
public class LoginDao {
    public void VerifLogin(LoginM lc){
        LoginM cl = lc;
        String sql = "SELECT * FROM login WHERE usuario=? AND senha=?";
        try{
            PreparedStatement ps =conn.getConexao().prepareStatement(sql);
            ps.setString(1,cl.getUsuario());
            ps.setString(2, cl.getSenha());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                     public void run() {
                      new Principal().setVisible(true);
                    }
                });  
                
            }else{
                JOptionPane.showMessageDialog(null,"Usuário ou Senha inválido!");
            }
         
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    }
}
