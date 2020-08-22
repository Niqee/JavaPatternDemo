package com.niqz.patterns.creational;

import com.niqz.patterns.creational.builder.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {

    @Test
    public void test() {
        Person person = new Person.Builder()
                .setFirstName("John")
                .setLastName("Brown")
                .setAge(23)
                .setHeight(180.3)
                .setWeight(80.7)
                .build();

        assertEquals(person.getFirstName(), "John");
        assertEquals(person.getLastName(), "Brown");
        assertEquals(person.getAge(), 23);
        assertEquals(person.getHeight(), 180.3);
        assertEquals(person.getWeight(), 80.7);
    }
}
