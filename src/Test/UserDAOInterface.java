package Test;

public interface UserDAOInterface {

    boolean create(User user);

    boolean ifUserNameExist(String userName);

    boolean checkAccountAndPassword(User user);

}
