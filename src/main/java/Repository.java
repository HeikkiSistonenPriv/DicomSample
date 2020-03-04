import java.util.List;

public interface Repository {
    void Save(List<DicomEntity> dicoms);
}
