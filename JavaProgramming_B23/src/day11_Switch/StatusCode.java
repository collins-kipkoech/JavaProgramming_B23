package day11_Switch;

public class StatusCode {

    public static void main(String[] args) {
        int Code = 200;
        String message = "";
        switch(Code){
            case 200:
                message = "Ok";
                break;
            case 201:
                message = "Created";
                break;
            case 202:
                message = "Accepted";
                break;
            case 301:
                message = "Moved Permanently";
                break;
            case 303:
                message = "See Other";
                break;
            case 304:
                message = "Not Modified";
                break;
            case 307:
                message = "Temporary Redirected";
                break;
            case 400:
                message = "Bad Request";
                break;
            case 401:
                message = "Unauthorised";
                break;
            case 403:
                message = "Forbidden";
                break;
            case 404:
                message = "Not Found";
                break;
            case 410:
                message = "Gone";
                break;
            case 500:
                message = "Internal Server Error";
                break;
            case 503:
                message = "Service Unavailable";
                break;
            default:
                message = "Error";
                break;


        }
        System.out.println("message = " + message);

    }
}
/*
status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable
* */
