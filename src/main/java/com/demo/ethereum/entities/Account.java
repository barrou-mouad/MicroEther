package com.demo.ethereum.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "account")
public class Account {
@Id
private String id;
private String address;
private String privateKey;
@DBRef
@JsonIgnore
private Client client;
public String getId() {
	return id;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public void setId(String id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPrivateKey() {
	return privateKey;
}
public void setPrivateKey(String privateKey) {
	this.privateKey = privateKey;
}

public Account(String id, String address, String privateKey, Client client) {
	super();
	this.id = id;
	this.address = address;
	this.privateKey = privateKey;
    this.client=client;
}

public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}


}
