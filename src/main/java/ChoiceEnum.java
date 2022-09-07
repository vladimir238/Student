import java.util.Comparator;

public class ChoiceEnum {
    public static Comparator<Student> getMyComparator(StudentEnum myEnum) {
        if (myEnum == StudentEnum.SORTNAME) return new StudentSortName();
        else if (myEnum == StudentEnum.SORTAVGEXAMSCORE) return new StudentAvgExamScore();
        else if (myEnum == StudentEnum.SORTCOURSE) return new StudentSortCourseNumber();
        else if (myEnum == StudentEnum.SORTUNIVERCITY) return new StudentSortUnivercityId();
        return null;
    }
}
