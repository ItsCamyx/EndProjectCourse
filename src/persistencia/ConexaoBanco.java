/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class ConexaoBanco {
  
    private static final String url="jdbc:mysql://localhost:3306/paciente?zeroDateTimeBehavior=convertToNull";
    private static final String usuario="root";
    private static final String senha="root";
    
    public static Connection getConexao() throws SQLException{
        
        Connection c = null;
        try {
            c = DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException se) { 
            throw new SQLException("Erro ao conectar no Banco de Dados! "+se.getMessage());
        }
        
        return c;
    }
}
