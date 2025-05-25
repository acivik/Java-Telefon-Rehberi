package rehbertel;

import java.util.Scanner;

public class RehberDemo {

	public static void main(String[] args) {
		
		Rehber rehber = new Rehber();
		
		int tercih = 0;
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			
			menuGoruntule();
			
			tercih = keyboard.nextInt();
			
            
			if(tercih == 1) {
                System.out.print("\u001B[32m"+"Kişinin Adı: "+ "\u001B[0m");
                keyboard.nextLine();
                String ad = keyboard.nextLine();
                
                System.out.print("\u001B[32m"+"Kişinin Soyadı: "+ "\u001B[0m");
                String soyAd = keyboard.nextLine();
                
                System.out.print("\u001B[32m"+"Kişinin Telefon Numarası: "+ "\u001B[0m");
                String telNo = keyboard.nextLine();
                
				rehber.kayitEkle(ad, soyAd, telNo);
			}
			else if(tercih == 2) {
                if(rehber.telRehber[0] != null){
                    System.out.print("\u001B[32m"+"Kişinin Adı: "+ "\u001B[0m");
                    keyboard.nextLine();
                    String ad = keyboard.nextLine();
                    
                    System.out.print("\u001B[32m"+"Kişinin Soyadı: "+ "\u001B[0m");
                    String soyAd = keyboard.nextLine();
                    
                    rehber.kayitBul(ad, soyAd);
                }else{
                    System.out.println("\u001B[31m"+"Rehberinizde Kayıtlı Kişi Yok!"+"\u001B[0m");
                }
				
			}
			else if(tercih == 3) {
                if(rehber.telRehber[0] != null){
                    System.out.print("\u001B[32m"+"Kişinin Telefon Numarası: "+ "\u001B[0m");
                    keyboard.nextLine();
                    String telNo = keyboard.nextLine();
                    rehber.kayitSil(telNo);
                }else{
                    System.out.println("\u001B[31m"+"Rehberinizde Kayıtlı Kişi Yok!"+"\u001B[0m");
                }
			}			
			else if(tercih == 4) {
                rehber.kayitlariGoruntule();
			}	
			else if(tercih == 5) {
				break;
			}	
			else {
				System.out.println("\u001B[31m"+"Yanlış Seçeneği Tuşladınız!!!"+"\u001B[0m");
			}
			
		}		
		keyboard.close();
	}
	
	public static void menuGoruntule() {
		System.out.println("\u001B[32m"+"\nTelefon Rehberi Seçenekleri:"+"\u001B[0m");
		System.out.println("\u001B[32m"+"1) Kayıt Ekle"+"\u001B[0m");
		System.out.println("\u001B[32m"+"2) Kayıt Bul"+"\u001B[0m");
		System.out.println("\u001B[32m"+"3) Kayıt Sil"+"\u001B[0m");
		System.out.println("\u001B[32m"+"4) Tüm Kayıtları Görüntüle"+"\u001B[0m");
		System.out.println("\u001B[32m"+"5) Çık\n"+"\u001B[0m");
		
		System.out.print("\u001B[33m"+"Tercihinizi giriniz: "+ "\u001B[0m");
	}

}
