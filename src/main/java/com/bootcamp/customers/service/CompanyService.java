package com.bootcamp.customers.service;

import com.bootcamp.customers.dto.CompanyRequestDto;
import com.bootcamp.customers.dto.CompanyResponseDto;
import com.bootcamp.customers.dto.Message;
import com.bootcamp.customers.entity.Company;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Clase interfaz de servicio para las clientes empresariales
 */
public interface CompanyService {

	Flux<Company> getAll();

	Mono<Company> getCompanyById(String companyId);

	Mono<CompanyResponseDto> createCompany(CompanyRequestDto companyRequestDto);

	Mono<CompanyResponseDto> updateCompany(CompanyRequestDto companyRequestDto);

	Mono<Message> deleteCompany(String companyId);

	Mono<CompanyResponseDto> requestProfilePyme(CompanyRequestDto companyRequestDto);
}
