package homework.User;

/**
 * Юзверь, ради него все пляски
 */
public class User extends Someone {
    public Long id;
    public String name;

    /**
     * Рождение Юзверя, так сказать... странные шутки у природы, на кой он ей сдался?
     * @param id - порядковый номер Юзверя
     * @param name - его имя в миру
     */
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Явим миру имя Юзверя
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Явим миру порядковый номер Юзверя (не всегда шестой, что странно)
     * @return
     */
    public Long getId() {return id;}

    @Override
    public String toString() {
        return String.format("%d,  %s", id, name);
    }

}
