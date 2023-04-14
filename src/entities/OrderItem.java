package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, String name) {
		this.quantity = quantity;
		this.price = price;
		this.product = new Product(name, price);
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return quantity*price;
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.product.getName());
		sb.append(", $" + String.format("%.2f", this.price));
		sb.append(", Quantity: " + this.quantity);
		sb.append(", Subtotal: $" + String.format("%.2f", this.subTotal()));
		return sb.toString();
	}
	
}
