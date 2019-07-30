package Model;

public class BangDiem {
	public int STT;
	public String MSSV,Hoten;
	public float DiemGK,DiemCK,Diemkhac,Tong ;
	public int getSTT() {
		return STT;
	}
	public float getDiemGK() {
		return DiemGK;
	}
	public void setDiemGK(int diemGK) {
		DiemGK = diemGK;
	}
	public float getDiemCK() {
		return DiemCK;
	}
	public void setDiemCK(int diemCK) {
		DiemCK = diemCK;
	}
	public float getDiemkhac() {
		return Diemkhac;
	}
	public void setDiemkhac(int diemkhac) {
		Diemkhac = diemkhac;
	}
	public float getTong() {
		return Tong;
	}
	public void setTong(int tong) {
		Tong = tong;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public void setSTT(int sTT) {
		STT = sTT;
	}
	public BangDiem(int sTT, float diemGK, float diemCK, float diemkhac, float tong, String mSSV, String hoten) {
		super();
		STT = sTT;
		DiemGK = diemGK;
		DiemCK = diemCK;
		Diemkhac = diemkhac;
		Tong = tong;
		MSSV = mSSV;
		Hoten = hoten;
	}
	public BangDiem() {
		super();
	}
	
}
