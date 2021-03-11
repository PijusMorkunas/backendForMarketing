package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "client")
public class User {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(nullable = false)
    private String username;
    @Column(length = 45, nullable = false)
    private String password;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String phone;
    @Column(length = 45)
    private String address;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String surname;



//    @ManyToMany
//    @JoinTable(name = "category_has_client", joinColumns = {@JoinColumn(name = "client_id")},
//            inverseJoinColumns = {@JoinColumn(name = "category_id")})
//    private List<Category> categories = new ArrayList<>();

}
