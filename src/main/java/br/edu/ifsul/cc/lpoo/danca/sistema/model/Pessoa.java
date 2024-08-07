package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

//@author JRG B

@Entity
@Table(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "tipo")
public abstract class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id; 
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = true, length = 11)
    private String numero_celular;
    
    @Column(nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAniver;
    
    @Column(nullable = false, length = 100)
    private String email;
    
    @Column(nullable = true, length = 100)
    private String endereco;
    
    //@Transient
    //private String tipo;    
    
    
    public Pessoa(){
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numero_celular
     */
    public String getNumero_celular() {
        return numero_celular;
    }

    /**
     * @param numero_celular the numero_celular to set
     */
    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular.replaceAll(" ", "");
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /*
    @return the tipo 
    public String getTipo() {
        return tipo;
    }
    @param tipo the tipo to set
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     */
    

    public Integer getId() {
        return id;
    }

    public Calendar getDataAniver() {
        return dataAniver;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDataAniver(Calendar dataAniver) {
        this.dataAniver = dataAniver;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}
