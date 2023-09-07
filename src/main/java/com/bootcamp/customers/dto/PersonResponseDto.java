package com.bootcamp.customers.dto;

import com.bootcamp.customers.entity.Person;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de transferencia de datos para la respuesta
 * de los clientes personales
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonResponseDto{
	private String message;
	private Person person;
}
