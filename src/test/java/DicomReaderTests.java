import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DicomReaderTests {

    @Test
    public void WhenReadingDicomData_DataShouldBeReadFromFileSystemAtGivenFolder()
    {
        SimpleFileReader fileFolderReader = mock(FileFolderReader.class);
        Dcm4ReaderBridge dcm4Reader = mock(Dcm4Reader.class);

        DicomFolderReader dicomReader = new DicomFolderReader(fileFolderReader, dcm4Reader);
        dicomReader.readFolder("c:\\dummydicoms");

        verify(fileFolderReader).readFilesFromFolder("c:\\dummydicoms", ".DCM");
    }

    @Test
    public void WhenReadingDicomData_ListOfDicomEntitiesShouldBeReturned()
    {
        SimpleFileReader fileFolderReader = mock(FileFolderReader.class);
        Dcm4ReaderBridge dcm4Reader = mock(Dcm4Reader.class);
        DicomFolderReader dicomReader = new DicomFolderReader(fileFolderReader,dcm4Reader);

        List<DicomEntity> dicomEntities=   dicomReader.readFolder("c:\\dummydicoms");
        assertFalse(dicomEntities.isEmpty());
    }
}
