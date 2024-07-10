package pearl.SmartER.Utils;
import pearl.SmartER.Data.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil  {

	public ArrayList <String> excel_arraylist;
	public XSSFWorkbook workbook;
	int sheets;

	public ArrayList<String> getdata(String testcaseName) throws IOException
	{
		excel_arraylist = new ArrayList<String>();

		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//pearl//SmartER//Data//Browser_names.xlsx");		
		  FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//pearl//SmartER//Utils//workbook.xlsx");
		workbook = new XSSFWorkbook(fis);
		
		System.out.println("user directory" + "user.dir");
		System.out.println("FIS" + fis);

		sheets =workbook.getNumberOfSheets(); 
			System.out.println(sheets);
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("sample"))
				
			{
				
				System.out.println("value od i : " + i);
				
				
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				System.out.println("Sheetno. " + sheet);

				Iterator<Row> rows=sheet.rowIterator();
				Row firstrow =rows.next();
				Iterator<Cell>cells =firstrow.cellIterator();
				
				
				//Column name declaration 
				int k=0;
				int column = 0;
				while(cells.hasNext())
				{
					Cell value =cells.next();
					if(value.getStringCellValue().equalsIgnoreCase("Type")) // Testcases
					{
						column=k;

				}
					k++;
				}
				//System.out.println(column);

				//Row Name Declaration
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName))
					{
						Iterator<Cell>cell=r.cellIterator();
						while(cell.hasNext())
						{
							Cell c = cell.next();
							if(c.getCellType()==CellType.STRING)
							{
								//cell.next().getStringCellValue();
								excel_arraylist.add(c.getStringCellValue());
							}
							else{

								excel_arraylist.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}
						}
					}

				}
			}

		}
		return excel_arraylist;
	}

//	public static void main(String[]args) throws IOException
//	{
//		ExcelUtil d=new ExcelUtil();
//		ArrayList<String> question_name=d.getdata("browser");
//		for(String i:question_name)
//		{
//			System.out.println(i);
//		}
//	}
}




