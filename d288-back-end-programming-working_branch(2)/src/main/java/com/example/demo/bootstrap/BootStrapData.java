package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer john = new Customer();
        john.setFirstName("John");
        john.setLastName("Smith");
        john.setAddress("123 Test Street");
        john.setPhone("123-456-7890");
        john.setPostal_code("12345");
        john.setDivision(divisionRepository.getReferenceById(2L));

        customerRepository.save(john);

        Customer mark = new Customer();
        mark.setFirstName("Mark");
        mark.setLastName("Jones");
        mark.setAddress("456 Test Street");
        mark.setPhone("123-456-8163");
        mark.setPostal_code("54168");
        mark.setDivision(divisionRepository.getReferenceById(3L));

        customerRepository.save(mark);

        Customer bill = new Customer();
        bill.setFirstName("Bill");
        bill.setLastName("William");
        bill.setAddress("789 Test Street");
        bill.setPhone("123-456-4862");
        bill.setPostal_code("12457");
        bill.setDivision(divisionRepository.getReferenceById(4L));

        customerRepository.save(bill);

        Customer jim = new Customer();
        jim.setFirstName("Jim");
        jim.setLastName("Johnson");
        jim.setAddress("756 Test Street");
        jim.setPhone("123-456-4796");
        jim.setPostal_code("12648");
        jim.setDivision(divisionRepository.getReferenceById(5L));

        customerRepository.save(jim);

        Customer jeff = new Customer();
        jeff.setFirstName("Jeff");
        jeff.setLastName("Martin");
        jeff.setAddress("321 Test Street");
        jeff.setPhone("123-456-9870");
        jeff.setPostal_code("54321");
        jeff.setDivision(divisionRepository.getReferenceById(6L));

        customerRepository.save(jeff);
    }
}
