public class DicomReader {
    IFileFolderReader _fileFolderReader;
    public DicomReader(IFileFolderReader fileFolderReader)
    {
        _fileFolderReader = fileFolderReader;
    }
    public void ReadFolder(String folderPath) {
        _fileFolderReader.ReadFilesFromFolder("any");
    }
}
