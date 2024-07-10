package br.edu.ifsul.cc.lpoo.danca.sistema;

import org.junit.Test;

public class TestPersistenceJDBC {
/*
    @Test
    public void testPersistenciaConexao() throws Exception {

        PersistenciaJDBC jdbc = new PersistenciaJDBC();
        if (jdbc.conexaoAberta()) {
            System.out.println("conectou no BD via JDBC ...");
            jdbc.fecharConexao();
        } else {
            System.out.println("nao conectou no BD ...");
        }
    }

    @Test
    public void testPersistenciaPeca() throws Exception {
        
        //criar um objeto do tipo PersistenciaJDBC.
        PersistenciaJDBC jdbc = new PersistenciaJDBC();
        if(jdbc.conexaoAberta()){
            System.out.println("conectou no BD via jdbc ...");
            
            //chama o método find da classe PersistenciaJDBC
            //modela o retorno do método find: de Object para Peca
            Peca p = (Peca) jdbc.find(Peca.class, 10);            
            if(p == null){
                System.out.println("Nao encontrou a peça 9");
                
                p = new Peca();
                p.setFornecedor("fornecedor de peça");
                p.setNome("correia");
                p.setValor(250.0f);
                
                jdbc.persist(p);
                
                System.out.println("inseriu a peca "+p.getId());
                
            }else{
                System.out.println("Encontrou a peça id="+p.getId());                
                p.setNome("nome alterado");
                
                jdbc.persist(p);
                
                System.out.println("alterou a peca id="+p.getId());
                
                System.out.println("removendo a peca id ="+p.getId());
                jdbc.remover(p);
            }
            
            jdbc.fecharConexao();
        }else{
            System.out.println("nao conectou no BD via jdbc ...");
                        
        }
        
    }
*/
}
