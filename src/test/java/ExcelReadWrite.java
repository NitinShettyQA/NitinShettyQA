import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadWrite {
	String path;
	FileInputStream io;
	XSSFWorkbook book;
	XSSFSheet sheet;
	FileOutputStream fo;

	@Test
	public void excelOperations() throws IOException
	{
		try {
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelOperations.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			XSSFSheet  sheet=workbook.getSheet("Sheet1"); 
			
			int totalRows=sheet.getLastRowNum();
			
			int totalCells=sheet.getRow(0).getLastCellNum();
			
			System.out.println("number of rows:"+ totalRows); //5
			System.out.println("number of cells:"+ totalCells);  //4
			
			for(int r=0;r<=totalRows;r++)
			{
				XSSFRow currentRow=sheet.getRow(r);
							
				for(int c=0;c<totalCells;c++)
				{
					XSSFCell cell=currentRow.getCell(c);
					System.out.print(cell.toString()+"\t");
					
				}
				System.out.println();
			}
			//Added this line to practice git merger between main and branch in local
			workbook.close();
			file.close();
	   
			
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	
	}
}
