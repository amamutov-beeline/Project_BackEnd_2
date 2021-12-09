package StudUni;

public class Student {
    private String fullName, universityId;
    private int currentCourseNumber;
    private float avgExamScore;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    @Override
    public String toString() {
        return  "fullName = '" + fullName + '\'' +
                ", universityId = '" + universityId + '\'' +
                ", currentCourseNumber = " + currentCourseNumber +
                ", avgExamScore = " + avgExamScore;
    }
}
