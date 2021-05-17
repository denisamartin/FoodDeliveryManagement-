package business;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    private Role role;
    private int id = 0;
    private int orders = 0;

    public User(String username, String password, Role role) {
        this.password = password;
        this.username = username;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }
}
