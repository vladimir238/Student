import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {
    private static List<Student> students;
    private static List<University> universities;

    public static void main(String[] args) throws IOException {
        ExcelIO excelIO=new ExcelIO();
        students=excelIO.addliststudent("src/main/resources/universityInfo.xlsx");
        universities=excelIO.addlistunivercity("src/main/resources/universityInfo.xlsx");
        Collections.sort(students, new StudentSortName());
        printListStudent();
        Collections.sort(universities, new UnivercitySortName());
        printListUnuvercity();
        Collections.sort(students, new StudentAvgExamScore());
        printListStudent();





   }
   public static void printListStudent(){
       for (Student w : students) {
           System.out.println(w);
       }
   }
    public static void printListUnuvercity(){
        for (Object w : universities) {
            System.out.println(w);
        }
    }
}
