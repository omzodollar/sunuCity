package com.sn.esp.sunuCity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sn.esp.sunuCity.model.Information;
import com.sn.esp.sunuCity.model.Structure;

public interface StructureDao extends JpaRepository<Structure, Integer>{
	 public List<Structure> findAll();
	 public Structure findById(int id);
	 public Structure save(Structure structure);
}
