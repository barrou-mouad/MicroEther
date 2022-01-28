package com.example.demo.ethereum;

import com.demo.ethereum.entities.Account;
import com.demo.ethereum.entities.Contrat;

public class Recevier {
     private Account a;
     private Contrat c;
	public Account getA() {
		return a;
	}
	public void setA(Account a) {
		this.a = a;
	}
	public Contrat getC() {
		return c;
	}
	public void setC(Contrat c) {
		this.c = c;
	}
	public Recevier(Account a, Contrat c) {
		super();
		this.a = a;
		this.c = c;
	}
     
      
}
