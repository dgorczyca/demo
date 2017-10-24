package digital.and.slackbot.volunteering.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User user;

    @Before
    public void setup() {
        user = new User();
        user.setId((long)1);
        user.setSlackId("123hij");
        user.setFirstName("John");
        user.setLastName("Doe");
    }

    @Test
    public void testUserFieldsNotNull() {
        assertNotNull(user.getId());
        assertNotNull(user.getFirstName());
        assertNotNull(user.getLastName());
        assertEquals(user.getSlackId(), "123hij");
    }

}