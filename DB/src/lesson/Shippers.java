package lesson;

public class Shippers {
	private long ShipperID;
	private String CompanyName;
	private long Phone;
	private Orders order;
	
	public Shippers(long shipperID, String companyName, long phone, Orders order) {
		super();
		ShipperID = shipperID;
		CompanyName = companyName;
		Phone = phone;
		this.order = order;
	}
	
}
