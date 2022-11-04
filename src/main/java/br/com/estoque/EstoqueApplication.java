package br.com.estoque;

import br.com.estoque.model.Product;
import br.com.estoque.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EstoqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoqueApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ProductRepository productRepository){
		return args -> {
			productRepository.deleteAll();

			Product p = new Product();

			p.setName("Lapis");
			p.setCategory("escritorio");
			p.setQuantity(150L);
			p.setPrice(1.50);

			Product p1 = new Product();
			p1.setName("caneta");
			p1.setCategory("escritorio");
			p1.setQuantity(130L);
			p1.setPrice(1.50);

			List<Product> list = Arrays.asList(p,p1);
			productRepository.saveAll(list);
		};
	}
}
