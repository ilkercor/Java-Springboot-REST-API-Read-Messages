package com.javacourse.project.hibernateAndJpa.Business;

import com.javacourse.project.hibernateAndJpa.DataAccess.MessageDal;
import com.javacourse.project.hibernateAndJpa.Entities.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessageManager implements MessageService {

    private MessageDal messageDAL;

    @Autowired
    public MessageManager(MessageDal messageDAL) {
        this.messageDAL = messageDAL;
    }

    @Override
    @Transactional
    public List<MessageDTO> getAll() {
        return this.messageDAL.getAll();
    }


    @Override
    @Transactional
    public List<MessageDTO> getByUsername(String username) {
        return this.messageDAL.getByUsername(username);
    }
}
