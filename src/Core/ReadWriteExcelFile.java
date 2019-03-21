package Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadWriteExcelFile {

	 /* 
	 * 
	 * @param fileName file name
	 * @param index sheet index
	 * @return sheet as object 
	 * @throws IOException
	 */
	public static HSSFSheet getSheet(String fileName,int index) throws IOException {
		
		InputStream ExcelFileToRead = new FileInputStream(fileName);
		@SuppressWarnings("resource")
		HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);

		HSSFSheet sheet = wb.getSheetAt(index);
		return sheet;
	}
	/**
	 * get number of sheets in file
	 * 
	 * @param fileName file name
	 *  
	 * @return number of sheets
	 * 
	 * @throws IOException
	 */
	public static int getNumberOfSheet(String fileName) throws IOException {
		InputStream ExcelFileToRead = new FileInputStream(fileName);
		@SuppressWarnings("resource")
		HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);

		int nunOfSheets = wb.getNumberOfSheets();
		return nunOfSheets;
	}
	/**
	 * get sheet by name 
	 * 
	 * @param fileName file name 
	 * @param sheetName sheet name 
	 * @return sheet as object 
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public static HSSFSheet getSheet(String fileName,String sheetName) throws IOException {
		InputStream ExcelFileToRead = new FileInputStream(fileName);
		HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
		HSSFSheet sheet=wb.getSheet(sheetName);

		return sheet;
	}
	/**
	 * get sheet data as multi-dimensional array
	 * 
	 * @param fileName file name
	 * @param index sheet index
	 * @return sheet data
	 * @throws IOException
	 */
	public static Object[][] getExcelData(String fileName, int index) throws IOException {
		return getExcelDataBySheet(fileName, getSheet(fileName, index));
	}
	/**
	 * get sheet data as multi-dimensional array
	 * 
	 * @param fileName file name 
	 * @param sheetName sheet name 
	 * @return sheet data
	 * @throws IOException
	 */
	public static Object[][] getExcelData(String fileName, String sheetName) throws IOException {
		return getExcelDataBySheet(fileName, getSheet(fileName, sheetName));
	}
	/**
	 * get sheet data as multi-dimensional array
	 * 
	 * @param fileName file name
	 * @param sheet sheet object
	 * @return sheet data
	 * @throws IOException
	 */
	public static Object[][] getExcelDataBySheet(String fileName, HSSFSheet sheet) throws IOException {
		return getExcelDataBySheet(fileName, sheet,true);
	}
	/**
	 * get sheet data as multi-dimensional array
	 * 
	 * @param fileName file name 
	 * @param index sheet index 
	 * @return sheet data without first row 
	 * @throws IOException
	 */
	public static Object[][] getExcelDataWithoutHeader(String fileName, int index) throws IOException {
		return getExcelDataBySheetWithoutHeader(fileName, getSheet(fileName, index));
	}
	/**
	 * get sheet data as multi-dimensional array
	 * @param fileName file name
	 * @param sheetName sheet name 
	 * @return sheet data without first row
	 * @throws IOException
	 */
	public static Object[][] getExcelDataWithoutHeader(String fileName, String sheetName) throws IOException {
		return getExcelDataBySheetWithoutHeader(fileName, getSheet(fileName, sheetName));
	}
	/**
	 * get sheet data as multi-dimensional array
	 * 
	 * @param fileName file name 
	 * @param sheet sheet object
	 * @return  without first row 
	 * @throws IOException
	 */
	public static Object[][] getExcelDataBySheetWithoutHeader(String fileName, HSSFSheet sheet) throws IOException {
		return getExcelDataBySheet(fileName, sheet,false);
	}
	/**
	 * get sheet data as multi-dimensional array
	 * 
	 * @param fileName file name 
	 * @param sheet sheet object
	 * @param useHeader return first row or not 
	 * @return sheet data 
	 * @throws IOException
	 */
	@SuppressWarnings("rawtypes")
	public static Object[][] getExcelDataBySheet(String fileName, HSSFSheet sheet, boolean useHeader) throws IOException {

		HSSFRow r = sheet.getRow(0);
		int colNum = r.getLastCellNum();
		int rowNum = sheet.getLastRowNum();
		Object[][] excelData= new Object[rowNum+1][colNum]  ;
		Object[][] excelDataNoHeader= new Object[rowNum][colNum]  ;

		HSSFRow row; 
		HSSFCell cell;
		Iterator rows = sheet.rowIterator();
		int i= 0;
		while (rows.hasNext())
		{
			try {
			
			int j=0;

			row=(HSSFRow) rows.next();
			Iterator cells = row.cellIterator();

			while (cells.hasNext())
			{

				cell=(HSSFCell) cells.next();
				if(cell.getCellType()==CellType.NUMERIC) {
					Double d = cell.getNumericCellValue();
					excelData[i][j] = d.intValue();

				}else if(cell.getCellType()==CellType.BOOLEAN) {
					boolean b = cell.getBooleanCellValue();
					excelData[i][j] = b+"";
					System.out.println(excelData[i][j]);
				}else if(cell.getRichStringCellValue().getString().contains("\"")) {
					excelData[i][j] = cell.getRichStringCellValue().toString().replaceAll("\"", "").trim();
				}else {
					excelData[i][j] = cell.getRichStringCellValue().toString().trim();
				}

				if(i!=0) {
					excelDataNoHeader[i-1][j]=excelData[i][j];
				}

				j++;
				if(j>=colNum) {
					break;
				}
			}
			i++;

			}catch(Exception e ) {
				System.out.println("Ex:  Current Record Breaked :  "+e.getMessage());
			}
			
		} // ** while
		
		if(useHeader) {
			return excelData;
		}else {
			return excelDataNoHeader;
		}

	}

	/**
	 * change value in excel file 
	 * @param filePath full file path
	 * @param sheetIndex sheet index
	 * @param column column number
	 * @param row row number
	 * @param newValue new value for the cell
	 */
	public static void editExcelFile(String filePath, int sheetIndex, int column, int row, String newValue) {
		try {
			FileInputStream file = new FileInputStream(new File(filePath));

			@SuppressWarnings("resource")
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(sheetIndex);
			Cell cell = null;
			cell = sheet.getRow(row).getCell(column);
			cell.setCellValue(newValue);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File(filePath));
			workbook.write(outFile);
			outFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void editExcelFile(String filePath, String sheetName, int column, int row, String newValue) {
		try {
			FileInputStream file = new FileInputStream(new File(filePath));

			@SuppressWarnings("resource")
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheet(sheetName);
			Cell cell = null;
			cell = sheet.getRow(row).getCell(column);
			cell.setCellValue(newValue);
			file.close();
			FileOutputStream outFile =new FileOutputStream(new File(filePath));
			workbook.write(outFile);
			outFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
