package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "shopper_list")
@Data
public class ShopperEntity {

	@Id
	@Column(name = "shopperid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shopperID;
	
	@Column(name = "shopper_name")
	private String shopperName;
	
	@Column(name = "shopper_age")
	private int shopperAge;
	
	@Column(name = "shopper_contact")
	private long shopperContact;
	
	@Column(name = "shopper_email")
	private String shopperEmail;
}
