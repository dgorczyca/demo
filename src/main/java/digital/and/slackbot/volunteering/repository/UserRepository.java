package digital.and.slackbot.volunteering.repository;

import digital.and.slackbot.volunteering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByFirstName(String name);
}
