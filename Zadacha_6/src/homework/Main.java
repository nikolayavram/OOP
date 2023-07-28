package homework;

import homework.Reporting.UserReporter;
import homework.Saving.UserSaver;
import homework.User.User;

public class Main {

    public static void main(String[] args) {
        UserSaver usSaver = new UserSaver();
        UserReporter usReporter = new UserReporter();

        User user = new User(1L,"Bob");
        User user1 = new User(2L,"Tom");
        System.out.println();

        usSaver.saveUser(user);
        usSaver.saveUser(user1);
        System.out.println();

        usReporter.reportUser(user);
        usReporter.reportUser(user1);
    }
}