package digital.and.slackbot.volunteering.repository;

import digital.and.slackbot.volunteering.model.Event;
import digital.and.slackbot.volunteering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventRepository extends JpaRepository<Event, Long> {
    public User findByName(String name);
}
