package Model;

public class CaiThien {
	public int STT ;
	public String MSSV,Hoten,Gioitinh,CMND;
	public int getSTT() {
		return STT;
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
	public String getGioitinh() {
		return Gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		Gioitinh = gioitinh;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public void setSTT(int sTT) {
		STT = sTT;
	}
	public CaiThien(int sTT, String mSSV, String hoten, String gioitinh, String cMND) {
		super();
		STT = sTT;
		MSSV = mSSV;
		Hoten = hoten;
		Gioitinh = gioitinh;
		CMND = cMND;
	}
	

}
