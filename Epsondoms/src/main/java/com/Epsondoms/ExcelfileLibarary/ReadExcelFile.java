package com.Epsondoms.ExcelfileLibarary;


	import java.io.FileInputStream;

	import java.io.FileNotFoundException;

	import java.io.FileOutputStream;

	import java.io.IOException;



	import org.apache.poi.EncryptedDocumentException;

	import org.apache.poi.ss.usermodel.Workbook;

	import org.apache.poi.ss.usermodel.WorkbookFactory;



	public class ReadExcelFile {

		

		public static FileInputStream fis=null;
		public static Workbook wb=null;
		public static FileOutputStream fos=null;
		public static void readSingleData(String sheet,int row, int column,int cell) {
			//1.convert physical into java readable file
			try {
				fis=new FileInputStream("./src/test/resources/TesData/EmpDetails.xlsx");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//2.create a workbook using workbook factory
			try {
				wb=WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//3.using workbook Get the Sheet Control
			//4.using sheet get row control
			//5.using row get the cell/column control
			//6.using column get the Cell data
			wb.getSheet("sheet").getRow(row).getCell(column).getStringCellValue();
		}
	public static void readMultileData(int row, int column) {
		//1.convert physical into java readable file
				try {
					fis=new FileInputStream("./src/test/resources/TestData/EmpDetails.xlsx");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//2.create a workbook using workbook factory
				try {
					wb=WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//3.using workbook Get the Sheet Control
				//4.using sheet get row control
				//5.using row get the cell/column control
				//6.using column get the Cell data
				int rowcount=wb.getSheet("Sheetname").getLastRowNum();
				for(int i=1;i<rowcount;i++)
				{
				
				wb.getSheet("Sheetname").getRow(i).getCell(1).getStringCellValue();
				}
		
		
			
		}
	public static void writeData(String sheetname,int row, int cell,String data) {
		//1.convert physical into java readable file
				try {
					fis=new FileInputStream("./src/test/resources/TestData/EmpDetails.xlsx");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//2.create a workbook using workbook factory
				try {
					wb=WorkbookFactory.create(fis);
				} catch (EncryptedDocumentException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//3.using workbook Get the Sheet Control
				//4.using sheet get row control
				//5.using row get the cell/column control
				//6.using col set cell
				wb.getSheet("sheet name we will pass").getRow(0).getCell(0).setCellValue("data we will give");
		//7.convert java readable file into physical file
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream("./src/test/resources/TestData/EmpDetails.xlsx");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//8.write the data
				try {
					wb.write(fos);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//9.close the workbook
				try {
					wb.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		
	}

	}