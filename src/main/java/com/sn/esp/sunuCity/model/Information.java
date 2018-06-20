package com.sn.esp.sunuCity.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;


	@Entity
	public class Information {
	 @Id
	 @GeneratedValue
    private int id;
	
	private String titre;
    private String description;

    //information que nous ne souhaitons pas exposer
    private String date;

    //constructeur par défaut
    public Information() {
    }

    //constructeur pour nos tests
    public Information(int id, String titre, String description, String date) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description=" + description +
                ", date=" + date +

                '}';
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}