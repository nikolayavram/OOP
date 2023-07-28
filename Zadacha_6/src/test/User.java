package test;

public class User extends Somebody {
    public Long id;
    public String name;
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return String.format("id: %d name: %s", id,name );
    }
}
