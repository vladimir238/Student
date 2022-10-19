package comparator;

import model.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentSortName implements StudComparator {
    public int compare(Student student1, Student student2) {
        return StringUtils.compare(student1.getFullName(),student2.getFullName());
    }
}
