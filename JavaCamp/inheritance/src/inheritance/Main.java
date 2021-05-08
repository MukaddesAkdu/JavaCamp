package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer mukaddes = new IndividualCustomer();
		mukaddes.id = 1;
		mukaddes.customerNumber = "111";
		mukaddes.firstName = "Mukaddes";
		mukaddes.lastName = "Akdu";
		mukaddes.nationalIdentity = "12345678901";
		
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.id = 2;
		hepsiBurada.customerNumber = "112";
		hepsiBurada.companyName = "Hepsi Burada";
        hepsiBurada.taxNumber = "12345";
        
        SendikaCustomer abc = new SendikaCustomer();
        abc.customerNumber = "123";
        
        CustomerManager customerManager = new CustomerManager();
        /*customerManager.add(hepsiBurada);
        customerManager.add(mukaddes);
        customerManager.add(abc);  */
        
        //polimorfizm
        Customer[] customers = {mukaddes, abc, hepsiBurada};
        customerManager.addMultiple(customers);
	}

}
