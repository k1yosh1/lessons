package lesson;

import java.util.Date;

import javax.swing.JPanel;

public class Employees extends JPanel{
	private long EmployeeID;
	private String LastName;
	private String FirstName;
	private String Title;
	private String TitleOfCourtesy;
	private Date BirthDate;
	private Date HireDate;
	private String Address;
	private String City;
	private String Region;
	private long PostalCode;
	private String Country;
	private long HomePhone;
	private String Extension;
	//private Photo;
	private String Notes;
	private String ReportsTo;
	private Orders order;
	
	public Employees(long employeeID, String lastName, String firstName, String title, String titleOfCourtesy,
			Date birthDate, Date hireDate, String address, String city, String region, long postalCode, String country,
			long homePhone, String extension, String notes, String reportsTo, Orders order) {
		super();
		EmployeeID = employeeID;
		LastName = lastName;
		FirstName = firstName;
		Title = title;
		TitleOfCourtesy = titleOfCourtesy;
		BirthDate = birthDate;
		HireDate = hireDate;
		Address = address;
		City = city;
		Region = region;
		PostalCode = postalCode;
		Country = country;
		HomePhone = homePhone;
		Extension = extension;
		Notes = notes;
		ReportsTo = reportsTo;
		this.order = order;
		}
	}
	
	
	
