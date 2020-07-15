package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.OrderEntity;
import com.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repo;

	public List<OrderEntity> getOrderList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
