package testidea;

import java.io.IOException;
import java.util.ArrayList;

import excel.DataDriven;


public class AccessExcelOrg {

	public static void main(String[] args) throws IOException {
//		DataDrivenDepartment d = new DataDrivenDepartment();
		DataDriven d = new DataDriven();
		ArrayList<String> data=d.getdata("Login");
		System.out.println(data.get(1));
	

		ArrayList<String> data2=d.getdata("GatewaySetting");
		System.out.println(data2.get(7));
		ArrayList<String> data1=d.getdata("Departmentdetails");
		System.out.println(data1.get(5));
		
		
		
		
		
		
		
	}

}
