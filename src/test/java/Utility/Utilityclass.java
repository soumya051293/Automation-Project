package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Utilityclass {
	public static String getCellValue(String xl, String Sheet,int r,int c) 
	{	
		
		try {
			File  f=new File(xl);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb= new XSSFWorkbook(fi);
			XSSFCell cell=(XSSFCell)wb.getSheet(Sheet).getRow(r).getCell(c);
			
			
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
		    }
			else
			{
			return cell.getRawValue();//sendkeys only support string values	
			}
		}
		catch(Exception e)
		{
			return"";
      	}
	}

	public static int getRowCount(String xl,String Sheet)
	{ 
			try
		{
			File  f=new File(xl);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb= new XSSFWorkbook(fi);
			return wb.getSheet(Sheet).getLastRowNum();
		}
		
		catch(Exception e) 
		{
			return 0;
		}
		
	
	}
	
	}


