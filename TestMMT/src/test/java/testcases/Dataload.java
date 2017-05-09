package testcases;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.*;
//usermodel.XSSFSheet;
//import org.apache.poi.hssf.usermodel.XSSFWorkbook;
public class Dataload {
 public static List <HashMap> data()
 {
 List<HashMap> mydata = null;
 try
 {
 FileInputStream fs = new FileInputStream("classpath:TestData-seleniumframework.xls");
 HSSFWorkbook workbook = new HSSFWorkbook(fs);
 HSSFSheet sheet = workbook.getSheet("SignInSignOut");
 Row HeaderRow = sheet.getRow(0);
 for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
 {
 Row currentRow = sheet.getRow(i);
 HashMap currentHash = new HashMap();
 for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
 {
 Cell currentCell = currentRow.getCell(j);
 switch (currentCell.getCellType())
 {
 case Cell.CELL_TYPE_STRING:
 System.out.print(currentCell.getStringCellValue() + "\t");
 
 currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
 break;
 }
 }
 mydata.add(currentHash);
 }
 
 fs.close();
 }
 catch (Exception e)
 {
 e.printStackTrace();
 }
 return mydata;
 }
}