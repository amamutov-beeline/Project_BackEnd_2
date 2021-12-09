package enums;

public enum StudyProfile {
    MEDICINE("Медицина"), IT("ИТ"), TELECOM("Телекоммуникации"),
    PHYSICS("Физика"), LINGUISTICS("Лингвистика"), MATHEMATICS("Математика");
    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
