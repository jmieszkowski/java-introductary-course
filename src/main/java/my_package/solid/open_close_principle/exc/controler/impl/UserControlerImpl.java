package my_package.solid.open_close_principle.exc.controler.impl;

import my_package.solid.open_close_principle.exc.controler.UserControler;
import my_package.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;
import my_package.solid.open_close_principle.exc.service.UserService;

import java.util.Objects;

public class UserControlerImpl implements UserControler {
    private UserService userService;


    public UserControlerImpl(UserService userService) {
        this.userService = Objects.requireNonNull(userService);
    }

    @Override
    public String renderUserPage() {
        System.out.println("Making html with user data");
        String html = "";
        try {
            userService.getUser();
        } catch (UserNotFoundCheckedExc userNotFoundCheckedExc) {
            userNotFoundCheckedExc.printStackTrace();
        }

        return html;
    }
}
