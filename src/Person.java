enum Gender {
    MALE,
    FEMALE
}

public class Person {
    private final String name;
    private final String surname;
    private final Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
