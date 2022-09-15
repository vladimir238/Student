import java.util.List;


public class Main {
    private static List<Student> students;
    private static List<University> universities;


    public static void main(String[] args) {
        ExcelIO excelIO = new ExcelIO();
        students = excelIO.addliststudent("src/main/resources/universityInfo.xlsx");
        universities = excelIO.addlistunivercity("src/main/resources/universityInfo.xlsx");
        universities.sort(ChoiceEnum.getMyUnComparator(UnivercityEnum.SORTNAME));
        StudComparator studComparator1 = ChoiceEnum.getMyComparator(StudentEnum.SORTAVGEXAMSCORE);
        System.out.println("Сортировка студентов по среднему баллу");
        students.sort(studComparator1);
        students.forEach(System.out::println);
        System.out.println("Сортировка университетов по названию");
        universities.forEach(System.out::println);
        System.out.println("\n \n  Сортировка студентов по среднему баллу вывод в стриме \n  ");
        students.stream()
                .sorted(studComparator1)
                .forEach(System.out::println);
        System.out.println("\n  Сортировка университетов по году образования вывод в стриме \n");
        universities.stream()
                .sorted(ChoiceEnum.getMyUnComparator(UnivercityEnum.SORTYEAR))
                .forEach(System.out::println);
        System.out.println("Количество элементов в исходной коллекции = " + universities.size());
        String sul = JsonUtil.jsonUnSerialUniversityList(universities);
        List<University> lus1 = JsonUtil.jsonSerialUniversity(sul);
        System.out.println("Количество элементов в востановленой  коллекции = " + lus1.size());

        System.out.println("Проверка возвращенной коллекции");
        System.out.println("Вывод коллекции в печать через стрим");
        lus1.forEach(JsonUtil::jsonUnSerialUniversity);
        lus1.forEach(System.out::println);
        System.out.println("Сериализация-десериализация университетов поэлементно в стриме");
        universities.forEach(universitie -> {
            String universityJson = JsonUtil.jsonUnSerialUniversity(universitie);
            System.out.println(universityJson);
            University universityFromJson = JsonUtil.jsonOneSerialUniversity(universityJson);
            System.out.println(universityFromJson);
        });
        System.out.println("Сериализация-десериализация  студентов поэлемнтно в стриме ");
        students.forEach(student -> {
            String studentJson = JsonUtil.jsonUnSerialStudent(student);
            System.out.println(studentJson);
            Student studentFromJson = JsonUtil.jsonOneSerialStudent(studentJson);
            System.out.println(studentFromJson);
        });

    }


}
