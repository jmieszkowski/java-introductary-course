package my_package.solid.open_close_principle.exc.application;

import my_package.solid.open_close_principle.exc.controler.UserControler;
import my_package.solid.open_close_principle.exc.controler.impl.UserControlerImpl;
import my_package.solid.open_close_principle.exc.repository.UserDao;
import my_package.solid.open_close_principle.exc.repository.impl.DbReader;
import my_package.solid.open_close_principle.exc.service.UserService;
import my_package.solid.open_close_principle.exc.service.impl.UserServiceImpl;

public class ConsoleApp {
    public static void main(String[] args) {

        UserDao dbDao = new DbReader();
        UserService userService = new UserServiceImpl(dbDao);
        UserControler userControler = new UserControlerImpl(userService);

        userControler.renderUserPage();


    }
}
