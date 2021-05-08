package oopIntro;

public class Main {

	public static void main(String[] args) {
		/*String[] products = {
				"Lenovo V14","Lenovo V15","Hp 5"
		};   bu kod gerçekçi değildir.*/
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram", 10);
		/*product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 15000;
        product1.detail = "16 GB Ram";  */
        
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
		product2.setUnitPrice(10000);
        product2.setDetail("8 GB Ram");
        product2.setDiscount(10);
        
        System.out.println(product2.getUnitPriceAfterDiscount());
		/*product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 10000;
        product2.detail = "8 GB Ram";
        product2.discount = 10;
        product2.unitPriceAfterDiscount = 9000;*/
        
        Product product3 = new Product();
		/*product3.id = 3;
		product3.name = "Hp 5";
		product3.unitPrice = 50000;
        product3.detail = "32 GB Ram";
        product3.discount = 10;
        product3.unitPriceAfterDiscount = 45000;*/
        
		Product[] products = {
				product1,product2,product3
		};
		
		System.out.println(products.length);
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ev, Yaşam");
		
		Category category3 = new Category();
		category3.setId(3);
		category3.setName("Kozmetik");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}

}
