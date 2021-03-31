package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "fruits_details")

@NamedQueries ({
@NamedQuery (name = "selectAll", query = "from FruitsDTO fruitsDTO"),
@NamedQuery(name = "updateByColor", query = "update FruitsDTO fruitsDTO set fruitsDTO.fruitName =:name, fruitsDTO.fruitPrice =:price where fruitsDTO.fruitColor =:color"),
})

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FruitsDTO {
	
	@Id
	@Column(name = "fruitID")
	private int fruitID;
	
	@Column(name = "fruitName")
	private String fruitName;
	
	@Column(name = "fruitColor")
	private String fruitColor;
	
	@Column(name = "fruitPrice")
	private double fruitPrice;

}
