import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;
public class UnivercitySortName implements Comparator<University>{

    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getFullName(),university2.getFullName());
    }
}

