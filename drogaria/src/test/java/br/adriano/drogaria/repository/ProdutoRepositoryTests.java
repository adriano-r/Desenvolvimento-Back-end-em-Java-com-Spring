package br.adriano.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.adriano.drogaria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(
				null, 
				"Cola", 
				Byte.valueOf("15"), 
				BigDecimal.valueOf(10.55), 
				LocalDate.of(2023, 01, 1)
				);
		
		Produto p2 = new Produto(
				null, 
				"Fanta", 
				Byte.valueOf("23"), 
				BigDecimal.valueOf(9.00), 
				LocalDate.of(2023, 2, 2)
				);
		produtoRepository.save(p1);
		produtoRepository.save(p2);
	}
}