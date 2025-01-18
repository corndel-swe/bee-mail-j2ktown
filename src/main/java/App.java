import java.util.ArrayList;
import java.util.List;

public class App {
    private static App instance = null;
    private List<User> users;


    private App(){
        this.users = new ArrayList<>();
    }

    public static App getInstance(){
        if (instance == null){
            instance = new App();
        } else {
            System.out.println("Instance already exists");
        }
        return instance;
    }

    public void addUser(User user){
        if (user != null && !users.contains(user)){
            users.add(user);
            System.out.println("User added");
        } else {
            System.out.println("User is null or already exisits/logged in");
        }
    }

    public User findUser(String userId) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public void deliverMessage(String senderId, String recipientId, String content){
        User recipient = findUser(recipientId);
        User sender = findUser(senderId);
        Message message = new Message(content, sender, recipient);
        recipient.receiveMessage(message);
    }
}
