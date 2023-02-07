package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.MessageDTO;

public interface MessageDal {
    List<MessageDTO> getAll();
    List<MessageDTO> getByUsername(String username);
}
