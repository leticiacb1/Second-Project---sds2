package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.ProductDTO;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.ProductRepository;

@Service  /*Objeto da camada de Serviço*/

/*Product Service depende da camada Repository*/

public class ProductService {
	
	@Autowired  /*Resoslução da dependencia de forma transparente*/
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();	
		
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	
	}
}
