package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private String categoryName;
    @ManyToMany(mappedBy = "category")
    private List<Advert> advertList = new ArrayList<>();
    @ManyToMany(mappedBy = "category")
    private List<User> userList = new ArrayList<>();
}
