package lesson;

public class Categories {
	private long CategoryID;
	private String CategoryName;
	private String Description;
	//private Picture;
	private Products product;
	
	public Categories(long categoryID, String categoryName, String description, Products product) {
		super();
		CategoryID = categoryID;
		CategoryName = categoryName;
		Description = description;
		this.product = product;
	}
	
}
