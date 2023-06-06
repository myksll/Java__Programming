package dailyVideos.day38_exceptions;


public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------------");

        throw new CustomUncheckedException();

    }

    static class CustomUncheckedException extends RuntimeException {

    }
}
