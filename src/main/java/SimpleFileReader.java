import java.nio.file.Path;
import java.util.List;

public interface SimpleFileReader {
    List<Path> ReadFilesFromFolder(String folderPath, String extension);
}
