package digital.and.demo.repository;

import digital.and.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByFirstname(String name);
}
