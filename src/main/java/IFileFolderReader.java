import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface IFileFolderReader {
    List<Path> ReadFilesFromFolder(String folderPath, String extension);
}
