/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.PacienteVO;
import persistencia.ConexaoBanco;

public class PacienteDAO {
    
    public void cadastrarPaciente(PacienteVO pVO) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            
            String sql;
            
            sql = "insert into paciente(idPaciente,nome, dataNasc, ex1 , ex2, ex3)"
                    +"values(null, '"+pVO.getNome()+"','"+pVO.getDataNasc()+"','"+pVO.getEx1()+"','"+pVO.getEx2()+"','"+pVO.getEx3()+"')";
            
            stat.execute(sql);
            
        }catch(SQLException se){
            
            throw  new SQLException("Erro ao inserir o Paciente no banco de dados: " +se.getMessage());
            
        }finally{
            stat.close();
            con.close();
        }
        
    }
     public ArrayList<PacienteVO> buscarPaciente() throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            
            String sql;
            
            sql = "select * from paciente";
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<PacienteVO> paciente = new ArrayList<>();
            
            while(rs.next()){
                
               PacienteVO p = new PacienteVO();
                
                p.setIdPaciente(rs.getInt("idPaciente"));
                p.setNome(rs.getString("nome"));
                p.setDataNasc(rs.getString("dataNasc"));
                p.setEx1(rs.getString("ex1"));
                p.setEx2(rs.getString("ex2"));
                p.setEx3(rs.getString("ex3"));
                
                paciente.add(p);
                
            }
            
            return paciente;
            
        }catch(SQLException se){
            
            throw new SQLException("Erro ao buscar paciente! " + se.getMessage());
            
        }finally{
            con.close();
            stat.close();
        }
        
    }
     public void deletarPaciente(int idPaciente) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            
            String sql;
            
            sql = "delete from paciente where idPaciente = "+idPaciente;
            
            stat.execute(sql);
            
        }catch(SQLException se){
            
            throw new SQLException("Erro ao deletar paciente ! " + se.getMessage());
            
        }finally{
            
        }
        
    }
      public ArrayList<PacienteVO> filtrarPacientes(String query) throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            
            String sql;
            
            sql = "select * from paciente " + query;
            
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<PacienteVO> paciente = new ArrayList<>();
            
            while(rs.next()){
                
                PacienteVO p = new PacienteVO();
                
                p.setIdPaciente(rs.getInt("idPaciente"));
                p.setNome(rs.getString("nome"));
                p.setDataNasc(rs.getString("dataNasc"));
                
                paciente.add(p);
                
            }
            
            return paciente;
            
        }catch(SQLException se){
            
            throw new SQLException("Erro ao filtrar pacientes! " + se.getMessage());
            
        }finally{
            con.close();
            stat.close();
        }
        
    }
    public void alterarPaciente(PacienteVO aVO) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            
            String sql;
            
            sql = "update paciente set "
                    + "nome = '" + aVO.getNome() + "', "
                    + "dataNasc = " + aVO.getDataNasc()+" "
                    + "where idPaciente = " + aVO.getIdPaciente() + "";
            
            stat.executeUpdate(sql);
                    
        }catch(SQLException se){
            
            throw new SQLException("Erro ao alterar o Paciente !" + se.getMessage());
            
        }finally{
            con.close();
            stat.close();
        }
            
        
    }
}



