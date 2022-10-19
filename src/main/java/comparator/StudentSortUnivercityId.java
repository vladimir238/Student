package comparator;

import model.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentSortUnivercityId implements StudComparator {
    public int compare(Student student1, Student student2) {
        return StringUtils.compare(student1.getUniversityId(),student2.getUniversityId());
    }
}
