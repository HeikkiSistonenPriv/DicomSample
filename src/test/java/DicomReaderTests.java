import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DicomReaderTests {

    @Test
    public void WhenReadingDicomData_DataShouldBeReadFromFileSystemAtGivenFolder()
    {
        FileFolderReader fileFolderReader = mock(FileFolderReader.class);
        Dcm4Reader dcm4Reader = mock(Dcm4Reader.class);

        DicomFolderReader dicomReader = new DicomFolderReader(fileFolderReader, dcm4Reader);
        dicomReader.ReadFolder("c:\\dummydicoms");

        verify(fileFolderReader).ReadFilesFromFolder("c:\\dummydicoms", ".DCM");
    }

    @Test
    public void WhenReadingDicomData_ListOfDicomEntitiesShouldBeReturned()
    {
        FileFolderReader fileFolderReader = mock(FileFolderReader.class);
        Dcm4Reader dcm4Reader = mock(Dcm4Reader.class);
        DicomFolderReader dicomReader = new DicomFolderReader(fileFolderReader,dcm4Reader);

        List<DicomEntity> dicomEntities=   dicomReader.ReadFolder("c:\\dummydicoms");
        assertFalse(dicomEntities.isEmpty());
    }
}
