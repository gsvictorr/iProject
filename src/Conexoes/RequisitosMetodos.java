/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexoes;

import Dados.Requisitos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class RequisitosMetodos {
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    Date data = new Date();
    String dataAtual = formato.format(data);
    Connection conexao;
    PreparedStatement stm;
    
    public void cadastrarRequisitos(Requisitos r){
        conexao = new ConexaoMYSQL().conectarBD();
        
        try {
        String insertReq = "INSERT INTO tb_requisitos (nomerequisito, modulo, idprojeto, idautor_projeto, funcionalidades, descricaorequisito, fasereq, estadoreq, esforcohoras, complexidade, prioridade, versao, dtcriacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            
            stm = conexao.prepareStatement(insertReq);
            stm.setString(1, r.getNomeReq());
            stm.setString(2, r.getModuloReq());
            stm.setInt(3, r.getIDProjetoReq());
            stm.setInt(4, r.getAutorReq());
            stm.setString(5, r.getFuncionalidadeReq());
            stm.setString(6, r.getDescReq());
            stm.setString(7, r.getFaseReq());
            stm.setString(8, r.getEstadoReq());
            stm.setString(9, r.getEsforcoHoras());
            stm.setString(10, r.getComplexidadeReq());
            stm.setString(11, r.getPrioridadeReq());
            stm.setString(12, r.getVersaoReq());
            stm.setString(13, r.getDtCriacaoReq());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "REQUISITO SALVO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "RequisitosMetodos: cadastrarRequisitos " + erro);
        }
    }
          public List<Requisitos> listarRequisitos(){
           List lista = new ArrayList();
           conexao = new ConexaoMYSQL().conectarBD();
           String requisito = "SELECT * FROM tb_requisitos;";
           
           try {
            stm = conexao.prepareStatement(requisito);
            ResultSet result = stm.executeQuery();
            while(result.next()){
                Requisitos requisitos = new Requisitos();
                requisitos.setIDReq(result.getInt("id"));
                requisitos.setNomeReq(result.getString("nomerequisito"));
                requisitos.setModuloReq(result.getString("modulo"));
                requisitos.setIDProjetoReq(result.getInt("idprojeto"));
                requisitos.setAutorReq(result.getInt("idautor_projeto"));
                requisitos.setFuncionalidadeReq(result.getString("funcionalidades"));
                requisitos.setDescReq(result.getString("descricaorequisito"));
                requisitos.setFaseReq(result.getString("fasereq"));
                requisitos.setEstadoReq(result.getString("estadoreq"));
                requisitos.setEsforcoHoras(result.getString("esforcohoras"));
                requisitos.setComplexidadeReq(result.getString("complexidade"));
                requisitos.setPrioridadeReq(result.getString("prioridade"));
                requisitos.setVersaoReq(result.getString("versao"));
                requisitos.setDtCriacaoReq(result.getString("dtcriacao"));
                lista.add(requisitos);
            }
           } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "RequisitosMetodos: listarRequisitos " + erro);
           } 
           return lista;
       }
          
        public void alterarRequisitos(Requisitos r){
        conexao = new ConexaoMYSQL().conectarBD();
        
        try {
        String updateRequisitos = "UPDATE tb_requisitos SET nomerequisito = ?, modulo = ?, idprojeto = ?, idautor_projeto = ?, funcionalidades = ?, descricaorequisito = ?, fasereq = ?, estadoreq = ?, esforcohoras = ?, complexidade = ?, prioridade = ?, versao = ?, dtcriacao = ? WHERE id = ? ";
            
            stm = conexao.prepareStatement(updateRequisitos);
            stm.setString(1, r.getNomeReq());
            stm.setString(2, r.getModuloReq());
            stm.setInt(3, r.getIDProjetoReq());
            stm.setInt(4, r.getAutorReq());
            stm.setString(5, r.getFuncionalidadeReq());
            stm.setString(6, r.getDescReq());
            stm.setString(7, r.getFaseReq());
            stm.setString(8, r.getEstadoReq());
            stm.setString(9, r.getEsforcoHoras());
            stm.setString(10, r.getComplexidadeReq());
            stm.setString(11, r.getPrioridadeReq());
            stm.setString(12, r.getVersaoReq());
            stm.setString(13, r.getDtCriacaoReq());
            stm.setInt(14, r.getIDReq());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "REQUISITO ALTERADO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "RequisitosMetodos: alterarRequisitos " + erro);
        }
     }
        
        public void excluirRequisitos(Requisitos r){
         conexao = new ConexaoMYSQL().conectarBD();
         
        try {
        String deleteRequisitos = "DELETE FROM tb_requisitos WHERE id = ? ;";
            
            stm = conexao.prepareStatement(deleteRequisitos);
            stm.setInt(1, r.getIDReq());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "REQUISITO EXCLUIDO COM SUCESSO!");
        
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "RequisitosMetodos: excluirRequisitos " + erro);
        }
     }
        public ResultSet filtroRequisitos(String id) throws SQLException{
               conexao = new ConexaoMYSQL().conectarBD();
               String filtrarReq = "SELECT * FROM tb_requisitos WHERE idprojeto like '"+id+"%'";
               stm = conexao.prepareStatement(filtrarReq);
               ResultSet result = stm.executeQuery();
               return result;
           }
        
               public ResultSet filtroRequisitosRelatorio(String id) throws SQLException{
               conexao = new ConexaoMYSQL().conectarBD();
               String filtrarReq = "SELECT * FROM tb_requisitos WHERE idprojeto like '"+id+"'";
               stm = conexao.prepareStatement(filtrarReq);
               ResultSet result = stm.executeQuery();
               return result;
           }
}
