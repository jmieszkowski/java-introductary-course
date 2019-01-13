package my_package.solid.open_close_principle.exc.exception;

public class UserNotFoundUncheckedExc extends RuntimeException{

    public UserNotFoundUncheckedExc() {
    }

    public UserNotFoundUncheckedExc(String s) {
        super(s);
    }

    public UserNotFoundUncheckedExc(String s, Throwable throwable) {
        super(s, throwable);
    }
}
