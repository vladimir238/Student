import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.*;

import static java.util.Collections.*;

public class Main {
    private static List<Student> students;
    private static List<University> universities;

    public static void main(String[] args) throws IOException {
        ExcelIO excelIO=new ExcelIO();
        students=excelIO.addliststudent("src/main/resources/universityInfo.xlsx");
        universities=excelIO.addlistunivercity("src/main/resources/universityInfo.xlsx");

        students.sort(ChoiceEnum.getMyComparator(StudentEnum.SORTAVGEXAMSCORE));

        printListStudent();

        System.out.println();
        System.out.println(" Сортировка по имени");
        students.stream()
                .sorted(ChoiceEnum.getMyComparator(StudentEnum.SORTNAME))
                .forEach(System.out::println);







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
