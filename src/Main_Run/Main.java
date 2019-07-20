package Main_Run;

import IO_File.FileManager;
import Model.ModelManager;
import Model.SinhVien;
import UI.Form_Login;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Form_Login form_Login=new Form_Login();
		form_Login.setVisible(true);
		
		boolean kt=FileManager.DocFileSinhVien("Class17hcb.csv");
		if(ModelManager.DSSV.size()>0) {
			for(SinhVien sv:ModelManager.DSSV) {
				System.out.println(sv.getSTT()+""+sv.getMSSV()+sv.getHoten()+sv.getGioitinh()+sv.getCMND());
			}
		}
	}

}
