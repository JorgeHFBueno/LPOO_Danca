package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Entity;

/*
 * @author JRG
 */

@Entity
@Table(name = "tb_modalidade")
//@NamedQueries({@NamedQuery(name="modalidade.orderbyid", query="select m from Modalidade m order by m.id asc")})
public class Modalidade implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_modalidade", sequenceName = "seq_modalidade_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_modalidade", strategy = GenerationType.SEQUENCE)      
    private Integer id;
    
    @Column(nullable = false, length = 100)
    private String descricao;
    
    public Modalidade(){
        
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param nome the nome to set
     */
    public void setDescricao(String nome) {
        this.descricao = nome;
    }

  
    
    
}
