public enum StudyProfile {

    MEDICINE("Медицина"),
    TECHNOLOGIE("Технология"),
    MANYPROFILE("Многопрофильный"),
    AYTOMATISATION("Автоматизация");
    private String title;

    StudyProfile(String title) {
        this.title = title;
    }


    public String toString() {
        return title;
    }
}

