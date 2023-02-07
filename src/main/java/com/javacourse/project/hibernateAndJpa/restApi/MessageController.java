package com.javacourse.project.hibernateAndJpa.restApi;

import com.javacourse.project.hibernateAndJpa.Business.MessageService;
import com.javacourse.project.hibernateAndJpa.Entities.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    public List<MessageDTO> get(){
        return messageService.getAll();
    }


    @GetMapping("/messages/{username}")
    public List<MessageDTO> getByUsername(@PathVariable String username){

        return messageService.getByUsername(username);
    }
}
