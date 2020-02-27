import java.util.ArrayList;
import java.util.List;

public class DicomFolderReader {
    IFileFolderReader _fileFolderReader;
    IDcm4Reader _dcm4Reader;
    public DicomFolderReader(IFileFolderReader fileFolderReader, IDcm4Reader dcm4Reader)
    {
        _fileFolderReader = fileFolderReader;
        _dcm4Reader = dcm4Reader;
    }
    public List<DicomEntity> ReadFolder(String folderPath) {
        _fileFolderReader.ReadFilesFromFolder(folderPath, ".DCM");

        return new ArrayList<DicomEntity>();
    }
}
