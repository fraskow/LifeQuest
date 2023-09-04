package f5.frasko.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="fk_objetive", nullable=false)
    @JsonIgnore
    public Objetive objetive;

    @Column(name = "register_date")
    public Date registerDate;
    @Column(name = "description", nullable = true)
    public String descrption;

}
