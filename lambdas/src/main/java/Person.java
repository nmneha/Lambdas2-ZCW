import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoUnit.YEARS;

public class Person {
    String name;
    public LocalDate birthday;
    Sex gender;
    String emailAddress;

    public enum Sex {
        MALE, FEMALE
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        LocalDate current = LocalDate.now();
        return Period.between(birthday, current).getYears();
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void printPerson() {
        System.out.println("Name: " + this.name +
                "\nAge: " + this.getAge() +
                "\nGender: " + this.gender +
                "\nEmail: " + this.emailAddress);
    }

}
