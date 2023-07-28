package homework.Reporting;

import homework.User.User;

/**
 * Класс, созданный исключительно во имя бога SOLIDа, дабы внести Юзверя в список упомянутых
 * в вечерней молитве, дабы воздать ему по заслугам (какие там заслуги, прости, Господи!)
 */
public class UserReporter implements Reportable {
    /**
     * Класс, формирующий отчет по Юзверю...
     */
    public UserReporter() {
    }

    /**
     * Метод внесения Юзверя в репорт
     * @param user - все тот же Юзверь, надоел уже
     */
    public void reportUser(User user) {
        System.out.println("Report for user:  id " + user.getId() + "  name " + user.getName());
        }
    }


