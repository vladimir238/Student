package model;
import enums.StudyProfile;

public class Statistics {
    private StudyProfile mainProfile;
    private float avgExamScore;
    private int amountStudentProfile;
    private int amountUnivercityProfile;
    private String nameUnivercity;

//    public model.Statistics(enums.StudyProfile mainProfile, float avgExamScore, int amountStudentProfile, int amountUnivercityProfile, int nameUnivercity) {
//        this.mainProfile = mainProfile;
//        this.avgExamScore = avgExamScore;
//        this.amountStudentProfile = amountStudentProfile;
//        this.amountUnivercityProfile = amountUnivercityProfile;
//        this.nameUnivercity = nameUnivercity;
//    }
    public Statistics(){

    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public int getAmountStudentProfile() {
        return amountStudentProfile;
    }

    public int getAmountUnivercityProfile() {
        return amountUnivercityProfile;
    }

    public String getNameUnivercity() {
        return nameUnivercity;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public void setAmountStudentProfile(int amountStudentProfile) {
        this.amountStudentProfile = amountStudentProfile;
    }

    public void setAmountUnivercityProfile(int amountUnivercityProfile) {
        this.amountUnivercityProfile = amountUnivercityProfile;
    }

    public void setNameUnivercity(String nameUnivercity) {
        this.nameUnivercity = nameUnivercity;
    }

    @Override
    public String toString() {
        return "model.Statistics{" +
                "mainProfile=" + mainProfile +
                ", avgExamScore=" + avgExamScore +
                ", amountStudentProfile=" + amountStudentProfile +
                ", amountUnivercityProfile=" + amountUnivercityProfile +
                ", nameUnivercity=" + nameUnivercity +
                '}';
    }
}

