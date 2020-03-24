package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @NotNull
        private String name;

        @OneToMany(targetEntity = User.class, mappedBy = "roles")
        private Set<User> users;
}
