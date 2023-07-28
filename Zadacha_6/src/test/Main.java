package test;

public class Main {
    public static void main(String[] args) {
        Saver saver = new Saver();
        User user = new User(1L, "Саня");
        User user1 = new User(2L, "Ваня");
        System.out.println(user);
        System.out.println(user1);
        System.out.println();
        saver.userSave(user);
        saver.userSave(user1);
    }
}
