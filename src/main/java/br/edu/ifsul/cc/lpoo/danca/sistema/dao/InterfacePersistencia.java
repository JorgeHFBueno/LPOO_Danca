/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.danca.sistema.dao;

import java.util.List;

/**
 *
 * @author 20181PF.CC0221
 */
public interface InterfacePersistencia {
    public Boolean conexaoAberta();
    
    public void fecharConexao();
    
    public Object find(Class c, Object id) throws Exception;//select.
    
    public void persist(Object o) throws Exception;//insert ou update.
    
    public void remover(Object o) throws Exception;//delete.
    
    /*public Funcionario doLogin(String cpf, String senha) throws Exception;
    
    public List<Peca> listPeca() throws Exception;
    
    public List<Funcionario> listFuncionario() throws Exception;
    
    public List<Curso> listCurso() throws Exception;*/
}
