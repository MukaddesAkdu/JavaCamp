package oopIntro;

public class Product {
    
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	//private double unitPriceAfterDiscount;
	
    public Product() {
    	System.out.println("Ben Çalıştım");
    }
    
    public Product(int id, String name, double unitPrice, 
    		String detail, double discount) {
		super();
		//this();   this, bu classdakini; super, basedekini çalıştırır.
		this.id = id;                        //eşitleme yöntemi; this, bu classda ki demektir
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		//this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		//return unitPriceAfterDiscount;
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}
   
	
	
	
    
}
