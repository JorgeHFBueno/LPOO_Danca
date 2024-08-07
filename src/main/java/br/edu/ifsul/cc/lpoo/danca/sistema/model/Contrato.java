
package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * @author JRG
 */

@Entity
@Table(name = "tb_contrato")
public class Contrato implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_contrato", sequenceName = "seq_contrato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_contrato", strategy = GenerationType.SEQUENCE)      
    private Integer id;
    
    @Column(nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)//Pega a data atual do sistema.MKI
    private Calendar dataInicio;
    
    @Column(nullable = false)
    private Double valorDesconto;
    
    
   @Column(nullable = false)
   @Enumerated(EnumType.STRING)
    private FormaPgto forma_Pgto;
    
    @OneToOne
    @JoinColumn(name = "contrato_aluno")
    private Aluno aluno;
    
    @ManyToMany
    @JoinTable(
            name = "tb_itens_contrato",
            joinColumns = @JoinColumn(name = "contrato_id"),
            inverseJoinColumns = @JoinColumn(name = "pacote_id"))
    private List<Pacotes> pacotes = new ArrayList<>();
    
    public Contrato(){
        dataInicio = Calendar.getInstance();//Pega a data atual do sistema.MKII
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
     * @return the data
     */
    public Calendar getData() {
        return dataInicio;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.dataInicio = data;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Pacotes> getPacotes() {
        return pacotes;
    }

    public void addPacote(Pacotes p) {
        pacotes.add(p);
        p.addContrato(this);
    }

    
    
}
