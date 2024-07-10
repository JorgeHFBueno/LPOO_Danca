
package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author JRG
 */

@Entity
//@Table(name = "tb_itensContrato")
//@NamedQueries({@NamedQuery(name="itensContrato.orderbyid", query="select i from itensContrato i order by i.id asc")})
public class ItensContrato implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_itensContrato", sequenceName = "seq_itensContrato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_itensContrato", strategy = GenerationType.SEQUENCE)      
    private Integer idContrato;
    
    private int idPacote;
    
    @ManyToOne
    @JoinColumn(name = "contrato_id", nullable = false)
    private Contrato contrato;
    
    
    public ItensContrato(){
        
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Integer getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public int getIdPacote() {
        return idPacote;
    }

    public void setIdPacote(int idPacote) {
        this.idPacote = idPacote;
    }

    
    
}
