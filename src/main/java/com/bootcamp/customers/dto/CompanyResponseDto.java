package com.bootcamp.customers.dto;

import com.bootcamp.customers.entity.Company;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase de transferencia de datos para la respuesta
 * de los clientes empresariales
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompanyResponseDto{
	private String message;
	private Company company;
}
