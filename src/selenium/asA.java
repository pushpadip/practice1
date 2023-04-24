package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class asA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream exel = new FileInputStream("C:/Users/Dell/Desktop/new folder/asad.xlsx");
		
		Sheet b  = WorkbookFactory.create(exel).getSheet("Sheet1");
		
		int rowno = b.getPhysicalNumberOfRows();
		
		System.out.println(rowno);
		
		for (int i=0; i<rowno; i++) 
		{
			int cellno = b.getRow(i).getPhysicalNumberOfCells();


			for (int j=0; j<cellno; j++)
			{
				String ss = b.getRow(i).getCell(j).getStringCellValue();
				System.out.print(ss + " ");
			}
			System.out.println();
		}
		
	}

}
