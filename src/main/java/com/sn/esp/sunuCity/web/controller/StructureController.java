package com.sn.esp.sunuCity.web.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sn.esp.sunuCity.dao.StructureDao;

import com.sn.esp.sunuCity.model.Information;
import com.sn.esp.sunuCity.model.Structure;

@RestController
public class StructureController {
	 //Récupérer la liste des produits

	  @Autowired
	    private StructureDao structureDao;


	    //Récupérer la liste des informations

	    @RequestMapping(value="/Structures", method=RequestMethod.GET)

	    public List<Structure>listeStructures() {

	        return structureDao.findAll();

	    }


	    //Récupérer une information par son Id

	    @GetMapping(value="/Structures/{id}")

	    public Structure afficherUneStructure(@PathVariable int id) {

	        return structureDao.findById(id);

	    }
	    @PostMapping(value = "/Structures")

	    public ResponseEntity<Void> ajouterStructure(@RequestBody Structure structure) {


	        Structure structuretAdded =  structureDao.save(structure);


	        if (structuretAdded == null)

	            return ResponseEntity.noContent().build();


	        URI location = ServletUriComponentsBuilder

	                .fromCurrentRequest()

	                .path("/{id}")

	                .buildAndExpand(structuretAdded.getId())

	                .toUri();


	        return ResponseEntity.created(location).build();

	    }
	    @PutMapping (value = "/Structures")
	    public void updateStructure(@RequestBody Structure product) {

	    	structureDao.save(product);
	    }
	    @DeleteMapping (value = "/Structures/{id}")
	    public void supprimerStructure(@PathVariable int id) {

	    	structureDao.deleteById(id);
	    }



}
