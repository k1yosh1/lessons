package lesson;

public class OrderDetails {
	private long OrderID;
	private long ProductID;
	private long UnitPrice;
	private long Quantity;
	private long Discount;
	
	public OrderDetails(long orderID, long productID, long unitPrice, long quantity, long discount) {
		super();
		OrderID = orderID;
		ProductID = productID;
		UnitPrice = unitPrice;
		Quantity = quantity;
		Discount = discount;
	}
	
}
