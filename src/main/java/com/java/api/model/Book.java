package com.java.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book implements Serializable {
	private static final long serialVersionUID = -1670893016517855654L;
	@Id
	@GeneratedValue
	@ApiModelProperty(value = "autogenerated id") //custom name for model property in swagger ui
	private int bookId;
	@ApiModelProperty(value = "this is the book name")//custom name for model property in swagger ui
	private String bookName;
	@ApiModelProperty(value = "this is book price")//custom name for model property in swagger ui
	private double price;

}