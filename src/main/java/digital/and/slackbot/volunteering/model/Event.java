package digital.and.slackbot.volunteering.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    @JoinTable(
            name="event_user",
            joinColumns = @JoinColumn(name="event_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="user_id", referencedColumnName = "id")
    )
    private List<User> users;

    private String name;
    private String description;
    private String location;
    private String startDate;
    private String endDate;
    private String type;
}
