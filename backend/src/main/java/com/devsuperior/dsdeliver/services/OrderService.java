package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.repositories.OrderRepository;

@Service  /*Objeto da camada de Serviço*/

/*Product Service depende da camada Repository*/

public class OrderService {
	
	@Autowired  /*Resolução da dependencia de forma transparente*/
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		
		/*Pegando apenas pedidos pendentes do mais atrasado ao menos pelo método criado*/
		List<Order> list = repository.FindOrderWithProducts();	
		
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	
	}
}
