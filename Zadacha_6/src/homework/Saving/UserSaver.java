package homework.Saving;

import homework.User.User;

/**
 * Класс, созданный исключительно во имя бога SOLIDа, дабы увековечить Юзверя
 */
public class UserSaver implements Savable {
    /**
     * Класс-сейвер
     */
    public UserSaver() {
    }

    /**
     * Метод для увековечения (сохранения) Юзверя, да отсохнут его байты....
     * @param user - конкретный экземпляр Юзверя для сохранения
     */
    public void saveUser(User user) {
        System.out.println("Save user:  id " + user.getId() + "  name " + user.getName());
    }

}
