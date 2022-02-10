package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void test_customer_id(){
        Customer test_customerId = new Customer();
        int expectedCustomerId = 1;
        test_customerId.setCustomer_id(1);
        int actualCustomerId = test_customerId.getCustomer_id();
        assertEquals(expectedCustomerId, actualCustomerId, "wrong");
    }

    @Test
    public void test_first_name(){
        Customer test_firstName = new Customer();
        String expectedFirstName = "Test";
        test_firstName.setFirst_name("Test");
        String actualFirstName = test_firstName.getFirst_name();
        assertEquals(expectedFirstName, actualFirstName, "wrong");
    }

    @Test
    public void test_last_name(){
        Customer test_lastName = new Customer();
        String expectedLastName = "Test";
        test_lastName.setLast_name("Test");
        String actualLastName = test_lastName.getLast_name();
        assertEquals(expectedLastName, actualLastName, "wrong");
    }
    @Test
    public void test_email(){
        Customer test_email = new Customer();
        String expectedEmail = "Test";
        test_email.setEmail("Test");
        String actualEmail = test_email.getEmail();
        assertEquals(expectedEmail, actualEmail, "wrong");
    }

}
