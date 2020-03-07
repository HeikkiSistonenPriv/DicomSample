import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FileFolderReaderTests {

    @Test
    public void WhenReadingFilesFromFolder_ConsoleShouldLogTheFilePaths()
    {
        SimpleFileReader fileFolderReader = new FileFolderReader();
        fileFolderReader.readFilesFromFolder("C:\\dummydicoms",".DCM");
    }

    @Test
    public void WhenGettingFileFromFolder_OnlyDcmsShouldBeReturned()
    {
        SimpleFileReader fileFolderReader = new FileFolderReader();

        List<Path> filePaths = fileFolderReader.readFilesFromFolder("C:\\dummydicoms", ".DCM");
        // to save time.
        filePaths.forEach(f -> {
            assertTrue(f.toAbsolutePath().toString().toUpperCase().endsWith(".DCM"));
        });
    }


}
