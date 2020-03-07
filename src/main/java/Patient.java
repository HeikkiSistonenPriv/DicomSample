import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "Patient")
public class Patient {
    @Id
    public String Id;
    public String Name;
    public String patientBirthDate;
    public String patientSex;
    @OneToMany
    public List<Study> studies = new ArrayList<Study>();


}
