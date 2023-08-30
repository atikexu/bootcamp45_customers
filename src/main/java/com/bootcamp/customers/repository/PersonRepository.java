package com.bootcamp.customers.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.customers.entity.Person;

/**
 * Clase Repositorio para los métodos de acceso a la base de datos de los clientes personales
 */
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

}
