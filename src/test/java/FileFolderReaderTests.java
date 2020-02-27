import org.junit.jupiter.api.Test;


public class FileFolderReaderTests {

    @Test
    public void WhenReadingFilesFromFolder_ConsoleShouldLogTheFilePaths()
    {
        FileFolderReader fileFolderReader = new FileFolderReader();
        fileFolderReader.ReadFilesFromFolder("C:\\dummydicoms");
    }
}
