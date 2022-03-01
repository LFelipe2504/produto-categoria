package br.com.loja.produtocategoria;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.loja.produtocategoria.entities.Category;
import br.com.loja.produtocategoria.entities.Product;
import br.com.loja.produtocategoria.repositories.CategoryRepository;
import br.com.loja.produtocategoria.repositories.ProductRepository;

@SpringBootApplication
public class ProdutoCategoriaApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;  

	public static void main(String[] args) {
		SpringApplication.run(ProdutoCategoriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");

		Product p1 = new Product(null, "TV", 2200.00, cat1);
		Product p2 = new Product(null, "Domain Driven Design", 120.00, cat2);
		Product p3 = new Product(null, "PS5", 2800.00, cat1);
		Product p4 = new Product(null, "Docker", 100.00, cat2);

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		this.categoryRepository.save(cat1);
		this.categoryRepository.save(cat2);
		
		this.productRepository.save(p1);
		this.productRepository.save(p2);
		this.productRepository.save(p3);
		this.productRepository.save(p4);
	}

}
