package br.com.loja.produtocategoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.loja.produtocategoria.entities.Category;
import br.com.loja.produtocategoria.repositories.CategoryRepository;

@SpringBootApplication
public class ProdutoCategoriaApplication implements CommandLineRunner {
	
	@Autowired
	CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProdutoCategoriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		this.categoryRepository.save(cat1);
		this.categoryRepository.save(cat2);
	}

}
