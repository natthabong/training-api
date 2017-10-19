package gec.scf.training.restapi.order.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import gec.scf.training.restapi.order.domain.Order;
import gec.scf.training.restapi.order.repository.OrderRepository;


@RunWith(SpringRunner.class)
public class OrderServiceTest {

	@MockBean
	OrderRepository orderRepository;
	@TestConfiguration
	static class OrderServiceImplTestContextConfiguration {

		@Bean
		public OrderService orderService() {
			return new OrderServiceImpl();
		}
	}

	@Autowired
	OrderService orderService;
	
	
	
	@Test
	public void when_create_order_should_get_order_number001() {
		// Arrange
		Order order = new Order();
		Order expectOrder = new Order();
		expectOrder.setOrderNumber("number001");
		given(orderRepository.save(order)).willReturn(expectOrder);
		
		// Actual
		Order actualOrder = orderService.createOrder(order);
		
		// Assert
		assertEquals("number001",actualOrder.getOrderNumber());
		
	}

}
