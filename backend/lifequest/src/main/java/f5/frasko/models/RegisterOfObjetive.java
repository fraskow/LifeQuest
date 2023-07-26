package f5.frasko.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="objetives")
public class RegisterOfObjetive {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idregister")
    public int idregister;

    //TODO objetive relation

    @Column(name="register_date")
    public Date registerDate;
    @Column(name="description", nullable = true)
    public String descrption;

}
