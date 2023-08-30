package com.bootcamp.customers.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * Clase de transferencia de datos para el microservicio de creditos
 */
@Data
@JsonInclude(Include.NON_NULL)
public class Credit {
	private String id;
	private String customerId;
	private Integer typeAccount;
	private String descripTypeAccount;
	private Double creditAmount;
	private Double existingAmount;
	private Date creditDate;
	private String typeCustomer;
	private Double amount;
}
