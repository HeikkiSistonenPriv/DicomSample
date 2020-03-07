import org.dcm4che3.data.Attributes;
import org.dcm4che3.io.DicomInputStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.dcm4che3.data.Tag;


public class Dcm4Reader implements Dcm4ReaderBridge {

    public DicomEntity readDicomData(List<Path> filePaths){
        try {
            File file = new File(filePaths.get(3).toAbsolutePath().toString());
            DicomInputStream din = new DicomInputStream(file);
            Attributes attributes = din.readDataset(-1, -1); //read all to save time
            return parseAttributesToDicomEntity(attributes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private DicomEntity parseAttributesToDicomEntity(Attributes attributes) {
        DicomEntity dicomEntity = new DicomEntity();
        dicomEntity.SOPInstanceUID = attributes.getString(Tag.SOPInstanceUID);
        Patient patient = new Patient();
        patient.Id = attributes.getString(Tag.PatientID);
        patient.Name = attributes.getString(Tag.PatientName);
        patient.patientBirthDate = attributes.getString(Tag.PatientBirthDate);
        patient.patientSex = attributes.getString(Tag.PatientSex);
        dicomEntity.patient = patient;

        Study study = new Study();
        study.studyInstanceUid = attributes.getString(Tag.StudyInstanceUID);
        study.description = attributes.getString(Tag.StudyDescription);
        Serie serie = new Serie();
        serie.seriesInstanceUid = attributes.getString(Tag.SeriesInstanceUID);
        serie.description = attributes.getString(Tag.SeriesDescription);
        ArrayList<Serie> series = new ArrayList<Serie>();
        series.add(serie);


        study.series = series;

        ArrayList<Study> studies = new ArrayList<Study>();
        studies.add(study);
        dicomEntity.patient.studies =studies;

        return dicomEntity;

    }
}


