import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SlqliteDicomRepository implements Repository {


    public void save(List<DicomEntity> dicoms) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(dicoms.get(0));
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
