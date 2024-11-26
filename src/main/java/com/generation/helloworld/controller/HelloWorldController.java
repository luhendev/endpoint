package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
	
	@GetMapping ("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping ("/lista-bsm")
	public String listaBSM() {
		return	"""
				# Mentalidades:<br><br>
				- Orientação ao futuro<br>
				- Persistência<br>
				- Responsabilidade Pessoal<br>
				- Mentalidade de Crescimento<br><br>
				# Competências comportamentais:<br><br>
				- Comunicação<br>
				- Proatividade<br>
				- Orientação ao Detalhe<br>
				- Trabalho em equipe
				""";
	}
	
	@GetMapping ("/lista-objetivos")
	public String listaObjetivos() {
		return	"""
				# Lista de Objetivos:<br><br>
				- Ser capaz de ter mais disciplina!<br>
				- Ser capaz de dominar a criar endpoints.<br>
				- Ser capaz de criar o meu blog pessoal.<br>
				- Ser capaz de dominar o desenvolvimento web de backend por completo.<br>
				""";
	}
}
