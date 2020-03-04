import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DicomStoreTests {

    @Test
    public void WhenStoringDicomData_DataShouldBePersistedToRepo()
    {
        Repository dicomRepository = mock(DicomRepository.class);
        DicomStorer dicomStorer = new DicomStorer(dicomRepository);
        dicomStorer.Store(null);

        verify(dicomRepository).Save(null);
    }

    @Test
    public void WhenStoringDicomData_AllGivenDicomsShouldBeSaved()
    {
        Repository dicomRepository = mock(DicomRepository.class);
        DicomStorer dicomStorer = new DicomStorer(dicomRepository);
        ArrayList<DicomEntity> dicoms = new ArrayList<>();
        dicomStorer.Store(dicoms);

        verify(dicomRepository).Save(dicoms);
    }



}
