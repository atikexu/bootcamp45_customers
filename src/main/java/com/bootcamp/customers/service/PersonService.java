package com.bootcamp.customers.service;

import com.bootcamp.customers.dto.Message;
import com.bootcamp.customers.dto.PersonRequestDto;
import com.bootcamp.customers.dto.PersonResponseDto;
import com.bootcamp.customers.entity.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Clase interfaz de servicio para las clientes personales
 */
public interface PersonService {

	Flux<Person> getAll();

	Mono<Person> getPersonById(String personId);

	Mono<Person> createPerson(PersonRequestDto personRequestDto);

	Mono<Person> updatePerson(PersonRequestDto personRequestDto);

	Mono<Message> deletePerson(String personId);
	
	Mono<PersonResponseDto> requestProfileVip(PersonRequestDto personRequestDto);

}
