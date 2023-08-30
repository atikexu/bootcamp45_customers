package com.bootcamp.customers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.customers.dto.Movements;
import com.bootcamp.customers.dto.Products;
import com.bootcamp.customers.service.ConsultService;

import reactor.core.publisher.Mono;

/**
 * Clase Controller para consultas
 */
@RestController
@RequestMapping("/consult")
public class ConsultController {
	
	@Autowired
    private ConsultService consultService;

	/**
	 * Devuelve todos los productos segun el id del cliente de tipo personal
	 * @param customerId
	 * @return Mono<Products>
	 */
	@GetMapping("/person/{customerId}")
    public Mono<Products> productXCustomerIdPerson(@PathVariable String customerId){
		return consultService.productXCustomerIdPerson(customerId);
    }

	/**
	 * Devuelve todos los productos segun el id del cliente de tipo empresarial
	 * @param customerId
	 * @return Mono<Products>
	 */
	@GetMapping("/company/{customerId}")
    public Mono<Products> productXCustomerIdCompany(@PathVariable String customerId){
		return consultService.productXCustomerIdCompany(customerId);
    }

	/**
	 * Devuelve todos los movimientos segun el id de la cuenta
	 * @param id
	 * @return Mono<Movements>
	 */
	@GetMapping("/movementaccount/{id}")
    public Mono<Movements> movementXAccountId(@PathVariable String id){
		return consultService.movementXAccountId(id);
    }

	/**
	 * Devuelve todos los movimientos segun el id del credito
	 * @param id
	 * @return Mono<Movements>
	 */
	@GetMapping("/movementcredit/{id}")
    public Mono<Movements> movementXCreditId(@PathVariable String id){
		return consultService.movementXCreditId(id);
    }

	/**
	 * Devuelve todos los movimientos segun el id de la tarjeta de credito
	 * @param id
	 * @return Mono<Movements>
	 */
	@GetMapping("/movementcreditcard/{id}")
    public Mono<Movements> movementXCreditCardId(@PathVariable String id){
		return consultService.movementXCreditCardId(id);
    }
	
}
