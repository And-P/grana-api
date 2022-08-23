package me.umbrella.grana.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.umbrella.grana.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
