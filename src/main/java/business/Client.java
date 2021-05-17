package business;

public class Client extends User {
    private static final long  serialVersionUID = 4825692467272629672L;
    private int id = 0;
    private int orders = 0;

    public Client(String username, String password, int id) {
        super(username, password, Role.CLIENT);
        this.id = id;
    }

}
