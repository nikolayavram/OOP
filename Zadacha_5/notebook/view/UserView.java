package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = prompt("имя: ");
                    String lastName = prompt("фамилия: ");
                    String phone = prompt("номер телефона: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("номер идентификатора: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        List<User> users = userController.readAllUsers();
                        System.out.println(users);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    try {
                        String name = prompt("имя: ");
                        String secondName = prompt("фамилия: ");
                        String number = prompt("номер телефона: ");
                        Long userid = Long.parseLong(prompt("номер идентификатора: "));
                        User updated = new User(name, secondName, number);
                        userController.updateUser(userid, updated);
                        break;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                case DELETE:
                    try {
                        Long userid = Long.parseLong(prompt("номер идентификатора: "));
                        userController.delete(userid);
                        break;
                        } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                case NONE:
                    try {
                        Long userid = Long.parseLong(prompt("номер идентификатора: "));
                        userController.upper(userid);
                        break;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

            }

        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
