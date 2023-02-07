package com.javacourse.project.hibernateAndJpa.DataAccess;

import com.javacourse.project.hibernateAndJpa.Entities.MessageDTO;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateMessageDal implements MessageDal {

    private EntityManager entityManager;


    @Autowired
    public HibernateMessageDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<MessageDTO> getAll() {
       Session session =  entityManager.unwrap(Session.class);
       List<MessageDTO> messages = session.createQuery("from Message",MessageDTO.class).getResultList();
       return messages;
    }


    @Override
    public List<MessageDTO> getByUsername(String username) {Session session =  entityManager.unwrap(Session.class);
        Query query = session.createQuery("from Message where username like: name", MessageDTO.class);
        query.setString("name", username);
        List<MessageDTO> messages = query.getResultList();
        return messages;
    }
}

