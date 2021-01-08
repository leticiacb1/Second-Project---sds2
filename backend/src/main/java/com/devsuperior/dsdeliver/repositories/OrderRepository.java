package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

	/*Ordenar apenas os pedidos pendentes do mais antigo ao mais recente*/
	
	/*Consulta no Spring Data --> Não presente no SQL mas sim na linguagem da JPa (JPQL)*/
	
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products WHERE obj.status = 0 ORDER BY obj.moment ASC")
	
	List<Order> FindOrderWithProducts();

}
