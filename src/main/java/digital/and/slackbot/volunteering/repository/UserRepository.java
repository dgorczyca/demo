package digital.and.slackbot.volunteering.repository;

import digital.and.slackbot.volunteering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findBySlackUsername(String name);
}
