package Model;

import java.util.ArrayList;

public class ModelManager {
	public static ArrayList<SinhVien>DSSV=new ArrayList<>();
	public static ArrayList<TaiKhoan>DSTK=new ArrayList<>();
	public static ArrayList<ThoiKhoaBieu>TKB=new ArrayList<>();
	public static ArrayList<BangDiem>BD=new ArrayList<>();
	public static ArrayList<SinhVien> getDSSV() {
		return DSSV;
	}

	public static void setDSSV(ArrayList<SinhVien> dSSV) {
		DSSV = dSSV;
	}
	
	public static ArrayList<ThoiKhoaBieu> getTKB() {
		return TKB;
	}

	public static void setTKB(ArrayList<ThoiKhoaBieu> dTKB) {
		TKB = dTKB;
	}
	public static ArrayList<BangDiem> getBD() {
		return BD;
	}
	public static void setBD(ArrayList<BangDiem> dBD) {
		BD = dBD;
	}

}
