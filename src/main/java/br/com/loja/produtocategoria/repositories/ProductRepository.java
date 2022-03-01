package br.com.loja.produtocategoria.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.loja.produtocategoria.entities.Product;

@Component
public class ProductRepository {
	
	private Map<Long, Product> map = new HashMap<>();

	public void save(Product cat) {
		this.map.put(cat.getId(), cat);
	}

	public Product findById(Long id) {
		return this.map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<>(map.values());		
	}
}
