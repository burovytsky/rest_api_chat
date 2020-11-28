package com.burovytsky.rest_api_chat.service;

import com.burovytsky.rest_api_chat.model.Person;
import com.burovytsky.rest_api_chat.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person savePerson(Person person) {
       return personRepository.save(person);
    }

    public void delete(int id) {
        personRepository.delete(findById(id).get());
    }

    public Optional<Person> findById(int id) {
        return personRepository.findById(id);
    }

    public Collection<Person> findAll(){
        return StreamSupport.stream(personRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
