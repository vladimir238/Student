import java.util.Comparator;

public class StudentAvgExamScore  implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return Float.compare(student2.getAvgExamScore(),student1.getAvgExamScore());
    }
}
