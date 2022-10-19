package comparator;

import model.University;
import enums.StudyProfile;
import model.Student;
import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;

public class UnivercitySortProfile implements Comparator<University> {
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getMainProfile().toString(), university2.getMainProfile().toString());
    }
}
