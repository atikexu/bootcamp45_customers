package com.bootcamp.customers.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase de entidad para clientes personales
 */
@Data
@AllArgsConstructor
@Document(collection="person")
public class Person {
	@Id
	private String id;
	private String name;
	private String lastName;
	private String dni;
	private String email;
	private String telephone;
	private String typeCustomer;
	private String typeProfile;
}
