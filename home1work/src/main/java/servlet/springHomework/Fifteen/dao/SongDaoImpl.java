package servlet.springHomework.Fifteen.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import servlet.springHomework.Fifteen.pojo.Song;

public class SongDaoImpl implements SongDao {
    private final SessionFactory sessionFactory;
    public SongDaoImpl(SessionFactory sessionFactory) {
    if (sessionFactory == null) {
        throw new IllegalArgumentException("sessionFactory cannot be null");
    }
        this.sessionFactory = sessionFactory;
}

    @Override
    public String saveNewSong(Song song) {
       Session session = sessionFactory.getCurrentSession();
       return (String) session.save(song);
    }
}
