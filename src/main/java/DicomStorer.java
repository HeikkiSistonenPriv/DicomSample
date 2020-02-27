import java.util.List;

public class DicomStorer {
    IDicomRepository _dicomRepository;
    public DicomStorer(IDicomRepository dicomRepository) {
        _dicomRepository = dicomRepository;
    }
    public void Store(List<DicomEntity> dicoms) {
        _dicomRepository.Save(dicoms);

    }
}
