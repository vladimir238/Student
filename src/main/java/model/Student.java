package model;

import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
    @SerializedName("Имя студента")
    private String fullName;
    @SerializedName("ID университета")
    private String universityId;
    @SerializedName("Номер курса")
    private int currentCourseNumber;
    @SerializedName("Средний балл")
    private float avgExamScore;

    public Student(String fullName, String universityId, int currentCourseNumber, float avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public Student() {

    }

    public String getFullName() {
        return fullName;
    }

    @XmlElement(name="Name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    @XmlElement(name = "Id")
    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    @XmlElement(name = "Course")
    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    @XmlElement(name = "Avg")
    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "Ф.И.О  =" + fullName + '\'' +
                ", ID университета = " + universityId + '\'' +
                ", Номер курса =" + currentCourseNumber +
                ", Средний бал =" + avgExamScore +
                '}';
    }
}
