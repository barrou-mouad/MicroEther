package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ethereum.entities.Contrat;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.ContratRepository;
import com.example.demo.repository.ImmobilierRepository;



@Service
public class ContratServiceImp implements ContratService{
	@Autowired
	ClientRepository clrep;
	@Autowired
	AccountRepository accrep;
	@Autowired
	ImmobilierRepository imrep;
	@Autowired
	ContratRepository crep;
	@Override
	public Contrat CreeContrat(Contrat cl) {
		// TODO Auto-generated method stub
		return crep.save(cl);
	}

	@Override
	public Contrat update(Contrat cl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contrat getContratById(Contrat cl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contrat> getContratById() {
		// TODO Auto-generated method stub
		return null;
	}

}
