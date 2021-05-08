package inheritance2;

public class CustomerManager {
     public void add(Logger logger) {     //Logger logger, aslında bir referans tutucudur.
    	 //müşteri ekleme kodları
    	 System.out.println("Müşteri eklendi.");
    	 //müşteriyi ekledikten sonra loglayadabilmek istiyorum
    	 //DatabaseLogger logger = new DatabaseLogger();
    	 logger.log();
     }     
}
