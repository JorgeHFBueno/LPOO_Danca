
package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// @author JRG B
 
@Entity
@Table(name = "tb_aluno")
//@DiscriminatorValue("A")
public class Aluno extends Pessoa implements Serializable{
    
    
    @Column(nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Calendar dataInicio;
    
    @Column(nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Integer dataPgto;
    
    public Aluno(){
        
    }

    /**
     * @return the data_ultima_visita
     */
    public Calendar getDataInicio() {
        return dataInicio;
    }

    /**
     * @param data_ultima_visita the data_ultima_visita to set
     */
    public void setDataInicio(Calendar data_ultima_visita) {
        this.dataInicio = data_ultima_visita;
    }
    
    
}
