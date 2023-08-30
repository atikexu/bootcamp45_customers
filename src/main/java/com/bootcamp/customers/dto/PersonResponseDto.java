package com.bootcamp.customers.dto;

import com.bootcamp.customers.entity.Person;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase de transferencia de datos para la respuesta
 * de los clientes personales
 */
@Getter
@Setter
public class PersonResponseDto{
	private Person person;
	private Message statusDto;
}
