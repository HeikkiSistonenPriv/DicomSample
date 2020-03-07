import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Study")
public class Study {
    @Id
    public String studyInstanceUid;
    public String description;
    @OneToMany
    public List<Serie> series = new ArrayList<Serie>();
}
