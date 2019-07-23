package IO_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import Model.ModelManager;
import Model.SinhVien;
import Model.TaiKhoan;

public class FileManager {

	public static boolean DocFileSinhVien(String path) {
		if(ModelManager.DSSV.size()>0) {
			ModelManager.DSSV=new ArrayList<>();
		}
		int count=0;
		try {
			FileInputStream fileInputStream=new FileInputStream(path);
			InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");
			BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
			String line=bufferedReader.readLine();
			while(line!=null) {
				count ++;
				if(count>=2) {
					String []arr=line.split(",");
					if(arr.length>0) {
	                    int stt=Integer.parseInt(arr[0]);
						SinhVien sv=new SinhVien(stt, arr[1], arr[2], arr[3], arr[4]);
						ModelManager.DSSV.add(sv);
					}
				}
				
				line=bufferedReader.readLine();
			}
			return true;
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static boolean GhiFileSinhVien(String path){
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(path);
			OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream, "UTF-8");
			BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
			String line="STT,MSSV,Hoten,GioiTinh,CMND"+"\n";
			bufferedWriter.write(line);
			for(SinhVien sv:ModelManager.DSSV){
				System.out.println(sv.Hoten);
				line=sv.getSTT()+","+sv.getMSSV()+","+sv.getHoten()+","+sv.getGioitinh()+","+sv.getCMND()+"\n";
				bufferedWriter.write(line);
			}
			bufferedWriter.close();
			outputStreamWriter.close();
			fileOutputStream.close();
			
			
			return true;
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		return false;
	}
	
	public static boolean DocFileTaiKhoan(String path) {
		if(ModelManager.DSTK.size()>0) {
			ModelManager.DSTK=new ArrayList<>();
		}
		int count=0;
		try {
			FileInputStream fileInputStream=new FileInputStream(path);
			InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");
			BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
			String line=bufferedReader.readLine();
			while(line!=null) {
				count ++;
				if(count>=2) {
					String []arr=line.split(",");
					if(arr.length>0) {
	                    int type=Integer.parseInt(arr[2]);
						TaiKhoan tk=new TaiKhoan(arr[0], arr[1], type);
						ModelManager.DSTK.add(tk);
					}
				}
				
				line=bufferedReader.readLine();
			}
			return true;
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
