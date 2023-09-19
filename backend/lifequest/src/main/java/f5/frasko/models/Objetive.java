package f5.frasko.models;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "objetives")
public class Objetive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idobjetive")
    public Long idobjetive;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_user", nullable = false)
    @JsonIgnore
    private User userObjetive;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_category", nullable = false)
    @JsonIgnore
    private CategoryObjetive category;

    @OneToMany(mappedBy = "objetive")
    private List<RegisterOfObjetive> register;

    @Column(name = "title")
    public String title;
    @Column(name = "description")
    public String description;
    @Column(name = "limit_date")
    public Date limitDate;
}
