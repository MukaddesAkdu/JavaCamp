package intro;

public class Main {

	public static void main(String[] args) {
		
		
        String internetSubeButonu = "İnternet Şubesi";
        double dolarDun = 8.15;
        double dolarBugun = 8.18;
        //int vade = 36;
        //boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düştü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}else {
			System.out.println("Dolar eşittir resmi");
		}
		
		String[] krediler = 
			{
					"Hızlı Kredi",
					"Mutlu Emekli Kredisi",
					"Konut Kredisi",
					"Çiftçi Kredisi",
					"MSB Kredisi"
			};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		//sayaç güdümlü döngü
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[0]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);
		
		
		
	}

}
