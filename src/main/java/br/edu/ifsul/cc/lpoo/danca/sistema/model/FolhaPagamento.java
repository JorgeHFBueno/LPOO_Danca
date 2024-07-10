package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import javax.persistence.*;
import java.util.Calendar;
/**
 *
 * @author JRG
 */

@Entity
public class FolhaPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Calendar dataPgto;
    private double valorReceber;

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
