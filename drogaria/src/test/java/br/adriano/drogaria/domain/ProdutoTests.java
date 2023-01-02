package br.adriano.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {
	@Test
	public void criar() {
		Produto p = new Produto(
				Short.valueOf("1"), 
				"Cola", 
				Byte.valueOf("15"), 
				BigDecimal.valueOf(10.55), 
				LocalDate.of(2023, 01, 1)
				);
	}
}
