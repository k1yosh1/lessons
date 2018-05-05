package lesson;

public class Suppliers {
	private long SupplierID;
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
	private String HomePage;
	private Products product;
	
	public Suppliers(long supplierID, String companyName, String contactName, String contactTitle, String address,
			String city, String region, long postalCode, String country, long phone, String fax, String homePage,
			Products product) {
		super();
		SupplierID = supplierID;
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
		HomePage = homePage;
		this.product = product;
	}
	
}
