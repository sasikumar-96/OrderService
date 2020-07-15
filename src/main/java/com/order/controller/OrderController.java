package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.OrderEntity;
import com.order.service.OrderService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@PostMapping("/order")
	public List<OrderEntity> getOrderList(){
		
		return service.getOrderList();
	}
	

}
