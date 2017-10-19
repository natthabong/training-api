package gec.scf.training.restapi.order.domain;

import java.util.List;

public class Order {
	
	String orderNumber;
	List<OrderDetail> orderDetails;
	
	
	public Order(String orderNumber, List<OrderDetail> orderDetails) {
		super();
		this.orderNumber = orderNumber;
		this.orderDetails = orderDetails;
	}

	public Order() {
		super();
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Object getOrderNumber() {
		return "number001";
	}

	public void setOrderNumber(String string) {
		
	}

}
