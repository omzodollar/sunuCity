package com.sn.esp.sunuCity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sn.esp.sunuCity.model.Information;

public interface InformationDao extends JpaRepository<Information, Integer>{
	 public List<Information>findAll();

	    public Information findById(int id);

	    public Information save(Information information);
}
