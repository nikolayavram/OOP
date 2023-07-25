package notebook.repository.impl;

import notebook.dao.impl.FileOperation;
import notebook.mapper.impl.UserMapper;
import notebook.model.User;
import notebook.repository.GBRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;
    private final FileOperation operation;

    public UserRepository(FileOperation operation) {
        this.mapper = new UserMapper();
        this.operation = operation;
    }

    public List<User> findAll() {
        List<String> lines = operation.readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    public User create(User user) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id) {
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User u : users) {
            lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
        return user;
    }

    public Optional<User> findById(Long fId) {

        return Optional.empty();
    }

    // @Override
    public Optional<User> update(Long id, User user) {
        List<User> users = findAll();
        User editUser = users.stream()
                .filter(u -> u.getId()
                        .equals(id))
                .findFirst().orElseThrow(() -> new RuntimeException(("User not found")));
        editUser.setId(id);
        editUser.setFirstName(user.getFirstName());
        editUser.setLastName(user.getLastName());
        editUser.setPhone(user.getPhone());
        write(users);
        return Optional.empty();
    }

    private void write(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User u : users) {
            lines.add(mapper.toInput(u));
        }
        operation.saveAll(lines);
    }

    public void upper(Long id) {
        List<User> users = findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                user.setFirstName(user.getFirstName().toUpperCase());
                user.setLastName(user.getLastName().toUpperCase());
            }
        }
    }

    @Override
    public boolean delete(Long id) {
        List<User> users = findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                users.removeAll(Collections.singleton(user));
                System.out.println("удаление пользователя... ");
                List<String> lines = new ArrayList<>();
                for (User u : users) {
                    lines.add(mapper.toInput(u));
                }
                operation.saveAll(lines);
                break;
            }

        }
        return false;
    }
    
}
