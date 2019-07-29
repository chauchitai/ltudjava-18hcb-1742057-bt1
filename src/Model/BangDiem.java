package Model;

public class BangDiem {
	public int STT;
	public String MSSV,Hoten;
	public int DiemGK,DiemCK,Diemkhac,Tong ;
	public int getSTT() {
		return STT;
	}
	public int getDiemGK() {
		return DiemGK;
	}
	public void setDiemGK(int diemGK) {
		DiemGK = diemGK;
	}
	public int getDiemCK() {
		return DiemCK;
	}
	public void setDiemCK(int diemCK) {
		DiemCK = diemCK;
	}
	public int getDiemkhac() {
		return Diemkhac;
	}
	public void setDiemkhac(int diemkhac) {
		Diemkhac = diemkhac;
	}
	public int getTong() {
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
	public BangDiem(int sTT, int diemGK, int diemCK, int diemkhac, int tong, String mSSV, String hoten) {
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
