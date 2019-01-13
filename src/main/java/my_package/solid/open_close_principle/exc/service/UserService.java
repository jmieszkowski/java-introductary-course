package my_package.solid.open_close_principle.exc.service;

import my_package.solid.open_close_principle.exc.domain.User;
import my_package.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;

public interface UserService {

    User getUser() throws UserNotFoundCheckedExc;
}
