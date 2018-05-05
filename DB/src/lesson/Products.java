package lesson;

public class Products {
	private long ProductID;
	private String ProductName;
	private long SupplierID;
	private long CategoryID;
	private long QuantityPerUnit;
	private long UnitPrice;
	private long UnitInStock;
	private long UnitsOnOrder;
	private long RecorderLevel;
	private boolean Discontinued;
	private OrderDetails orderDet;
	
	public Products(long productID, String productName, long supplierID, long categoryID, long quantityPerUnit,
			long unitPrice, long unitInStock, long unitsOnOrder, long recorderLevel, boolean discontinued,
			OrderDetails orderDet) {
		super();
		ProductID = productID;
		ProductName = productName;
		SupplierID = supplierID;
		CategoryID = categoryID;
		QuantityPerUnit = quantityPerUnit;
		UnitPrice = unitPrice;
		UnitInStock = unitInStock;
		UnitsOnOrder = unitsOnOrder;
		RecorderLevel = recorderLevel;
		Discontinued = discontinued;
		this.orderDet = orderDet;
	}
}
