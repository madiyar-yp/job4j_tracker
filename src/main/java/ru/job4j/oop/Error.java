package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void errorInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.errorInfo();
        Error error2 = new Error(true, 1, "HTTP Status 403 for request POST");
        error2.errorInfo();
        Error error3 = new Error(true, 2, "Resource not accessible by integration");
        error3.errorInfo();
    }
}