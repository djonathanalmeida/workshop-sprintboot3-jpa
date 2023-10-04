package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

//CONTROLADOR REST QUE RESPONDE NO CAMINHO "USERS";

// ANOTAÇÃO PARA DIZER QUE ESSA CLASSE É UM RECURSO WEB QUE É IMPLEMENTADO POR UM CONTROLADOR REST
@RestController
// ANOTAÇÃO QUE DA O NOME PARA O RECURSO E INDICA QUE O CONTROLADOR IRÁ RECEBER REQUISIÇÕES A URL "www":
@RequestMapping(value = "/users")
public class UserResource {
	
	// MÉTODO QUE TEM A FINALIDADE DE SER UM ENDPOINT PRA ACESSAR OS USUÁRIOS:
	@GetMapping //UTILIZADO PARA INDICAR QUE É UM MÉTODO QUE RESPONDE UMA REQUISIÇÃO DO TIPO GET DO HTTP
	public ResponseEntity<User> findAll(){ // O RESPONSEENTITY É UM TIPO DO SPRING PARA RETORNAR RESPOSTAS DE REQUISIÇÕES WEB (DENTRO DO <> É O TIPO DA RESPOSTA, NO CASO OS USUÁRIOS)
		User u = new User(1L, "Maria", "maria@email.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);// O "OK" RETORNA A RESPOSTA COM SUCESSO NO HTTP
	}
	
}
