package me.umbrella.grana.api.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.umbrella.grana.api.model.Pessoa;
import me.umbrella.grana.api.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	

	//METHODS
	
	@GetMapping
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
	
	
	@PostMapping
	public ResponseEntity<Pessoa> criar(@Valid @RequestBody Pessoa pessoa, HttpServletResponse response) {
		
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
					.buildAndExpand(pessoaSalva.getCodigo())
					.toUri();
		
		//response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(pessoaSalva);
	}
	
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Pessoa> buscaPeloCodigo(@PathVariable Long codigo) {
		
		Optional<Pessoa> pessoa = pessoaRepository.findById(codigo);
		
		return pessoa.isPresent() ? ResponseEntity.ok(pessoa.get()) : ResponseEntity.notFound().build();
	}

}






