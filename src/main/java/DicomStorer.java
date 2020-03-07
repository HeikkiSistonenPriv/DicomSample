import java.util.List;

public class DicomStorer {
    private Repository dicomRepository;
    public DicomStorer(Repository repository) {
        dicomRepository = repository;
    }
    public void store(List<DicomEntity> dicoms) {
        dicomRepository.save(dicoms);

    }
}
