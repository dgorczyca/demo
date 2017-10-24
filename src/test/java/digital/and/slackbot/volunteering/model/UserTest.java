package digital.and.slackbot.volunteering.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

public class UserTest {

    private User user;

    @Before
    public void setup() {
        user = new User();
        user.setId((long)1);
        user.setSlackUsername("jsmith");
        user.setSlackId("U7NAPBC7M");
        user.setRealName("John Smith");
    }

    @Test
    public void testUserFieldsNotNull() {
        assertNotNull(user.getId());
        assertThat(user.getRealName(),is("John Smith"));
        assertThat(user.getSlackId(),is("U7NAPBC7M"));
    }

}