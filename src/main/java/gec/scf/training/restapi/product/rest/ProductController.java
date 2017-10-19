package gec.scf.training.restapi.product.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gec.scf.training.restapi.product.domain.Product;
import gec.scf.training.restapi.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(path = "/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();

	}
}
