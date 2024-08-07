package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Calendar;
/**
 *
 * @author JRG B
 */

@Entity
public class FolhaPagamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private Calendar dataPgto;
    private double valorReceber;

    //Validação do Mapeamento Bidirecional: Garantir que o mapeamento @OneToMany em Professor 
    //e @ManyToOne em FolhaPagamento estejam corretamente configurados para refletir o relacionamento bidirecional.
    @ManyToOne
    @JoinColumn(name="folha_pgto_professor")
    private Professor professor;
    
    public void calcularFolhaMes() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Calendar dataPgto) {
        this.dataPgto = dataPgto;
    }

    public double getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(double valorReceber) {
        this.valorReceber = valorReceber;
    }
   
}
