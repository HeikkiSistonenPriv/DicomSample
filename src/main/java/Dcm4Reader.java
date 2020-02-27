import org.dcm4che3.data.Attributes;
import org.dcm4che3.io.DicomInputStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Dcm4Reader implements IDcm4Reader {

    public List<Attributes> ReadDicomData(List<Path> filePaths){
        try {
            DicomInputStream din = new DicomInputStream(new File(filePaths.get(2).toAbsolutePath().toString()));
            Attributes attributes =  din.getFileMetaInformation();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
