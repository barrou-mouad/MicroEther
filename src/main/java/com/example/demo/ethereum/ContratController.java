package com.example.demo.ethereum;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ethereum.entities.Contrat;


@RestController
@RequestMapping("contrat")
public class ContratController {
@Autowired
private com.example.demo.service.ContratService contratservice;
@GetMapping("test")
public String sayHello() {return "hello contrat";}
@PostMapping("save")
public Contrat save(@RequestBody Contrat c) {return contratservice.CreeContrat(c);}
}
