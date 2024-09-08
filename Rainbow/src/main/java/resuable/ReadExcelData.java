package resuable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelData {
    public static String getExcelData(String sheetName, int rowIndex, int columnindex) throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/testdata/testdatasheet.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        String data= sheet.getRow(rowIndex).getCell(columnindex).getStringCellValue();
        return data;
    }
}
