package servlet.hibernate4Homework.dao.cmAct;

import servlet.hibernate4Homework.pojo.cmActpj.Worker;
import servlet.hibernate4Homework.pojo.cmActpj.WorkerCharacteristic;

public interface CriminalMindsWorkersDao {

       String create(Worker worker);
       Worker read(int num);
       boolean update(int num, String nName, WorkerCharacteristic nCharacteristic);

       boolean delete(int num);
}
