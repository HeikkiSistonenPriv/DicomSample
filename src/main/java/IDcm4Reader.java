import org.dcm4che3.data.Attributes;

import java.nio.file.Path;
import java.util.List;

public interface IDcm4Reader {
    List<Attributes> ReadDicomData(List<Path> filePaths);
}
