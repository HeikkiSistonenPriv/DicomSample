import java.util.List;

public class DicomStorer {
    private Repository dicomRepository;
    public DicomStorer(Repository repository) {
        dicomRepository = repository;
    }
    public void Store(List<DicomEntity> dicoms) {
        dicomRepository.Save(dicoms);

    }
}
