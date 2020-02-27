import org.junit.jupiter.api.Test;

public class Dcm4ReaderTests {

    @Test
    public void WhenReadingDicomFile_DicomAttributesShouldBeReturned() {
        Dcm4Reader dcm4Reader = new Dcm4Reader();
        FileFolderReader fileFolderReader = new FileFolderReader();

        dcm4Reader.ReadDicomData(fileFolderReader.ReadFilesFromFolder("c:\\dummydicoms", ".DCM"));

    }
}
