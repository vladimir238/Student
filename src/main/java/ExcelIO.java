import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelIO {
    Student student;


    public static void parse(String fileName) {
        String s1 = "";
        String s2 = "";
        int a = 0;
        float b = 0f;

        List<Student> studentList = new ArrayList<>();
        InputStream inputStream = null;
        XSSFWorkbook workBook = null;
        try {
            inputStream = new FileInputStream(fileName);
            workBook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = workBook.getSheet("Студенты");
        Iterator<Row> it = sheet.iterator();
        it.next();
        while (it.hasNext()) {

            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            int i = 0;
            while (cells.hasNext()) {
                row.getCell(i);

                Cell cell = cells.next();


                switch (i) {
                    case 0:

                        s1 = cell.getStringCellValue();

                        break;
                    case 1:
                        s2 = cell.getStringCellValue();

                        break;

                    case 2:
                        double d = cell.getNumericCellValue();
                        a = ((int) d);
                        break;
                    case 3:
                        double f = cell.getNumericCellValue();
                        b = ((float) f);
                        break;
                    default:
                        System.out.println("Возможна ошибка ");
                        break;
                }
                i++;
            }
            studentList.add(new Student(s2, s1, a, b));
        }
        for (Student w : studentList) {
            System.out.println(w);
        }
    }

}


