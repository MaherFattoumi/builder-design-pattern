package com.mf.builder.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import com.mf.builder.Person;

public class BuilderDesignPatternPersonTest {

    @Test
    public void testCreatePersonWithBasicInformation() {
        Person person = new Person.Builder()
                .firstName("John")
                .lastName("Doe")
                .build();

        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(0, person.getAge());
        assertNull(person.getEmail());
    }

    @Test
    public void testCreatePersonWithAllInformation() {
        Person person = new Person.Builder()
                .firstName("Jane")
                .lastName("Smith")
                .age(30)
                .email("jane@example.com")
                .build();

        assertEquals("Jane", person.getFirstName());
        assertEquals("Smith", person.getLastName());
        assertEquals(30, person.getAge());
        assertEquals("jane@example.com", person.getEmail());
    }

    @Test
    public void testCreatePersonWithAgeOnly() {
        Person person = new Person.Builder()
                .age(25)
                .build();

        assertNull(person.getFirstName());
        assertNull(person.getLastName());
        assertEquals(25, person.getAge());
        assertNull(person.getEmail());
    }

    @Test
    public void testCreatePersonWithInvalidEmail() {
        Person person = new Person.Builder()
                .firstName("John")
                .lastName("Doe")
                .email("invalid-email")
                .build();

        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(0, person.getAge());
    }
}
