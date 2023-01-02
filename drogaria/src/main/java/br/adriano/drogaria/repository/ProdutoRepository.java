package br.adriano.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.adriano.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short> {

}
