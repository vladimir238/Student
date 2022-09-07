import java.io.IOException;
import java.util.List;

public class Main {
    private static List<Student> students;
    private static List<University> universities;

    public static void main(String[] args) throws IOException {
        ExcelIO excelIO = new ExcelIO();
        students = excelIO.addliststudent("src/main/resources/universityInfo.xlsx");
        universities = excelIO.addlistunivercity("src/main/resources/universityInfo.xlsx");
        universities.sort(ChoiceEnum.getMyUnComparator(UnivercityEnum.SORTNAME));
        students.sort(ChoiceEnum.getMyComparator(StudentEnum.SORTAVGEXAMSCORE));
        System.out.println("Сортировка студентов");
        printListStudent();
        System.out.println("Сортировка университетов по названию");
        printListUnuvercity();
        System.out.println();
        System.out.println(" Сортировка студентов по имени");
        students.stream()
                .sorted(ChoiceEnum.getMyComparator(StudentEnum.SORTNAME))
                .forEach(System.out::println);


    }

    public static void printListStudent() {
        for (Student w : students) {
            System.out.println(w);
        }

    }

    public static void printListUnuvercity() {
        for (Object w : universities) {
            System.out.println(w);
        }
    }
}
