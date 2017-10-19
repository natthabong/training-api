package gec.scf.training.restapi.product.rest;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import gec.scf.training.restapi.product.domain.Product;
import gec.scf.training.restapi.product.service.ProductService;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

	@Autowired
	MockMvc mvc;

	@MockBean
	ProductService productService;

	@Test
	public void given_stock_has_3_types_of_beer_when_get_all_product_then_should_recieve_3_products() throws Exception {
		// Arrange
		Product lagerBeer = new Product("Lage", 3, new BigDecimal("120")),
				withbeer = new Product("withbeer", 2, new BigDecimal("150")),
				paleAleBeer = new Product("paleAleBeer", 1, new BigDecimal("150"));

		List<Product> allProducts = Arrays.asList(new Product[] { lagerBeer, withbeer, paleAleBeer });
		given(productService.getAllProducts()).willReturn(allProducts);

		// Actual
		ResultActions actualResponse = mvc.perform(get("/products").contentType(MediaType.APPLICATION_JSON));

		// Assert
		actualResponse.andExpect(jsonPath("$", hasSize(3)));
	}
	
	

}
