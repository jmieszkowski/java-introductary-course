package pl.com.empas.java_introductory_course.oop.solid.isp.documents.bad;

public class WrongDocumentTypeException extends RuntimeException {

    public WrongDocumentTypeException() {
    }

    public WrongDocumentTypeException(String message) {
        super(message);
    }
}
