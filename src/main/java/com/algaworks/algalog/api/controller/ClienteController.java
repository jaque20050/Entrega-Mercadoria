package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Jaqueline");
		cliente1.setEmail("jaque@gmail.com");
		cliente1.setTelefone("123456789");

		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Peterson");
		cliente2.setEmail("pethu@gmail.com");
		cliente2.setTelefone("123456789");

		return Arrays.asList(cliente1, cliente2);
	}
}
