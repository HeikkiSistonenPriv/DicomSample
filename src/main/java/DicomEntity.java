
import javax.persistence.*;

@Entity
@Table(name = "DicomEntity")
public class DicomEntity {
    @Id
    public String SOPInstanceUID;
    @OneToOne
    public Patient patient;

}
