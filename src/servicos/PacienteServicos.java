/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;
import dao.PacienteDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.PacienteVO;

/**
 *
 * @author Aluno
 */
public class PacienteServicos {

    
    public void cadastrarPaciente(PacienteVO aVO) throws SQLException{
     
        PacienteDAO aDAO = DAOFactory.getPacienteDAO();
         
        aDAO.cadastrarPaciente(aVO);
        
    } public ArrayList<PacienteVO> buscarPaciente() throws SQLException{
        
        PacienteDAO pDAO = DAOFactory.getPacienteDAO();
        return pDAO.buscarPaciente();
                
    }
     public void deletarPaciente(int idPaciente) throws SQLException{
        
        PacienteDAO aDAO = DAOFactory.getPacienteDAO();
        aDAO.deletarPaciente(idPaciente);
        
    }
      public ArrayList<PacienteVO> filtrarPacientes(String query) throws SQLException{
        
        PacienteDAO pDAO = DAOFactory.getPacienteDAO();
        return pDAO.filtrarPacientes(query);
        
    }
      public void alterarPaciente(PacienteVO pVO) throws SQLException{
        
        PacienteDAO pDAO = DAOFactory.getPacienteDAO();
        pDAO.alterarPaciente(pVO);
        
    }
}
