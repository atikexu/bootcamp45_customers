package com.bootcamp.customers.dto;

import lombok.Data;

/**
 * Clase de transferencia de datos para la solicitud
 * de los clientes personales
 */
@Data
public class PersonRequestDto {
	private String id;
	private String name;
	private String lastName;
	private String dni;
	private String email;
	private String telephone;
	private String typeCustomer;
}
