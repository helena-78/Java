package edu04.homeworks;
import java.util.Scanner;

public enum HTTPError {
    OK, CREATED, NO_CONTENT, BAD_REQUEST, FORBIDDEN, NOT_FOUND, INTERNAL_SERVER_ERROR;
}
class Class{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        HTTPError httpError = null;
        System.out.println("input error code: ");
        httpError=switch (sc.nextInt()){
            case 200 -> HTTPError.OK;
            case 201 -> HTTPError.CREATED;
            case 204 -> HTTPError.NO_CONTENT;
            case 400 -> HTTPError.BAD_REQUEST;
            case 403 -> HTTPError.FORBIDDEN;
            case 404 -> HTTPError.NOT_FOUND;
            case 500 -> HTTPError.INTERNAL_SERVER_ERROR;
            default -> null;
        };
        System.out.println(httpError);
        sc.close();
    }
}
