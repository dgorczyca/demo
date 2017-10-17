package digital.and.demo.model;

import digital.and.demo.repository.UserRepository;
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
        user.setAge("20");
        user.setFirstname("John");
        user.setLastname("Doe");
        user.setNationality("British");
    }

    @Test
    public void saveUserTest() {
        entityManager.persist(user);
        userRepository.findByFirstname("John");
        assertThat(user.getLastname(),is("Doe"));
    }
}
