import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FileFolderReaderTests {

    @Test
    public void WhenReadingFilesFromFolder_ConsoleShouldLogTheFilePaths()
    {
        FileFolderReader fileFolderReader = new FileFolderReader();
        fileFolderReader.ReadFilesFromFolder("C:\\dummydicoms",".DCM");
    }

    @Test
    public void WhenGettingFileFromFolder_OnlyDcmsShouldBeReturned()
    {
        FileFolderReader fileFolderReader = new FileFolderReader();

        List<Path> filePaths = fileFolderReader.ReadFilesFromFolder("C:\\dummydicoms", ".DCM");
        // to save time.
        filePaths.forEach(f -> {
            assertTrue(f.toAbsolutePath().getFileName().toString().toUpperCase().endsWith(".DCM"));
        });
    }


}
