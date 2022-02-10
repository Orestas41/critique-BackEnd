package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.Actor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {

    @Test
    public void test_review_id(){
        Actor test_actorId = new Actor();
        int expectedActorId = 1;
        test_actorId.setActor_id(1);
        int actualActorId = test_actorId.getActor_id();
        assertEquals(expectedActorId, actualActorId, "wrong");
    }

    @Test
    public void test_first_name(){
        Actor test_FirstName = new Actor();
        String expectedFirstName = "Test";
        test_FirstName.setFirst_name("Test");
        String actualFirstName = test_FirstName.getFirst_name();
        assertEquals(expectedFirstName, actualFirstName, "wrong");
    }

    @Test
    public void test_last_name(){
        Actor test_LastName = new Actor();
        String expectedLastName = "Test";
        test_LastName.setLast_name("Test");
        String actualLastName = test_LastName.getLast_name();
        assertEquals(expectedLastName, actualLastName, "wrong");
    }

}
