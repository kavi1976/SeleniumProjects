package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
public class ExcelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	File src=new File("C:\\Kavitha\\TestSelenium.xlsx");
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh1= wb.getSheetAt(0);
	
	System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
	//System.out.print(sh1.getRow(0).getCell(1).getRawValue());
	System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
	System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
	System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
	System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
	
	sh1.getRow(1).createCell(2).setCellValue("Passed");
	sh1.getRow(2).createCell(2).setCellValue("Passed");
	sh1.getRow(3).createCell(2).setCellValue("Passed");
	
	FileOutputStream fout = new FileOutputStream(new File("C:\\Kavitha\\TestSelenium.xlsx"));
			wb.write(fout);
	fout.close();
}
catch (Exception e)
{
	System.out.println(e.getMessage());
}
	}

}
