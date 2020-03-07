import java.util.ArrayList;
import java.util.List;

public class DicomFolderReader {
    private SimpleFileReader fileFolderReader;
    private Dcm4ReaderBridge dcm4Reader;

    public DicomFolderReader(SimpleFileReader simpleFileReader, Dcm4ReaderBridge dcm4ReaderBridge)
    {
        fileFolderReader = simpleFileReader;
        dcm4Reader = dcm4ReaderBridge;
    }
    public List<DicomEntity> readFolder(String folderPath) {
        fileFolderReader.readFilesFromFolder(folderPath, ".DCM");

        return new ArrayList<DicomEntity>();
    }
}
