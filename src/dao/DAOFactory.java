/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Aluno
 */
public class DAOFactory {
   private static final PacienteDAO PacienteDAO = new PacienteDAO();

    public static PacienteDAO getPacienteDAO() {
        return PacienteDAO;
    } 
}
