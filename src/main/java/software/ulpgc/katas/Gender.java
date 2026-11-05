package software.ulpgc.katas;

public enum Gender {
    Male, Female, Unknown;

    public static Gender from(String s) {
        if (s.isEmpty()) return Unknown;
        return Gender.valueOf(s);
    }
}