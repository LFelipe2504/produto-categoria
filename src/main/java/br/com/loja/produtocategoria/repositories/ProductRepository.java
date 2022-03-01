package br.com.loja.produtocategoria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.loja.produtocategoria.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {	
	
}
