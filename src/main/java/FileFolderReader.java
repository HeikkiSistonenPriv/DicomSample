import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileFolderReader implements SimpleFileReader {
    @Override
    public List<Path> readFilesFromFolder(String folderPath, String extension)  {
        List<Path> filepahts= null;
        try {
            filepahts = Files.walk(Paths.get(folderPath))
                    .filter(f -> f.toAbsolutePath().toString().toUpperCase().endsWith(extension) )
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filepahts;
    }
}
