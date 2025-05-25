package rehbertel;

public class Rehber {
	
	final Kayit[] telRehber = new Kayit[100];
	private static int kayitSayisi=0;
	public String ad,soyAd,telNo;
    int sayac = 0;
    boolean tst = false;

	public void kayitEkle(String ad, String soyAd, String telNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.telNo = telNo;
        if(telRehber[99] == null){
            //Son eleman null ise rehberde boş yer var demektir. Kayıt yapılabilir.
            //Son eleman null değilse rehber dolmuştur. Kayıt yapılamaz.
            telRehber[kayitSayisi] = new Kayit(this.ad,this.soyAd,this.telNo);
            kayitSayisi++;
            System.out.println("\u001B[32m"+"\n\tBaşarıyla Kaydedildi! :))"+ "\u001B[0m");
        }else{
            System.out.println("\u001B[31m"+"Rehberiniz Dolu! Yeni Kişi Ekleyemezsiniz."+"\u001B[0m");
        }
	}

	public void kayitBul(String ad, String soyAd) {
        this.ad = ad;
        this.soyAd = soyAd;
        for(int i=0;i<telRehber.length;i++){
            if(telRehber[i]==null){
                System.out.println("\u001B[31m"+"\nKayıt Bulunamadı!"+"\u001B[0m");
                break;
            }
            //Parametreler rehberdeki değerler ile kıyaslanır. Doğru eşleşme varsa yazılır.
            if(telRehber[i].getAd().equals(this.ad)&&telRehber[i].getSoyAd().equals(this.soyAd)){
                System.out.println("\n\tKişinin Adı: "+telRehber[i].getAd()+"\n\tKişinin Soyadı: "+telRehber[i].getSoyAd()+"\n\tKişinin Numarası: "+telRehber[i].getTelNo());
                break;
            }
        }
		
	}

	public void kayitSil(String telNo) {
        int i = 0;
        for(i=0;i<kayitSayisi;i++){
            //Parametre ile eşleşen numara varsa null değeri atanır Ve kişiler kaydırılır.
            //Tüm değerler denenmiş ve kişi bulunamamışsa tst(boolean) değişkeni sayesinde tespit edilir.
             
            if(telRehber[i].getTelNo().equals(telNo)){
                System.out.println("\u001B[31m"+"\nSilinecek Kişinin Bilgileri:"+"\n\tKişinin Adı: "+telRehber[i].getAd()+"\n\tKişinin Soyadı: "+telRehber[i].getSoyAd()+"\n\tKişinin Numarası: "+telRehber[i].getTelNo()+ "\u001B[0m");
                telRehber[i] = null;
                
                for (int j = i; j < kayitSayisi - 1; j++) {
                    telRehber[j] = telRehber[j + 1];
                }
    
                telRehber[kayitSayisi - 1] = null;
                kayitSayisi--;
                tst = true;
                break;

            }else{
                tst = false;
            }
        }

        if(tst==false){
            System.out.println("\u001B[31m"+"\nKişi Bulunamadı!"+"\u001B[0m");
        }
    }
	
	public void kayitlariGoruntule() {
        // dizideki kayıtlı kişileri yazdırır.
        if(kayitSayisi > 0){
            for(int i=0;i<telRehber.length;i++){
                if(telRehber[i]==null){
                    continue;
                }else{
                    System.out.println("\n\tKişinin Adı: "+telRehber[i].getAd()+"\n\tKişinin Soyadı: "+telRehber[i].getSoyAd()+"\n\tKişinin Numarası: "+telRehber[i].getTelNo()+ "\u001B[0m");
                }
            }
        }else{
            System.out.println("\u001B[31m"+"\nRehberinizde Kayıtlı Kişi Yok!"+"\u001B[0m");
        }
    }	
}
