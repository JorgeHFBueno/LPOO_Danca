package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//JRG B

@Entity
@Table(name = "tb_professor")
//@DiscriminatorValue("P")
public class Professor extends Pessoa implements Serializable{
    
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAdmissao;
    
    
    public Professor(){
    //inicialização das listas holerites e modalidades no construtor para evitar NullPointerException
        holerites = new ArrayList<>();
    //modalidades = new ArrayList<>();

    }

    //Validação do Mapeamento Bidirecional: Garantir que o mapeamento @OneToMany em Professor 
    //e @ManyToOne em FolhaPagamento estejam corretamente configurados para refletir o relacionamento bidirecional.
    @OneToMany(mappedBy = "professor")
    private List<FolhaPagamento> holerites= new ArrayList<>();
    
    
    //Validação do Mapeamento Bidirecional: Garantir que o mapeamento @OneToMany em Professor 
    //e @ManyToOne em Modalidade estejam corretamente configurados para refletir o relacionamento bidirecional.
    @OneToMany(mappedBy = "professor")
    private List<Modalidade> modalidades = new ArrayList<>();
    
    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    } 
    
    public List<FolhaPagamento> getHolerites() {
        return holerites;
    }

    public void addFolhaPagamentoMes(FolhaPagamento f) {
        holerites.add(f);
    }
    
    
    public List<Modalidade> getModalidades() {
        return modalidades;
    }

    public void addModalidade(Modalidade m) {
        modalidades.add(m);
        m.setProfessor(this);
       
    }
}
