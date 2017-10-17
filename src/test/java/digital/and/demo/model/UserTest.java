package digital.and.demo.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User user;

    @Before
    public void setup() {
        user = new User();
        user.setId((long)1);
        user.setAge("20");
        user.setFirstname("John");
        user.setLastname("Doe");
        user.setNationality("British");
    }

    @Test
    public void testUserFieldsNotNull() {
        assertNotNull(user.getId());
        assertNotNull(user.getAge());
        assertNotNull(user.getFirstname());
        assertNotNull(user.getLastname());
        assertNotNull(user.getNationality());
    }

}