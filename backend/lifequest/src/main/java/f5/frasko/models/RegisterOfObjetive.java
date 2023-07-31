package f5.frasko.models;

import java.sql.Date;
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
@Table(name = "registers")
public class RegisterOfObjetive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idregister")
    public int idregister;

    @OneToMany(mappedBy = "register")
    public List<Objetive> objetives;

    @Column(name = "register_date")
    public Date registerDate;
    @Column(name = "description", nullable = true)
    public String descrption;

}
