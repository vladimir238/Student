import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;

public class StudentSortCourseNumber implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getCurrentCourseNumber(),student2.getCurrentCourseNumber());
    }
}
