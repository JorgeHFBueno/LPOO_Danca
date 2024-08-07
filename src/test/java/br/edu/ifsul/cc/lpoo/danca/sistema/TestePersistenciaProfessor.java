package br.edu.ifsul.cc.lpoo.danca.sistema;

//@author JRGHNR
import br.edu.ifsul.cc.lpoo.danca.sistema.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.danca.sistema.model.Professor;
import java.util.Calendar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestePersistenciaProfessor {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaProfessor() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void test() throws Exception {
        // Criação das Entidades
        

        Professor prof1 = new Professor();
        prof1.setNome("Joao da Silva");
        prof1.setNumero_celular("+55(54)90123-1233");
        prof1.setDataAdmissao(Calendar.getInstance());


        // Persistência das Entidades em Ordem Correta
      // Aluno deve ser persistido antes de Contrato
        jpa.persist(prof1); // Professor deve ser persistido antes de FolhaPagamento
    // FolhaPagamento deve ser persistida após Professor
    }
}
