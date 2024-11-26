import java.util.ArrayList;
import java.util.List;

class User {
    private String id;
    private String username;
    private List<Message> inbox;
    private App app;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
        this.inbox = new ArrayList<>();
    }

    public void login(App app){
        app.addUser(this);
        this.app = app;
    }

    public void sendMessage(String recipientId, String content){
        if (this.app == null){
            System.out.println("User not logged In");
        }
        getApp().deliverMessage(this.id,recipientId,content);
    }

    public void receiveMessage(Message message){
        this.inbox.add(message);
        message.markDelivered();
        readMessage(this.inbox.size()-1);
    }

    public void readMessage(int idx) {
        if (idx >= 0 || idx < inbox.size()) {
            Message message = inbox.get(idx);
            message.markRead();
            message.log();
        } else {
            System.out.println("Invalid Idx provided");
        }
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Message> getInbox() {
        return inbox;
    }

    public void setInbox(List<Message> inbox) {
        this.inbox = inbox;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

}
