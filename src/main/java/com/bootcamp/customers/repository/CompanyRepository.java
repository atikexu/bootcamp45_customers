package com.bootcamp.customers.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.customers.entity.Company;

/**
 * Clase Repositorio para los métodos de acceso a la base de datos de los clientes empresariales
 */
public interface CompanyRepository extends ReactiveMongoRepository<Company, String> {

}
