import org.dcm4che3.data.Attributes;

import java.nio.file.Path;
import java.util.List;

public interface Dcm4ReaderBridge {
    List<Attributes> ReadDicomData(List<Path> filePaths);
}
