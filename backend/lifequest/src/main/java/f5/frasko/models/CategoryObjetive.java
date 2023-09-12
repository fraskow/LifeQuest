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
@Table(name = "categories")
public class CategoryObjetive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategories")
    public int idcategories;
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;

    @OneToMany(mappedBy = "category")
    public List<Objetive> objetives;

}
