package digital.and.slackbot.volunteering.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(mappedBy="users")
    private List<Event> employees;

    private String firstname;
    private String lastname;
    private String nationality;
    private String age;
}
