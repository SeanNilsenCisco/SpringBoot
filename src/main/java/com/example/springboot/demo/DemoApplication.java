package com.example.springboot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    private static final Logger Log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository personRepository) {
        return (args) -> {
           Log.info("------It's Working-------");

//           personRepository.save(new Person("Sean"));
//           personRepository.save(new Person("Adrian"));

            Person p = new Person();
            p.setFirstName("Sean");
            p.setLastName("Nilsen");
            p.setTitle("Lead Shenanigantor");

            personRepository.save(p);

            List<Person> pList = new ArrayList<Person>();

            for(int x = 10; x < 20 ; x++){
                Person per = new Person("PersonList" + x);
                per.setLastName("LastNameList" + x);
                pList.add(per);
            }

            personRepository.saveAll(pList);

//            Person found = personRepository.findById(1).get();
//            Log.info("Found Person: " + found.getLastName() + ", " + found.getFirstName());

            for(Person per : personRepository.findAll()){
                Log.info("Found Person: " + per.getLastName() + ", " + per.getFirstName());
            }

            Log.info("Person with ID 4 exists: " + personRepository.existsById(4));
            Log.info("Person with ID 99 exists: " + personRepository.existsById(99));
            Log.info("Total Person objects: " + personRepository.count());

        };
    }

}
