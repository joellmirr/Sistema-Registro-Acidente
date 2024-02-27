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
import model.Acidente;

/**
 *
 * @author joelmir
 */
public abstract class AcidenteDao implements Dao{
    public conn con = new conn();
    public void inserir(Object o) {
       Acidente a = (Acidente) o;
       String sql = "INSERT INTO AcidenteVeiculo(descricaoacidente,dataacidente,danos,"
               + "motorista,vitima,rodovia,uf,municipio,descricaolocalizacao) VALUES(?,?,?,?,?,?,?,?,?)";
       try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,a.getDescricaoAcidente());
           ps.setString(2,a.getDataAcidente());
           ps.setString(3,a.getDanos());
           ps.setInt(4,a.getMotorista());
           ps.setInt(5,a.getVitima());
           ps.setString(6, a.getRodovia());
           ps.setString(7, a.getUF());
           ps.setString(8,a.getMunicipio());
           ps.setString(9,a.getDescricaoLocalizacao());
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
          Acidente a = (Acidente) o;
         String sql = "UPDATE AcidenteVeiculo SET descricaoacidente=?,dataacidente=?,danos=?,"
                 + "motorista=?,vitima=?,rodovia=?,uf=?,municipio=?,descricaolocalizacao=? WHERE idacidente=?";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,a.getDescricaoAcidente());
           ps.setString(2,a.getDataAcidente());
           ps.setString(3,a.getDanos());
           ps.setInt(4,a.getMotorista());
           ps.setInt(5,a.getVitima());
           ps.setString(6, a.getRodovia());
           ps.setString(7, a.getUF());
           ps.setString(8,a.getMunicipio());
           ps.setString(9,a.getDescricaoLocalizacao());
           ps.setString(10,a.getId());
           ps.execute();
           ps.close(); 
           JOptionPane.showMessageDialog(null,"Cadastro Atualizado!");
         } catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       } 
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM AcidenteVeiculo WHERE idacidente=" + o;
        try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null,"Cadastro Excluido!");
        } catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Erro SQL:\n"+ex);  
       } 
    }
    
}
