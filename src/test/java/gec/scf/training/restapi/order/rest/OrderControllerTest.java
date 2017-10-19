package gec.scf.training.restapi.order.rest;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;

import gec.scf.training.restapi.order.domain.Order;
import gec.scf.training.restapi.order.rest.OrderController;
import gec.scf.training.restapi.order.service.OrderService;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderController.class)
public class OrderControllerTest {

	@MockBean
	OrderService orderService;

	@Autowired
	MockMvc mvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void send_beer_order_then_should_receive_order_number() throws Exception {
		// Arrange
		Order sendOrder = new Order();
		Order expectedOrder = new Order();
		String expectedOrderNumber = "order001";
		expectedOrder.setOrderNumber(expectedOrderNumber);

		given(orderService.createOrder(Mockito.any(Order.class))).willReturn(expectedOrder);

		// Actual
		ResultActions actualResponse = mvc.perform(post("/orders").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(sendOrder)));

		// Assert
		actualResponse.andExpect(jsonPath("$.orderNumber").value(expectedOrder.getOrderNumber()));
	}

}
