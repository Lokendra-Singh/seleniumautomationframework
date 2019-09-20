package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	    public String[] readExcel(String filePath,String fileName,String sheetName) throws IOException{
	    //Create a object of File class to open xlsx file
	    File file =    new File(filePath+"\\"+fileName);
	    //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook Workbook = null;
	    //Find the file extension by spliting file name in substring and getting only extension name
	    //String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    Workbook = new XSSFWorkbook(inputStream);
	    Sheet Sheet = Workbook.getSheet(sheetName);
	    //Find number of rows in excel file
	    int rowCount = Sheet.getLastRowNum()-Sheet.getFirstRowNum();
	    //Create a loop over all the rows of excel file to read it
	    int ci = 0;
	    int cj = 0;
	    String exldata = "";
	    String[][] tabArray = null;		
	    for (int i = 1; i < rowCount+1; i++) {
	        Row row = Sheet.getRow(i);
	        //Create a loop to print cell values in a row
	        for (int j = 0; j < row.getLastCellNum(); j++) {
	            //Print excel data in console
	            //System.out.print(row.getCell(j).getStringCellValue()+" - ");
	            exldata = exldata + row.getCell(j).getStringCellValue()+"-";
	        }
	        System.out.println();
	    }   
	    System.out.println("Excel data After Reading . . ." + exldata);
	    String[]texldata = exldata.split("-");
	    for(int a=0; a<texldata.length;a++){
	    System.out.println(texldata[a]+ "\n"); }
	    
	    return texldata;
}

	    

	    //Main function is calling readExcel function to read data from excel file
	    public static void main(String...strings) throws IOException{
	    //Create a object of ReadExcel class
	    ReadExcel obj = new ReadExcel();
	    //Prepare the path of excel file
	    String filePath = "C:\\work\\Basic_Selenium\\DDF\\src\\testdata";
	    //Call read file method of the class to read data
	    String[] a= obj.readExcel(filePath,"testdata.xlsx","MySheet");
	    HashMap<String, String> hinput =new   HashMap<String, String>();
	    
	   for(int i=0; i<a.length;i+=3){
	    hinput.put("TestCase", a[i]);
	    hinput.put("UserName", a[i+1]);
	    hinput.put("Password", a[i+2]);
	   }
	   System.out.println(hinput);
	    }

	
}
