
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoA {
	public static void main(String[] args) throws Exception {
		 Workbook w = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		  String v = w.getSheet("sheet1").getRow(0).getCell(0).toString();
		 System.out.println(v);	
	}

}
