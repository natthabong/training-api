package gec.scf.training.restapi.product.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tbl_product")
public class Product {
	@Id
	Long product_id;
	@Column(name = "product_name")
	String name;
	@Column(name = "quantity")
	int unit;
	@Column(name = "price")
	BigDecimal price;

	public Product(String name, int unit, BigDecimal price) {
		super();
		this.name = name;
		this.unit = unit;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
