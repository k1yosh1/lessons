package lesson;
import java.util.Date;
public class Orders {
	
		private long OrderID;
	    private long CustomerID;
	    private long EmployeeID;
	    private Date OrderDate;
	    private Date RequiredDate;
	    private Date ShippedDate;
	    private String ShipVia;
	    private long Freight;
	    private String ShipName;
	    private String ShipAddress;
	    private String ShipCity;
	    private String ShipRegion;
	    private long ShipPostalCode;
	    private String ShipCountry;
	    private OrderDetails orderDet;
		
	    public Orders(long orderID, long customerID, long employeeID, Date orderDate, Date requiredDate,
				Date shippedDate, String shipVia, long freight, String shipName, String shipAddress, String shipCity,
				String shipRegion, long shipPostalCode, String shipCountry, OrderDetails orderDet) {
			super();
			OrderID = orderID;
			CustomerID = customerID;
			EmployeeID = employeeID;
			OrderDate = orderDate;
			RequiredDate = requiredDate;
			ShippedDate = shippedDate;
			ShipVia = shipVia;
			Freight = freight;
			ShipName = shipName;
			ShipAddress = shipAddress;
			ShipCity = shipCity;
			ShipRegion = shipRegion;
			ShipPostalCode = shipPostalCode;
			ShipCountry = shipCountry;
			this.orderDet = orderDet;
		}
	    
	    
	}

