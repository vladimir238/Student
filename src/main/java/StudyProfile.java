public enum StudyProfile {

    MEDICINE("Медицина"),
    PHYSICS("Физика"),
    LINGUISTICS("Лингвистический");

    private String title;

    StudyProfile(String title) {
        this.title = title;
    }


    public String toString() {
        return title;
    }
}

