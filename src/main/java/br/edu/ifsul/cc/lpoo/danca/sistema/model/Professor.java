
package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *  *gabrielle brambilla, *emmanuel scortegagna, jair.
 * @author telmo
 */



//@Entity
@Table(name = "tb_professor")
@DiscriminatorValue("P")
public class Professor extends Pessoa{
    
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAdmissao;
    
    
    public Professor(){
        
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    } 
    
}
