import java.util.Comparator;

public class ChoiceEnum {
    public static StudComparator getMyComparator(StudentEnum myEnum) {
        if (myEnum == StudentEnum.SORTNAME) return new StudentSortName();
        else if (myEnum == StudentEnum.SORTAVGEXAMSCORE) return new StudentAvgExamScore();
        else if (myEnum == StudentEnum.SORTCOURSE) return new StudentSortCourseNumber();
        else if (myEnum == StudentEnum.SORTUNIVERCITY) return new StudentSortUnivercityId();
        return null;
    }
    public static Comparator<University> getMyUnComparator(UnivercityEnum myUnEnum){
        if (myUnEnum==UnivercityEnum.SORTNAME) return new UnivercitySortName();
        else if (myUnEnum==UnivercityEnum.SORTID) return new UnivercitySortId();
        else if (myUnEnum==UnivercityEnum.SORTYEAR) return new UnivercitySortEar();
        else if (myUnEnum==UnivercityEnum.STUDYPROFILE) return new UnivercitySortProfile();
       return null;

    }
}
