import java.time.LocalDateTime;

public interface Messageable {
    void setId();

    String getId();

    LocalDateTime getTimestamp();

    String getContent();

    User getFrom();

    User getTo();

    boolean isDelivered();

    boolean isRead();

    void markDelivered();

    void markRead();

    void log();
}
