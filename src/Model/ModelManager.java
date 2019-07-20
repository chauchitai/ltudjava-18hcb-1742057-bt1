package Model;

import java.util.ArrayList;

public class ModelManager {
	public static ArrayList<SinhVien>DSSV=new ArrayList<>();
	public static ArrayList<TaiKhoan>DSTK=new ArrayList<>();
	public static ArrayList<SinhVien> getDSSV() {
		return DSSV;
	}

	public static void setDSSV(ArrayList<SinhVien> dSSV) {
		DSSV = dSSV;
	}
	

}
