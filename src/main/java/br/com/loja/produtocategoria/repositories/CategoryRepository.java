package br.com.loja.produtocategoria.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.loja.produtocategoria.entities.Category;

@Component
public class CategoryRepository {
	
	private Map<Long, Category> map = new HashMap<>();

	public void save(Category cat) {
		this.map.put(cat.getId(), cat);
	}

	public Category findById(Long id) {
		return this.map.get(id);
	}
	
	public List<Category> findAll() {
		 List <Category> todasAsCat = new ArrayList<>(map.values());
		 return todasAsCat;
		
	}
}
