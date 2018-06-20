package com.sn.esp.sunuCity.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;


	@Entity
	public class Structure {
	 @Id
	 @GeneratedValue
    private int id;
	
	private String libelle;
    private String telephone;


    //constructeur par défaut
    public Structure() {
    }

    //constructeur pour nos tests
    public Structure(int id, String libelle, String telephone) {
        this.id = id;
        this.libelle = libelle;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", telephone=" + telephone +

                '}';
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
}