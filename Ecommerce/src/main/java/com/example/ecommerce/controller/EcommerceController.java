package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dao.EcommerceDao;
import com.example.ecommerce.model.Ecommerce;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

	@Autowired
	private EcommerceDao dao;
	
	@GetMapping("/getdetails")
	public @ResponseBody List<Ecommerce> getOrders()
	{
		return dao.findAll();
	}
	
	@GetMapping("//getdetails/{orderId}")
	public @ResponseBody Optional<Ecommerce> getOrdersParams(@PathVariable String orderId)
	{
		return dao.findById(Integer.parseInt(orderId));
	}
	
	@PostMapping("/bookorder")
	public @ResponseBody String bookOrder(@RequestBody Ecommerce ecom)
	{
		dao.save(ecom);
		return "Ordered Successfully!!";
	}
	
	@PutMapping("/updateorder/{orderId}")
	public @ResponseBody String updateOrder(@RequestBody Ecommerce ecom,@PathVariable String orderId)
	{
		Ecommerce ecomOld = dao.findById(Integer.parseInt(orderId)).get();
		ecomOld.setProductCategory(ecom.getProductCategory());
		ecomOld.setAmount(ecom.getAmount());
		ecomOld.setOrderId(ecom.getOrderId());
		ecomOld.setPayment(ecom.getPayment());
		ecomOld.setDiscount(ecom.getDiscount());
		dao.save(ecomOld);
		return "Orders are updated!!";
	}
	
	@DeleteMapping("/deleteorders/{orderId}")
	public @ResponseBody String deleteOrder(@PathVariable String orderId)
	{
		dao.deleteById(Integer.parseInt(orderId));
		return "Order Deleted!!";
	}
	
	
}
