import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;



class PersonTest {
    Person nusera = new Person("Nusera",
            LocalDate.of(1998, 7, 8),
            Person.Sex.FEMALE,
            "iloveicecream@cake.com");

    @Test
    void getAge() {
        int age = nusera.getAge();

        Assertions.assertEquals(23, age);
    }

    @Test
    void printPerson() {
        nusera.printPerson();
    }
}