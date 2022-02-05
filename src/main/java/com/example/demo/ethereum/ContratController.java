package com.example.demo.ethereum;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ethereum.entities.Contrat;
import com.demo.ethereum.entities.Contrat;

@RestController
@RequestMapping("contratt")
public class ContratController {
@Autowired
private com.example.demo.service.ContratService contratservice;

@PostMapping("save")
public Contrat save(@RequestBody Contrat c) {return contratservice.CreeContrat(c);}
}
