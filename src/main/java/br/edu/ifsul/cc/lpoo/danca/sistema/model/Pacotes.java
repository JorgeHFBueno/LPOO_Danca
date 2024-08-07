package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

//@author JRG B


@Entity
@Table(name = "tb_pacotes")
//@NamedQueries({@NamedQuery(name="pacotes.orderbyid", query="select p from Produto p order by p.id asc")})
public class Pacotes implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_pacotes", sequenceName = "seq_pacotes_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pacotes", strategy = GenerationType.SEQUENCE)      
    private Integer id;
    
    @Column(nullable = true, length = 100)
    private String descricao;
    
    @Column(nullable = false, precision = 2)
    private Double valor;
    
    @ManyToOne
    @JoinColumn (name = "id")
    private Modalidade modalidade;
    
    @ManyToMany(mappedBy = "pacotes")
    private List<Contrato> contratos = new ArrayList<>();
    
    public Pacotes(){
        
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

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }
    
    public void addContrato(Contrato c) {
        contratos.add(c);
    }
    
    
}
