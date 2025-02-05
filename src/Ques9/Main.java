package Ques9;

class NoStackTraceException extends Exception {
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public NoStackTraceException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("This exception does not have a stack trace.");
        } catch (NoStackTraceException e) {
            System.out.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
