import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileFolderReader implements IFileFolderReader {
    @Override
    public List<String> ReadFilesFromFolder(String folderPath)  {
        try {
            Files.walk(Paths.get(folderPath))
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
