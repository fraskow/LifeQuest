package f5.frasko.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    public int iduser;

    @Column(name = "email")
    public String email;

    @Column(name = "password")
    public String password;

    @OneToMany(mappedBy = "userObjetive")
    public List<Objetive> objetives;

    @OneToMany(mappedBy = "userComment")
    public List<Comment> comments;

}
