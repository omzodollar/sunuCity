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

import com.sn.esp.sunuCity.dao.InformationDao;

import com.sn.esp.sunuCity.model.Information;

@RestController
public class InformationController {
	 //Récupérer la liste des produits

	  @Autowired
	    private InformationDao informationDao;


	    //Récupérer la liste des informations

	    @RequestMapping(value="/Informations", method=RequestMethod.GET)

	    public List<Information>listeInformations() {

	        return informationDao.findAll();

	    }


	    //Récupérer une information par son Id

	    @GetMapping(value="/Informations/{id}")

	    public Information afficherUneInformation(@PathVariable int id) {

	        return informationDao.findById(id);

	    }
	    @PostMapping(value = "/Informations")

	    public ResponseEntity<Void> ajouterInformation(@RequestBody Information product) {


	        Information informationAdded =  informationDao.save(product);


	        if (informationAdded == null)

	            return ResponseEntity.noContent().build();


	        URI location = ServletUriComponentsBuilder

	                .fromCurrentRequest()

	                .path("/{id}")

	                .buildAndExpand(informationAdded.getId())

	                .toUri();


	        return ResponseEntity.created(location).build();

	    }
	    @PutMapping (value = "/Informations")
	    public void updateInformation(@RequestBody Information product) {

	       informationDao.save(product);
	    }
	    @DeleteMapping (value = "/Informations/{id}")
	    public void supprimerInformation(@PathVariable int id) {

	        informationDao.deleteById(id);
	    }



}
