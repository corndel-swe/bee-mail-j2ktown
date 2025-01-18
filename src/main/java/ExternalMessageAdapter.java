// differnces
// no id
// no timestamp
// no delievred
// no from
// no to

// map
// body to content
// toggle read to read

// when setting id, if the logic is on message, should i create instance of message to generate it?
// what is messages are stored s


import java.time.LocalDateTime;
import java.util.UUID;

public class ExternalMessageAdapter implements Messageable{
    private  ExternalMessage externalMessage;
    private User userFrom;
    private User userTo;
    private String id;
    private boolean deliverd;
    private LocalDateTime timestamp;

    public ExternalMessageAdapter(User userFrom, User userTo, ExternalMessage externalMessage){
        this.externalMessage = externalMessage;
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.id = UUID.randomUUID().toString();
        this.deliverd = false;
    }

    @Override
    public void setId() {
        this.id = this.id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    @Override
    public String getContent() {
        return externalMessage.getBody();
    }

    @Override
    public User getFrom() {
        return this.userFrom;
    }

    @Override
    public User getTo() {
        return this.userTo;
    }

    @Override
    public boolean isDelivered() {
        return this.deliverd;
    }

    @Override
    public boolean isRead() {
        return externalMessage.istRead();
    }

    @Override
    public void markDelivered() {

    }

    @Override
    public void markRead() {
        externalMessage.toggleRead();
    }

    @Override
    public void log() {

    }
}
