package br.edu.ifsul.cc.lpoo.danca.sistema;

import br.edu.ifsul.cc.lpoo.danca.sistema.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.danca.sistema.model.Modalidade;
import br.edu.ifsul.cc.lpoo.danca.sistema.model.Pacotes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.Test;

//@author JRG HFB
 
public class TestPersistenceJPA {

    @Test 
    public void testConexaoGeracaoTabelas() {

        PersistenciaJPA persistencia = new PersistenciaJPA();
        if (persistencia.conexaoAberta()) {
            System.out.println("abriu a conexao com o BD via JPA");
            persistencia.fecharConexao();
            System.out.println("fechou a conexao com o BD via JPA");

        } else {
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }

  
    //Exercício 1: inserir nova Modalidade.(10_04)
    //Exercício 2: Arrumar Classes Pessoas,Pagamentos,formaPgmto(17_04)
    //@Test 
    public void testPersistenciaModalidade() throws Exception {

        PersistenciaJPA persistencia = new PersistenciaJPA();
        if (persistencia.conexaoAberta()) {
            System.out.println("abriu a conexao com o BD via JPA para Modalidade");
            Modalidade m = new Modalidade();
            m.setDescricao("Modalidade101");
            persistencia.persist(m);
            System.out.println("Incluiu a Modalidade: " + m.getId());

            Modalidade md = (Modalidade) persistencia.find(Modalidade.class, 1);
            System.out.println("Encontrou o Produto id= "+md.getId()+"; de nome: "+md.getDescricao());
            
            
            persistencia.fecharConexao();
            System.out.println("fechou a conexao com o BD via JPA");

        } else {
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }

      
     /* 
    //ProjAntBase
    //@Test
    public void testPersistenciaPecaV2() throws Exception {
    //Exercício 2:
         //Passo 1: encontrar a peça id=1
         //Passo 2: caso encontre remove-la
         //Passo 3: caso não encontre criar nova peça.
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if (persistencia.conexaoAberta()) {
            System.out.println("testPersistenciaPecaV2:");
            Peca p = (Peca) persistencia.find(Peca.class, 1);
            if (p == null) {
                System.out.println("nao encontrou o id =1");
                p = new Peca();
                p.setFornecedor("HD2");
                p.setNome("Teste2");
                p.setValor(202f);
                persistencia.persist(p);
                System.out.println("Incluiu a Peça: " + p.getId());
            } else {
                System.out.println("encontrou o id=1 para endereco " + p.getId());
                persistencia.remover(p);
            }
            persistencia.fecharConexao();
        } else {
            System.out.println("Nao abriu a conexao com o BD via JPA");
        }
    }

    
    //@Test
    public void testListPeca() throws Exception {
        //Exercício 3:
        //Passo 1: recuperar a lista de peças.
       //Passo 2: se a lista.size() > 0 listar e remover.
        //Passo 3: se a lista.size() == 0 inserir duas Peças.
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if (persistencia.conexaoAberta()) {
            System.out.println("abriu a conexao com o BD via JPA para testListPeca");
            List<Peca> lista = persistencia.listPeca();

            if (!lista.isEmpty()) {
                System.out.println("TAMANHO: " + lista.size());
                for (Peca p : lista) {
                    System.out.println("Peca: " + p.getId());
                }
                for (Peca p : lista) {
                    System.out.println("Removeu Peca: " + p.getId());
                    persistencia.remover(p);
                }
                
                persistencia.fecharConexao();System.out.println("fechou a conexao com o BD via JPA");
            } else {
                System.out.println("NAO ENCONTROU PECAS");
                Peca pc = new Peca();
                pc.setFornecedor("HD3");
                pc.setNome("Teste3");
                pc.setValor(203f);
                persistencia.persist(pc);
                System.out.println("Incluiu a Peca: " + pc.getId());
                
                pc = new Peca();
                pc.setFornecedor("HD4");
                pc.setNome("Teste4");
                pc.setValor(101f);
                persistencia.persist(pc);
                System.out.println("Incluiu a Peca: " + pc.getId());
            }
        } else {
            System.out.println("nao conectou no BD ...");
        }
    }

    //@Test
    public void testListFuncionarios() throws Exception {
        //Exercício 4:
            //Passo 1: listar dos os funcionários com os seus respectivos curso.
            //Passo 2: se a lista.size() > 0 listar e remover o funcionário.
            //Passo 3: se a lista.size() == 0 inserir um funcionário e associar cursos..
        PersistenciaJPA persistencia = new PersistenciaJPA();
        if (persistencia.conexaoAberta()) {
            System.out.println("abriu a conexao com o BD via JPA para testListFuncionarios");
            List<Funcionario> lista = persistencia.listFuncionario();

            if (!lista.isEmpty()) {
                System.out.println("TAMANHO: " + lista.size());
                for (Funcionario f : lista) {
                    System.out.println("CPF Funcionario: " + f.getCpf());
                    // System.out.println("Curso(s): " + f.getCursos());
                    //System.out.println("CPF Funcionario: " + f.getCpf()+ "\t Cargo: " + f.getCargo()+ "\t Curso(s): " + f.getCursos());
                    for(Curso c : f.getCursos()){
                        System.out.println(""+c.getDescricao());
                    }
                }
                for (Funcionario f : lista) {
                    System.out.println("Removeu Funcionario: " + f.getCpf());
                    persistencia.remover(f);
                }
                
                persistencia.fecharConexao();System.out.println("fechou a conexao com o BD via JPA");
            } else {
                System.out.println("NAO ENCONTROU FUNCIONARIOS");
                
                Funcionario fnc = new Funcionario();
                fnc.setCpf("0123456789");
                fnc.setNome("Jorge");
                fnc.setSenha("12345678");
                fnc.setComplemento("Apto000");
                fnc.setCep("99010");
                fnc.setNumero_ctps("006");
                fnc.setData_admissao(Calendar.getInstance());
                
                fnc.setCargo(getCargo(persistencia));
                
                List<Curso> listCurso = new ArrayList();
                    listCurso.add(getCurso(persistencia));
                fnc.setCursos(listCurso);
                
                persistencia.persist(fnc);
                System.out.println("Incluiu o Funcionario: " + fnc.getCpf());
                
            }
        } else {
            System.out.println("nao conectou no BD ...");
        }
    }
    
    
    private Curso getCurso(PersistenciaJPA jpa) throws Exception {
        
        List<Curso> list = jpa.listCurso();
        if(list.isEmpty()){
            Curso c = new Curso();
            c.setDescricao("curso de mecanico");
            c.setCargahoraria(100);
            jpa.persist(c);
            return c;
            
        }else{
            return list.get(0);
        }
        
    }
    
     private Cargo getCargo(PersistenciaJPA jpa) throws Exception {
        
        List<Cargo> list = jpa.listCargo();
        if(list.isEmpty()){
            Cargo c = new Cargo();
            c.setDescricao("Gerente");
            jpa.persist(c);
            return c;
        }else{
            return list.get(0);
        }
        
    }
    */
        
}
