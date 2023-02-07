package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;


@Entity(name = "Message")
@Table(name = "messages")
public class MessageDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "message")
    private String message;

    @Column(name = "date")
    private String date;

    public MessageDTO() {
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MessageDTO(Long id, String username, String message, String date) {
        this.id = id;
        this.username = username;
        this.message = message;
        this.date = date;
    }
}
