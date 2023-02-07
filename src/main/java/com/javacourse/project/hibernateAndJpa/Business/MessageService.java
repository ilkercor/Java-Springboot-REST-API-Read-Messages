package com.javacourse.project.hibernateAndJpa.Business;

import com.javacourse.project.hibernateAndJpa.Entities.MessageDTO;

import java.util.List;

public interface MessageService {
    List<MessageDTO> getAll();

    List<MessageDTO> getByUsername(String username);
}
