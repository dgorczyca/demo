package digital.and.slackbot.volunteering.model;

import digital.and.slackbot.volunteering.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class UserIntegrationTest {

    private User user;

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup() {
        user = new User();
        user.setSlackUsername("jsmith");
        user.setSlackId("U7NAPBC7M");
        user.setRealName("John Smith");
    }

    @Test
    public void saveUserTest() {
        entityManager.persist(user);
        userRepository.findBySlackUsername("jsmith");
        assertThat(user.getRealName(),is("John Smith"));
        assertThat(user.getSlackId(),is("U7NAPBC7M"));
    }
}
