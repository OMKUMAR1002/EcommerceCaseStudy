package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReader {

    public String getCellData(String sheetName,
                              int row,
                              int column) throws Exception {

        FileInputStream fis =
                new FileInputStream("./TestData/TestData.xlsx");

        DataFormatter formatter = new DataFormatter();

        return formatter.formatCellValue(
                WorkbookFactory.create(fis)
                        .getSheet(sheetName)
                        .getRow(row)
                        .getCell(column));
    }
}