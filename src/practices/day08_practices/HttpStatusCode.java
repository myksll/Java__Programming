package practices.day08_practices;

public class HttpStatusCode {
    public static void main(String[] args) {

// 1. solution ternary

/*
        int statusCode=500;

        String result=(statusCode==200)?"OK" :(statusCode==201)?"Created" :(statusCode==202)?"Accepted" :
                       (statusCode==301)?"Moved Permanently" :(statusCode==303)?"See Other" :(statusCode==304)?"Not Modified"
                      :(statusCode==  307)?"Temporary Redirect" :(statusCode==400)?"Bad Request" :(statusCode==401)?"Unauthorized" :(statusCode==403) ?"Forbidden" :(statusCode==404) ?"Not Found"
                      :(statusCode==410)?"Gone":(statusCode==500)?" Internal Server Error" :(statusCode==503)?" Service Unavailable" : "invalid status code" ;


        System.out.println(result);
/*



 */
//2.solution switch

        int statusCode = 5000;

        String result = "invalid";

        switch (statusCode) {

            case 200:
                result = "OK";
                break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Accepted";
                break;
            case 301:
                result = "Moved Permanently";
                break;
            case 303:
                result = "See Other";
                break;
            case 304:
                result = "Not Modified";
                break;
            case 307:
                result = "Temporary Redirect";
                break;
            case 400:
                result = "Bad Request";
                break;
            case 401:
                result = "Unauthorized";
                break;
            case 403:
                result = "Forbidden";
                break;
            case 404:
                result = "Not Found";
                break;
            case 410:
                result = "Gone";
                break;
            case 500:
                result = "Internal Server Error";
                break;
            case 503:
                result = "Service Unavailable";
                break;
            default:
                result = "Invalid Status Code";

        }

        System.out.println(result);
    }





}


