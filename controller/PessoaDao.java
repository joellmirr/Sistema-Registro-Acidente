/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.PessoaAcidenteM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public abstract class PessoaDao implements Dao{
    public conn con = new conn();
    
    public void inserir(Object o) {
       PessoaAcidenteM p = (PessoaAcidenteM) o;
       String sql = "INSERT INTO Pessoa (nome,cnh,cpf,email,telefone,endereco,descricao) VALUES(?,?,?,?,?,?,?)";
       try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,p.getNome());
           ps.setString(2,p.getCnh());
           ps.setString(3,p.getCpf());
           ps.setString(4,p.getEmail());
           ps.setString(5, p.getTelefone());
           ps.setString(6, p.getEndereco());
           ps.setString(7,p.getDescricaoPessoa());
           ps.execute();
           ps.close();
           JOptionPane.showMessageDialog(null,"Cadastro Realizado!");
          // con.FecharConexao();
       }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       }
       
    }

    @Override
    public void atualizar(Object o) {
        PessoaAcidenteM p = (PessoaAcidenteM) o;
         String sql = "UPDATE Pessoa SET nome=?,cnh=?,cpf=?,email=?,telefone=?,endereco=?,descricao=? WHERE idpessoa=?";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,p.getNome());
           ps.setString(2,p.getCnh());
           ps.setString(3,p.getCpf());
           ps.setString(4,p.getEmail());
           ps.setString(5, p.getTelefone());
           ps.setString(6, p.getEndereco());
           ps.setString(7, p.getDescricaoPessoa());
           ps.setString(8, p.getId());
           ps.execute();
           ps.close(); 
           JOptionPane.showMessageDialog(null,"Cadastro Atualizado!");

         } catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       } 
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Pessoa WHERE idpessoa=" + o;
        try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       } 
    }
    
    
}


