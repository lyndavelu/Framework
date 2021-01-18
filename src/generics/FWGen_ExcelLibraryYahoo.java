package generics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FWGen_ExcelLibraryYahoo implements FWGen_AutoConstantYahoo
{
	//Non static method so it can be used outside of ExcelLibrary class i.e. in SampleFrameworkPage by using the classname i.e.ExcelLibrary
	public static String getcellvalue(String path, String sheet, int row, int cell) throws IOException 
	{
		FileInputStream fis=new FileInputStream(excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue; //returns the value to the application
	}
}
