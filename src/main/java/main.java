public class main {
    public static void main(String[] args) {
        App app = App.getInstance();
        System.out.println("TESTING Singleton");
        App app1 = App.getInstance();

        System.out.println("TESTING THE APP");
        User user1 = new User("1", "Jack");
        user1.login(app);
        User user2 = new User("2", "Ton");
        user2.login(app);

        user1.sendMessage("2","How are you?");
        user2.sendMessage("1", "Im great!");

    }
}
