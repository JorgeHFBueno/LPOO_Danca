
package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    private FormaPgto forma_Pgto;
    
   @OneToMany(mappedBy = "contrato")
    private List<ItensContrato> itensContrato;
    
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

    public List<ItensContrato> getItensContrato() {
        return itensContrato;
    }

    public void setItensContrato(List<ItensContrato> itensContrato) {
        this.itensContrato = itensContrato;
    }



    
    
}
