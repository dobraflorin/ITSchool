package ro.itschool.practice.session16.practice;

public enum GenderEnum {

    MALE("Male"),
    FEMALE("Female"),
    NO_GENDER("No gender");

    private final String genderValue;

    GenderEnum(String genderValue) {
        this.genderValue = genderValue;
    }

    public static String getGenderValueIgnoreCase(String genderValue) {
        return switch (genderValue.toLowerCase()) {
            case "male" -> MALE.genderValue;
            case "female" -> FEMALE.genderValue;
            default -> NO_GENDER.genderValue;
        };
    }
}