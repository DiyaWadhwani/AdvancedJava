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
@Table(name = "library_details")

@NamedQueries({
	@NamedQuery(name = "selectAll", query = "from LibraryDTO libraryDTO")
})

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter

public class LibraryDTO {
	
	@Id
	@Column(name = "bookID")
	private String bookID;
	
	@Column(name = "bookName")
	private String bookName;
	
	@Column(name = "bookPages")
	private int bookPages;
	
	@Column(name = "bookPrice")
	private double bookPrice;

}
