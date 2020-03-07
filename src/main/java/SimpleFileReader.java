import java.nio.file.Path;
import java.util.List;

public interface SimpleFileReader {
    List<Path> readFilesFromFolder(String folderPath, String extension);
}
