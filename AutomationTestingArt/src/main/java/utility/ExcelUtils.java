package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
private static XSSFSheet Sh;
private static XSSFWorkbook Wb;
private static XSSFCell Cell;
private static XSSFRow Row;
static String CellData;
public static void setExcelFile(String Filepath, String SheetName) throws IOException
{
	FileInputStream ExcelFile = new FileInputStream(Filepath);
	Wb=new XSSFWorkbook(ExcelFile);
	Sh=Wb.getSheet(SheetName);
}

public static Object[][] getExcelData() throws Exception
{
	String[][] excelData=null;
	try
	{
		//FileInputStream ExcelFile = new FileInputStream(Filepath);
		//Wb=new XSSFWorkbook(ExcelFile);
		//Sh=Wb.getSheet(SheetName);
		int startRow=1;
		int startCol=1;
		int ci,cj;
		int totalRows = Sh.getLastRowNum();
		System.out.println(totalRows);
		int totalCols=2;
		excelData=new String[totalRows][totalCols];
		
		ci=0;
		for(int i=startRow;i<=totalRows;i++,ci++)
		{
			cj=0;
			for(int j=startCol;i<=totalCols;j++,cj++)
			{
				excelData[ci][cj]=getCellData(i,j);
				System.out.println(excelData[ci][cj]);
			}
		}
	}
	catch(FileNotFoundException e)
	{
		//System.out.println(e.getMessage());
		System.out.println("could not read excel sheet");
	}
	catch(IOException e)
	{
		//System.out.println(e.getMessage());
		System.out.println("could not read excel sheet");
		e.printStackTrace();
	}
	return (excelData);
}
public static String getCellData(int RowNum, int ColNum) throws Exception
{
	
		Cell =Sh.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
	
}
}

