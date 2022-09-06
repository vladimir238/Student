import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;

public class StudentSortName implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return StringUtils.compare(student1.getFullName(),student2.getFullName());
    }
}
