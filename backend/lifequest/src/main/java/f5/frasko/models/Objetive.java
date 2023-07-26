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
@Table(name = "objetives")
public class Objetive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idobjetive")
    public int idobjetive;

    // TODO user fk

    // TODO category fk

    @Column(name = "title")
    public String title;
    @Column(name = "description")
    public String description;
    @Column(name = "limit_date")
    public Date limitDate;
    @Column(name = "priority")
    public int priority;
}
