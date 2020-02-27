import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DicomReaderTests {

    @Test
    public void WhenReadingDicomData_DataShouldBeReadFromFileSystemAtGivenFolder()
    {


        FileFolderReader fileFolderReader = mock(FileFolderReader.class);
        DicomReader dicomReader = new DicomReader(fileFolderReader);
        dicomReader.ReadFolder("c:\\dummydicoms");

        verify(fileFolderReader).ReadFilesFromFolder("c:\\dummydicoms", ".DCM");

    }
}
