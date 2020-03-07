import java.nio.file.Path;
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
        List<Path> filePaths= fileFolderReader.readFilesFromFolder(folderPath, ".DCM");
        ArrayList<DicomEntity> dicoms = new ArrayList<>();
        dicoms.add(dcm4Reader.readDicomData(filePaths));
        return dicoms;
    }
}
