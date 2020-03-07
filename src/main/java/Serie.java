import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Series")
class Serie {
    @Id
    public String seriesInstanceUid;
    public String description;

}
