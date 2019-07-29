package Model;

public class ThoiKhoaBieu {
	public int STT ;
	public String MaMon,Ten,Phong;
	
	public String getMaMon() {
		return MaMon;
	}

	public void setMaMon(String maMon) {
		MaMon = maMon;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public String getPhong() {
		return Phong;
	}

	public void setPhong(String phong) {
		Phong = phong;
	}

	public void setSTT(int sTT) {
		STT = sTT;
	}

	int getSTT() {
		return STT;
	}

	public ThoiKhoaBieu(int sTT, String maMon, String ten, String phong) {
		super();
		STT = sTT;
		MaMon = maMon;
		Ten = ten;
		Phong = phong;
	}

	public ThoiKhoaBieu() {
		super();
	}
	
}
