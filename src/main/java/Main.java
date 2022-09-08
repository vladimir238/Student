import java.util.List;


public class Main {
    private static List<Student> students;
    private static List<University> universities;

    public static void main(String[] args) {
        ExcelIO excelIO = new ExcelIO();
        students = excelIO.addliststudent("src/main/resources/universityInfo.xlsx");
        universities = excelIO.addlistunivercity("src/main/resources/universityInfo.xlsx");
        universities.sort(ChoiceEnum.getMyUnComparator(UnivercityEnum.SORTNAME));
        StudComparator studComparator1=ChoiceEnum.getMyComparator(StudentEnum.SORTAVGEXAMSCORE);
        System.out.println("Сортировка студентов по среднему баллу");
        students.sort(studComparator1);
        printListStudent();
        System.out.println("Сортировка университетов по названию");
        printListUnuvercity();
        System.out.println("\n \n  Сортировка студентов по среднему баллу вывод в стриме \n  ");
        students.stream()
                .sorted(studComparator1)
                .forEach(System.out::println);
        System.out.println("\n  Сортировка университетов по году образования вывод в стриме \n");
        universities.stream()
                .sorted(ChoiceEnum.getMyUnComparator(UnivercityEnum.SORTYEAR))
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
