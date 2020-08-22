package com.niqz.patterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private double height;
    private Set<Person> children;

    public static class Builder {
        private final Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder setFirstName(String firstName) {
            newPerson.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            newPerson.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder setWeight(double weight) {
            newPerson.weight = weight;
            return this;
        }

        public Builder setHeight(double height) {
            newPerson.height = height;
            return this;
        }

        public Builder addChild(Person p) {
            newPerson.children.add(p);
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}
