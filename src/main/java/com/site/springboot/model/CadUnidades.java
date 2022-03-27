package com.site.springboot.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CadUnidades implements Serializable {
   
    
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomeUnidade;
    private String codTotvs;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUnidade() {
        return this.nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public String getCodTotvs() {
        return this.codTotvs;
    }

    public void setCodTotvs(String codTotvs) {
		this.codTotvs = codTotvs;
	}
}
