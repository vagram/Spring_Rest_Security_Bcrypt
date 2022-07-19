package spring.hibernate.dao_or_repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.hibernate.entity.Case;

import java.util.List;

@Repository
public class TodoRepositoryImpl implements TodoRepository{
    private SessionFactory sessionFactory;

    @Autowired
    public TodoRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Case> getAllTodos() {
        Session session = sessionFactory.getCurrentSession();
        List<Case> aCases = session
                .createQuery("select e from Case e where e.isDeleted <> 1", Case.class)
                .getResultList();
        return aCases;
    }

    @Override
    public Case getById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Case todo = session.get(Case.class, id);
        return todo;
    }

    @Override
    public void saveTodo(Case aCase) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(aCase);
    }

    @Override
    public void deleteAllCases() {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("update Case e set e.isDeleted = 1").executeUpdate();
    }
}
