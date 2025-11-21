package Com.amazon.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {

	public static void main(String[] args) throws Throwable {

		FileInputStream excel=new FileInputStream("C:\\Users\\SINGAM\\Downloads\\FLIPKART\\FLIPKART\\testdata\\userdata.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(excel);
		XSSFSheet sheet= book.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell value=row.getCell(2);
		String data=value.getStringCellValue();
		//	System.out.println(value);
		System.out.println(data);

		int  rows=sheet.getLastRowNum();
		System.out.println(rows);
		int cells=row.getLastCellNum();
		System.out.println(cells);
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=cells;j++)
			{
				row=sheet.getRow(i);
				value=row.getCell(j);
				data=value.getStringCellValue();
				System.out.println(data);
			}
		}




	}

}
