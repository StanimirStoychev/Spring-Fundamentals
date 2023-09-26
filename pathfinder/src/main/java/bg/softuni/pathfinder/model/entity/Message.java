package bg.softuni.pathfinder.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message extends BaseEntity {

    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;

    @Column(name = "text_content", columnDefinition = "TEXT", nullable = false)
    private String textContent;

    @ManyToOne(optional = false)
    private User author;

    @ManyToOne(optional = false)
    private User recipient;

    public Message() {}

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Message setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public String getTextContent() {
        return textContent;
    }

    public Message setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Message setAuthor(User author) {
        this.author = author;
        return this;
    }

    public User getRecipient() {
        return recipient;
    }

    public Message setRecipient(User recipient) {
        this.recipient = recipient;
        return this;
    }
}
