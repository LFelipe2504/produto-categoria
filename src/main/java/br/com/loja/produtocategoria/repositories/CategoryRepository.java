package br.com.loja.produtocategoria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.loja.produtocategoria.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {	
	
}
