import java.util.List;

public interface IDicomRepository {
    void Save(List<DicomEntity> dicoms);
}
