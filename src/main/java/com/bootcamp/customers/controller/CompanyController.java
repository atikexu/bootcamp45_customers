package com.bootcamp.customers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.customers.dto.CompanyRequestDto;
import com.bootcamp.customers.dto.CompanyResponseDto;
import com.bootcamp.customers.dto.Message;
import com.bootcamp.customers.entity.Company;
import com.bootcamp.customers.service.CompanyService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Clase Controller para clientes empresariales
 */
@RestController
@RequestMapping("/company")
public class CompanyController {
	
    @Autowired
    private CompanyService companyService;

	/**
	 * Devuelve todos los clientes de tipo empresarial
	 * @return Flux<Company>
	 */
	@GetMapping
    public Flux<Company> getAll(){
		return companyService.getAll();
    }

	/**
	 * Devuelve los clientes empresariales segun el id del cliente
	 * @param companyId
	 * @return Mono<Company>
	 */
	@GetMapping("/{companyId}")
    public Mono<Company> getCompanyById(@PathVariable String companyId){
		return companyService.getCompanyById(companyId);
    }

	/**
	 * Crea un nuevo cliente de tipo empresarial con los datos enviados en el body
	 * @param companyRequestDto
	 * @return Mono<Company>
	 */
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<CompanyResponseDto> createCompany(@RequestBody CompanyRequestDto companyRequestDto){
		return companyService.createCompany(companyRequestDto);
    }

	/**
	 * Actualiza el cliente de tipo empresarial según los datos enviados en el body
	 * @param companyRequestDto
	 * @return Mono<Company>
	 */
	@PutMapping(consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<CompanyResponseDto> updateCompany(@RequestBody CompanyRequestDto companyRequestDto){
		return companyService.updateCompany(companyRequestDto);
    }

	/**
	 * Elimina el cliente de tipo empresarial segun el id del cliente
	 * @param companyId
     * @return Mono<Message>
	 */
	@DeleteMapping("/{companyId}")
	public Mono<Message> deleteCompany(@PathVariable String companyId){
		return companyService.deleteCompany(companyId);
    }
	
	/**
	 * Solicitud para cliente PYME
	 * @param personRequestDto
	 * @return Mono<Person>
	 */
	@PostMapping(value = "/pyme", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<CompanyResponseDto> requestProfilePyme(@RequestBody CompanyRequestDto companyRequestDto){
		return companyService.requestProfilePyme(companyRequestDto);
    }
	
}
