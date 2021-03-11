package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "credentials")
public class Credentials {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private Boolean active;
    @Column
    private Boolean accType;
    @OneToMany
    List<Firm> firmList = new ArrayList<>();
    @OneToMany
    List<User> userList = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "credentials_has_category", joinColumns = {@JoinColumn(name = "credentials_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")})
    private List<Category> categories = new ArrayList<>();


}
