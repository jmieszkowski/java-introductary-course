package my_package.solid.open_close_principle.exc.repository;

import my_package.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;

public interface UserDao {

    String getUserFromDb() throws UserNotFoundCheckedExc;
}
