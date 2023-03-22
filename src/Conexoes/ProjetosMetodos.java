/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexoes;

import Dados.Projetos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class ProjetosMetodos {
    Connection conexao;
    
    public void cadastrarProjetos(Projetos projetos){
        
        conexao = new ConexaoMYSQL().conectarBD();
        
        try {
        String insertUserPass = "INSERT INTO tb_projetos (nomeprojeto, descricao, idautor) VALUES (?, ?, ?);";
            
        PreparedStatement stm = conexao.prepareStatement(insertUserPass);
            stm.setString(1, projetos.getNomeProjeto());
            stm.setString(2, projetos.getDescricaoProjeto());
            stm.setInt(3, projetos.getIDAutorProjeto());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "PROJETO SALVO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ProjetosMetodos: cadastrarProjetos " + erro);
        }
        
    }
    
     public List<Projetos> PesquisarProjetos(){
           List lista = new ArrayList();
           conexao = new ConexaoMYSQL().conectarBD();
           String projetos = "SELECT * FROM tb_projetos;";
           
           try {
            PreparedStatement stm = conexao.prepareStatement(projetos);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Projetos projeto = new Projetos();
                projeto.setIDProjeto(result.getInt("id"));
                projeto.setNomeProjeto(result.getString("nomeprojeto"));
                projeto.setDescricaoProjeto(result.getString("descricao"));
                projeto.setIDAutorProjeto(result.getInt("idautor"));
                lista.add(projeto);
            }
           } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null, "ProjetosMetodos: PesquisarProjetos " + erro);
           } 
           return lista;
       }
     
     
     public void alterarProjetos(Projetos p){
        conexao = new ConexaoMYSQL().conectarBD();
        
        try {
        String updateProjetos = "UPDATE tb_projetos SET nomeprojeto = ?, descricao = ? WHERE id = ? ;";
            
        PreparedStatement stm = conexao.prepareStatement(updateProjetos);
            stm.setString(1, p.getNomeProjeto());
            stm.setString(2, p.getDescricaoProjeto());
            stm.setInt(3, p.getIDProjeto());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "PROJETO ALTERADO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ProjetosMetodos: alterarProjetos " + erro);
        }
     }
  
     public void excluirProjetos(Projetos p){
         conexao = new ConexaoMYSQL().conectarBD();
         
        try {
        String deleteProjetos = "DELETE FROM tb_projetos WHERE id = ? ;";
            
        PreparedStatement stm = conexao.prepareStatement(deleteProjetos);
            stm.setInt(1, p.getIDProjeto());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "PROJETO EXCLUIDO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "ProjetosMetodos: excluirProjetos " + erro);
        }
     }
     
    public ResultSet filtroProjetos(String id) throws SQLException {
        conexao = new ConexaoMYSQL().conectarBD();
        String filtrarProj = "SELECT * FROM tb_projetos WHERE idautor like '" + id + "'";
        PreparedStatement stm = conexao.prepareStatement(filtrarProj);
        ResultSet result = stm.executeQuery();
        return result;
           }
}
