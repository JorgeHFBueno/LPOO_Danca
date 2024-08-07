
package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// @author JRG B


@Entity
@Table(name = "tb_pagamento")
public class Pagamentos implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_pagamento", sequenceName = "seq_pagamento_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pagamento", strategy = GenerationType.SEQUENCE)      
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataVcto;
    
    @Column(nullable = false, precision = 2)
    private Double valor;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataPgto;
    
    @Column(nullable = false, precision = 2)
    private Double valorPgto;
    
    @ManyToOne //(mappedBy = "consulta")//mappedBy deve apontar para a referencia de cliente dentro de Pet.
    @JoinColumn
    private Contrato contrato;

    
    public Pagamentos(){
        
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

    public Calendar getDataVcto() {
        return dataVcto;
    }

    public Double getValor() {
        return valor;
    }

    public Calendar getDataPgto() {
        return dataPgto;
    }

    public Double getValorPgto() {
        return valorPgto;
    }

    public void setDataVcto(Calendar dataVcto) {
        this.dataVcto = dataVcto;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDataPgto(Calendar dataPgto) {
        this.dataPgto = dataPgto;
    }

    public void setValorPgto(Double valorPgto) {
        this.valorPgto = valorPgto;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    
    
}
