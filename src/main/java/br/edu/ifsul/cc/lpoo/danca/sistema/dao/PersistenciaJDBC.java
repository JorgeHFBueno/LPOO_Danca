package br.edu.ifsul.cc.lpoo.danca.sistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author 20181PF.CC0221
 */
public class PersistenciaJDBC implements InterfacePersistencia {

    private final String DRIVER = "org.postgresql.Driver";
    private final String USER = "postgres";
    private final String SENHA = "postgres";
    public static final String URL = "jdbc:postgresql://localhost:5432/db_sd_2024_1";
    private Connection con = null;

    public PersistenciaJDBC() throws Exception {

        Class.forName(DRIVER); //carregamento do driver postgresql em tempo de execução
        System.out.println("Tentando estabelecer conexao JDBC com : " + URL + " ...");

        this.con = (Connection) DriverManager.getConnection(URL, USER, SENHA);

    }

    public Boolean conexaoAberta() {

        try {
            if (con != null) {
                return !con.isClosed();//verifica se a conexao está aberta
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;

    }

    @Override
    public void fecharConexao() {

        try {
            this.con.close();//fecha a conexao.
            System.out.println("Fechou conexao JDBC");
        } catch (SQLException e) {
            e.printStackTrace();//gera uma pilha de erro na saida.
        }

    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void persist(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
