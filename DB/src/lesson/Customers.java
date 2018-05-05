package lesson;

public class Customers {
	private long CustomerID;
	private String CompanyName;
	private String ContactName;
	private String ContactTitle;
	private String Address;
	private String City;
	private String Region;
	private long PostalCode;
	private String Country;
	private long Phone;
	private String Fax;
	private Orders order;
	
	public Customers(long customerID, String companyName, String contactName, String contactTitle, String address,
			String city, String region, long postalCode, String country, long phone, String fax, Orders order) {
		super();
		CustomerID = customerID;
		CompanyName = companyName;
		ContactName = contactName;
		ContactTitle = contactTitle;
		Address = address;
		City = city;
		Region = region;
		PostalCode = postalCode;
		Country = country;
		Phone = phone;
		Fax = fax;
		this.order = order;
	}
}
