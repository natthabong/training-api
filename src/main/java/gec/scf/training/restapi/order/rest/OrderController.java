package gec.scf.training.restapi.order.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gec.scf.training.restapi.order.domain.Order;
import gec.scf.training.restapi.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@RequestMapping(path = "/orders", method=RequestMethod.POST)
	Order createOrder(Order o) {
		return orderService.createOrder(o);
	}
}
