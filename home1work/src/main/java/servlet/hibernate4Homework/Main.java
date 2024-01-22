package servlet.hibernate4Homework;

import org.hibernate.Session;
import servlet.hibernate4Homework.dao.cm.CriminalMindsDao;
import servlet.hibernate4Homework.dao.cm.CriminalMindsDaoImpl;
import servlet.hibernate4Homework.dao.cmAct.CriminalMindsWorkersDao;
import servlet.hibernate4Homework.dao.cmAct.CriminalMindsWorkersDaoImpl;
import servlet.hibernate4Homework.dao.cmCha.CriminalMindsCharactersDao;
import servlet.hibernate4Homework.dao.cmCha.CriminalMindsCharactersDaoImpl;
import servlet.hibernate4Homework.pojo.cmActpj.Actor;
import servlet.hibernate4Homework.pojo.cmActpj.Worker;
import servlet.hibernate4Homework.pojo.cmActpj.WorkerCharacteristic;
import servlet.hibernate4Homework.pojo.cmChapj.CharacterСharacteristic;
import servlet.hibernate4Homework.pojo.cmChapj.MainCharacter;
import servlet.hibernate4Homework.pojo.cmChapj.ShowCharacters;
import servlet.hibernate4Homework.pojo.cmpj.Cm;
import servlet.hibernate4Homework.pojo.cmpj.Show;
import servlet.hibernate4Homework.pojo.cmpj.ShowCharacteristic;

import java.sql.Date;


public class Main {
    private static final CriminalMindsDao SHOW_DAO = new CriminalMindsDaoImpl(NewSessionFactory.getSessionFactory());
    private static final CriminalMindsWorkersDao WORKERS_DAO = new CriminalMindsWorkersDaoImpl(NewSessionFactory.getSessionFactory());
    private static final CriminalMindsCharactersDao CHARACTERS_DAO = new CriminalMindsCharactersDaoImpl(NewSessionFactory.getSessionFactory());
    private static final ShowCharacters MAIN_CHARACTER = new MainCharacter(null, "Spencer Reid",
            new CharacterСharacteristic(1,  Boolean.TRUE,
                    "BAU Special Agent",
                    "(PhDs in: Mathematics,Chemistry, Engineering;BAs in:Psychology,Sociology,Philosophy (in progress))"
            ),324);
    private static final Worker ACTOR = new Actor(null, "Matthew Gray Gubler",
            new WorkerCharacteristic(Date.valueOf("1980-03-09"),
                    "Las Vegas, Nevada, U.S.", 24),"Spencer Reid",31);
    private static final Show CRIMINAL_MINDS = new Cm(null,"Criminal Minds",
            new ShowCharacteristic
            ("U.S.", Date.valueOf("2005-09-22")),15, Boolean.TRUE);

    public static void main(String[] args) {
        try {
            pushDataIntoDatabase();
            printIdentifiers();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Program failed with exception: " + e.getMessage());
        }
    }

    private static void pushDataIntoDatabase() {
        SHOW_DAO.create(CRIMINAL_MINDS);
        WORKERS_DAO.create(ACTOR);
        CHARACTERS_DAO.create(MAIN_CHARACTER);
    }

    private static void printIdentifiers() {
        try (Session session = NewSessionFactory.getSessionFactory().openSession()) {
            session.refresh(MAIN_CHARACTER);
            session.refresh(ACTOR);
            session.refresh(CRIMINAL_MINDS);
            System.out.println( session.getIdentifier(MAIN_CHARACTER));
            System.out.println( session.getIdentifier(ACTOR));
            System.out.println( session.getIdentifier(CRIMINAL_MINDS));
        }
    }
}