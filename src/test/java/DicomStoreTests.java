import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DicomStoreTests {

    @Test
    public void WhenStoringDicomData_DataShouldBePersistedToRepo()
    {
        DicomRepository dicomRepository = mock(DicomRepository.class);
        DicomStorer dicomStorer = new DicomStorer(dicomRepository);
        dicomStorer.Store();

        verify(dicomRepository).Save();
    }

    @Test
    public void WhenStoringDicomData_AllGivenDicomsShouldBeSaved()
    {

    }



}
