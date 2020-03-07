import org.junit.jupiter.api.Test;

public class Dcm4ReaderTests {

    @Test
    public void WhenReadingDicomFile_DicomAttributesShouldBeReturned() {
        Dcm4ReaderBridge dcm4Reader = new Dcm4Reader();
        SimpleFileReader fileFolderReader = new FileFolderReader();

        dcm4Reader.readDicomData(fileFolderReader.readFilesFromFolder("c:\\dummydicoms", ".DCM"));

    }
}
