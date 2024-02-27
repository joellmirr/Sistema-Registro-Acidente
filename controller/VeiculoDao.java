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
import model.VeiculoM;

/**
 *
 * @author joelmir
 */
public abstract class VeiculoDao implements Dao{
    public conn con = new conn();
    public void inserir(Object o) {
       VeiculoM v = (VeiculoM) o;
       String sql = "INSERT INTO Veiculo(fabricante,modelo,anofabricacao,placa,categoria,motorista) VALUES(?,?,?,?,?,?)";
       try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,v.getFabricante());
           ps.setString(2,v.getModelo());
           ps.setString(3,v.getAnoFabricacao());
           ps.setString(4,v.getPlaca());
           ps.setString(5,v.getCategoria());
           ps.setString(6, v.getMotorista());
           ps.execute();
           ps.close();
           JOptionPane.showMessageDialog(null,"Cadastro Realizado!");
          // con.FecharConexao();
       }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);       }
       
    }

    @Override
    public void atualizar(Object o) {
        VeiculoM v = (VeiculoM) o;
         String sql = "UPDATE Veiculo SET fabricante=?,modelo=?,anofabricacao=?,placa=?,categoria=?,motorista=? WHERE idveiculo=?";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
          ps.setString(1,v.getFabricante());
           ps.setString(2,v.getModelo());
           ps .setString(3,v.getAnoFabricacao());
           ps.setString(4,v.getPlaca());
           ps.setString(5,v.getCategoria());
           ps.setString(6, v.getMotorista());
           ps.setString(7,v.getIdveiculo());
           ps.execute();
           ps.close(); 
           JOptionPane.showMessageDialog(null,"Cadastro Atualizado!");

         } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);       } 
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Veiculo WHERE idveiculo=" + o;
        try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Cadastro Excluido!");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);       } 
    }
}
