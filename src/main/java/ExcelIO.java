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


    public static void readstudent(String fileName) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        int a = 0;
        float b = 0f;
        StudyProfile studyProfile=null;


        InputStream inputStream;
        XSSFWorkbook workBook = null;
        try {
            inputStream = new FileInputStream(fileName);
            workBook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> studentList = new ArrayList<>();
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
        List<University> universityList = new ArrayList<>();
        Sheet sheet1 = workBook.getSheet("Университеты");
        System.out.println("Университеты");
        Iterator<Row> it1 = sheet1.iterator();
        it1.next();
        while (it1.hasNext()) {

            Row row = it1.next();
            Iterator<Cell> cells1 = row.iterator();
            int i = 0;
            while (cells1.hasNext()) {
                row.getCell(i);

                Cell cell = cells1.next();


                switch (i) {
                    case 0:

                        s1 = cell.getStringCellValue();

                        break;
                    case 1:
                        s2 = cell.getStringCellValue();

                        break;

                    case 2:
                        s3 = cell.getStringCellValue();

                        break;

                    case 3:
                        double d = cell.getNumericCellValue();
                        a = ((int) d);
                        break;
                    case 4:
                        s4 = cell.getStringCellValue();
                        studyProfile=StudyProfile.valueOf(s4);

                        break;
                    default:
                        System.out.println("Возможна ошибка ");
                        break;
                }
                i++;
            }
            universityList.add(new University(s1, s2, s3,a, studyProfile));
        }
       // printList(universityList);
        for (University w : universityList) {
            System.out.println(w);
        }
    }

    public static void printList( List<Object> rty){
        for (Object w : rty){
            System.out.println(w);
        }

    }
}


