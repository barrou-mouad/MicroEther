package com.example.demo.service;

import java.util.List;

import com.demo.ethereum.entities.Contrat;

public interface ContratService {
public Contrat CreeContrat(Contrat cl);
public Contrat update(Contrat cl);
public void delete(int id);
public Contrat getContratById(Contrat cl);	
public List<Contrat> getContratById();	
}
