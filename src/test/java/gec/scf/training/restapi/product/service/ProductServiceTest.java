package gec.scf.training.restapi.product.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import gec.scf.training.restapi.product.domain.Product;
import gec.scf.training.restapi.product.repository.ProductRepository;

@RunWith(SpringRunner.class)
public class ProductServiceTest {

	@TestConfiguration
	static class ProductServiceImplTestContextConfiguration {

		@Bean
		public ProductService productService() {
			return new ProductServiceImpl();
		}
	}

	@Autowired
	ProductService productService;

	@MockBean
	ProductRepository productRepository;

	@Test
	public void given_stock_has_3_types_of_beer_when_get_all_product_then_should_recieve_3_products() throws Exception {
		// Arrange
		Product slothVersion1 = new Product("slothVersion1", 1, new BigDecimal(150.00));
		Product slothVersion2 = new Product("slothVersion2", 1, new BigDecimal(150.00));
		Product slothVersion3 = new Product("slothVersion3", 1, new BigDecimal(150.00));
		List<Product> expectProducts = new ArrayList<>();
		expectProducts.add(slothVersion1);
		expectProducts.add(slothVersion2);
		expectProducts.add(slothVersion3);
		given(productRepository.findAll()).willReturn(expectProducts);
		// Actual
		List<Product> products = productService.getAllProducts();
		// Assert
		assertEquals(expectProducts.size(), products.size());
	}

}
