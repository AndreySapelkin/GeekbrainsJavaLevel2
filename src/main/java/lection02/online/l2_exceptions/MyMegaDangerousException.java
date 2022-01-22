package lection02.online.l2_exceptions;

public class MyMegaDangerousException extends RuntimeException {
    public MyMegaDangerousException() {
        super();
    }

    public MyMegaDangerousException(String message) {
        super(message);
    }

}
