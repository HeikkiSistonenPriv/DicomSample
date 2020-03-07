import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SqlLiteDicomRepositoryTests {

    @Test
    public void WhenStoringDataToSlqLite_NoExceptionsShouldBeThrown()
    {
        SlqliteDicomRepository repo = new SlqliteDicomRepository();
        ArrayList<DicomEntity> dicoms = new ArrayList<>();
        DicomEntity ent = new DicomEntity();
        Patient patient = new Patient();
        patient.Id="1";
        patient.patientSex= "M";
        patient.patientBirthDate = "date";
        patient.Name = "Test name";
        Serie serie = new Serie();
        serie.seriesInstanceUid ="1.1.2.3.series";
        serie.description ="series desc";

        ArrayList<Serie> series = new ArrayList<Serie>();
        series.add(serie);


        Study study = new Study();
        study.series = series;
        study.description ="study desc";
        study.studyInstanceUid = "1.2.43.study";
        ArrayList<Study> studies = new ArrayList<Study>();
        studies.add(study);
        patient.studies = studies;

        ent.patient =patient;
         dicoms.add(ent);
        repo.save(dicoms);
    }
}
