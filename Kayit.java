package rehbertel;

public class Kayit {
	
	private String ad;
	private String soyAd;
	private String telNo;

	public Kayit(String ad, String soyAd, String telNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.telNo = telNo;
		
	}
	
	public String getAd() {
		return this.ad;
		
	}
	
	public String getSoyAd() {
		return this.soyAd;
		
	}

	public String getTelNo() {
		return telNo;
	}

	public void setAd(String ad) {
		this.ad=ad;
		
	}
	
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
		
	}
}
