import java.util.List;

public interface Repository {
    void save(List<DicomEntity> dicoms);
}
