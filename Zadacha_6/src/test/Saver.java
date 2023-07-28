package test;

public class Saver implements ForSaver{
    public Saver() {
    }
    public void userSave(User user) {
        if (user.getName() == "Ваня") {
            System.out.println("И " + user.getName() + " не забыт");
        }
        else {
            System.out.println(user.getName() + " cохранен");
        }
    }

}
