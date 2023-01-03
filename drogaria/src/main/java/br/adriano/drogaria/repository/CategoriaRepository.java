package br.adriano.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.adriano.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {

}
