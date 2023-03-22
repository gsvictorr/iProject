/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexoes;

import Dados.Usuario;
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
public class UsuarioMetodos {
    
    Connection conexao;
    
    public ResultSet autenticarUsuario(Usuario user){
        conexao = new ConexaoMYSQL().conectarBD();
        
        try {
            String buscarUserPass = "SELECT usuario, senha FROM tb_usuarios WHERE usuario = ? AND senha = ?";
            PreparedStatement stm = conexao.prepareStatement(buscarUserPass);
            stm.setString(1, user.getUsuario());
            stm.setString(2, user.getSenha());    
            ResultSet resultado = stm.executeQuery();
            return resultado;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuárioMetodos: " + erro);
            return null;
        } 
        
    }
    
    public void salvarUsuarios(Usuario autenticacao){
        conexao = new ConexaoMYSQL().conectarBD();
        
        try {
        String insertUserPass = "INSERT INTO tb_usuarios (usuario, nomecompleto, senha, email, telefone) "
        + "VALUES (?, ?, ?, ?, ?)";
            
        PreparedStatement stm = conexao.prepareStatement(insertUserPass);
            stm.setString(1, autenticacao.getUsuario());
            stm.setString(2, autenticacao.getNomeCompleto());
            stm.setString(3, autenticacao.getSenha());
            stm.setString(4, autenticacao.getEmail());
            stm.setString(5, autenticacao.getTelefone());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "USUÁRIO SALVO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "UsuárioMetodos: salvarUsuarios " + erro);
        }
        
    }
   
         public List<Usuario> listarUsuarios(){
           List lista = new ArrayList();
           conexao = new ConexaoMYSQL().conectarBD();
           String usuarios = "SELECT * FROM tb_usuarios;";
           
           try {
            PreparedStatement stm = conexao.prepareStatement(usuarios);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Usuario usuario = new Usuario();
                usuario.setId(result.getInt("id"));
                usuario.setUsuario(result.getString("usuario"));
                usuario.setNomeCompleto(result.getString("nomecompleto"));
                usuario.setEmail(result.getString("email"));
                usuario.setTelefone(result.getString("telefone"));
                lista.add(usuario);
            }
           } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null, "UsuarioMetodos: listarUsuarios " + erro);
           } 
           return lista;
       }
         
         
        public void alterarUsuarios(Usuario u){
        conexao = new ConexaoMYSQL().conectarBD();
        
        try {
        String updateUsuarios = "UPDATE tb_usuarios SET usuario = ?, nomecompleto = ?, email = ?, telefone = ? WHERE id = ? ;";
            
        PreparedStatement stm = conexao.prepareStatement(updateUsuarios);
            stm.setString(1, u.getUsuario());
            stm.setString(2, u.getNomeCompleto());
            stm.setString(3, u.getEmail());
            stm.setString(4, u.getTelefone());
            stm.setInt(5, u.getId());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "USUÁRIO ALTERADO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "UsuarioMetodos: alterarUsuarios " + erro);
        }
     }
        
        public void excluirUsuarios(Usuario u){
            String deleteUsuarios = "DELETE FROM tb_usuarios where id = ? ;";
            conexao = new ConexaoMYSQL().conectarBD();
        
        try {
        String updateUsuarios = "UPDATE tb_usuarios SET usuario = ?, nomecompleto = ?, email = ?, telefone = ? WHERE id = ? ;";
            
        PreparedStatement stm = conexao.prepareStatement(deleteUsuarios);
            stm.setInt(1, u.getId());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "USUÁRIO EXCLUIDO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "UsuarioMetodos: excluirUsuarios " + erro);
        }
        }
        
        
        
        public ResultSet verificarUsuario(Usuario user){
        conexao = new ConexaoMYSQL().conectarBD();
        
        try {
            String buscarUserPass = "SELECT usuario FROM tb_usuarios WHERE usuario = ?";
            PreparedStatement stm = conexao.prepareStatement(buscarUserPass);
            stm.setString(1, user.getUsuario());
            ResultSet resultado = stm.executeQuery();
            return resultado;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuárioMetodos: verificarUsuario" + erro);
            return null;
        } 
     }
}
