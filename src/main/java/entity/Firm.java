package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "firm")
public class Firm {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(length = 45, nullable = false)
    private String companyName;
    @Column(unique = true, length = 45)
    private String email;
    @Column
    private String phone;
    @Column(length = 45,nullable = false)
    private String password;
    @Column(length = 45,nullable = false, unique = true)
    private String username;
}
