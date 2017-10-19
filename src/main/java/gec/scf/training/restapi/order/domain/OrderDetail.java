package gec.scf.training.restapi.order.domain;

public class OrderDetail {
	Long productID;
	String orderNumber;
	int quantity;
	
	public OrderDetail() {
		super();
	}
	public OrderDetail(Long productID, String orderNumber, int quantity) {
		super();
		this.productID = productID;
		this.orderNumber = orderNumber;
		this.quantity = quantity;
	}
	public Long getProductID() {
		return productID;
	}
	public void setProductID(Long productID) {
		this.productID = productID;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
