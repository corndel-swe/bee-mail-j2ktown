import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Message implements Messageable{
    private String id;
    private LocalDateTime timestamp;
    private String content;
    private User from;
    private User to;
    private boolean delivered;
    private boolean read;

    public Message(String content, User from, User to) {
        this.timestamp = LocalDateTime.now();
        this.content = content;
        this.from = from;
        this.to = to;
        this.delivered = false;
        this.read = false;
    }

    public void setId() {
        this.id += 1;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public boolean isRead() {
        return read;
    }

    public void markDelivered() {
        this.delivered = true;
    }

    public void markRead() {
        this.read = true;
    }

    public void log() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Message ID: " + id);
        System.out.println("Timestamp: " + timestamp.format(formatter));
        System.out.println("From: " + from.getUsername());
        System.out.println("To: " + to.getUsername());
        System.out.println("Content: " + content);
        System.out.println("Delivered: " + delivered);
        System.out.println("Read: " + read);
    }
}
