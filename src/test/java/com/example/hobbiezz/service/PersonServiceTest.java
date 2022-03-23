package com.example.hobbiezz.service;

import com.example.hobbiezz.dto.PersonRequest;
import com.example.hobbiezz.dto.PersonResponse;
import com.example.hobbiezz.entity.Person;
import com.example.hobbiezz.repository.PersonRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

/*
@DataJpaTest
class PersonServiceTest {
    @Autowired
    PersonRepository personRepository;

    PersonService personService;

    static int person1Id, person2Id;

    @BeforeAll
    static void setup(@Autowired PersonRepository personRepository) {
        personRepository.deleteAll();
        person1Id = personRepository.save(new Person("Isabel@mail.dk", "Isabel", "Isabelsen", "911")).getId();
        person2Id = personRepository.save(new Person("Andrea@mail.dk", "Andrea", "Andreasen", "88888888")).getId();
    }


    @BeforeEach
    public void setupService() {
        personService = new PersonService(personRepository);
    }

    //Virker 22/3
    @Test
    void addPerson() throws Exception {
        PersonRequest pr1 = new PersonRequest("Isabel@mail.dk", "aa", "aa", "aa");
        PersonRequest pr2 = new PersonRequest("Unik@mail.dk", "aa", "aa", "aa");

        //Tests whether the correct exception is thrown when the email is not unique

        Exception exception = assertThrows(Exception.class, () -> {
            personService.addPerson(pr1);
        });

        String expectedMessage = "Provided email is taken";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));


        //Tester om metoden virker med en unik email
        PersonResponse PRes = personService.addPerson(pr2);
        assertEquals("Unik@mail.dk", PRes.getEmail());
        assertNotEquals("Isabel@mail.dk", PRes.getEmail());

    }

    //Virker 23/3
    @Test
    void testGetPeople() {
        List<PersonResponse> people = personService.getPeople();
        assertEquals(2, people.size());
        assertInstanceOf(PersonResponse.class, people.get(0));
        assertEquals("Isabel@mail.dk", people.get(0).getEmail());
        assertNotEquals("Isabel@mail.dk", people.get(1).getEmail());
        assertThat(people, containsInAnyOrder(hasProperty("email", is("Isabel@mail.dk")),
                hasProperty("email", is("Andrea@mail.dk"))));
    }


    //Virker 22/3
    @Test
    void testGetPerson() throws Exception {
        PersonResponse testPerson = personService.getPerson(1);
        assertEquals("Isabel@mail.dk", testPerson.getEmail());
        assertNotEquals("Andrea@mail.dk", testPerson.getEmail());
    }


    //Virker 22/3
    @Test
    void testUpdatePerson() throws Exception {
        //Ændret person
        PersonRequest updatedPersonRequest= new PersonRequest
                ("ændret@mail.dk", "ændret", "ændret", "ændret");

        //Metoden kaldes
        personService.updatePerson(updatedPersonRequest, 1);


        assertEquals("ændret@mail.dk", personService.getPerson(1).getEmail());
        assertNotEquals("Isabel@mail.dk", personService.getPerson(1).getEmail());



    }


    //Virker 23/3
    @Test
    void testDeletePerson() throws Exception {
        List<PersonResponse> people = personService.getPeople();
        assertEquals(2, people.size());
        personService.deletePerson(1);

        people = personService.getPeople();
        assertEquals(1, people.size());

    }

}
*/