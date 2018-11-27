package org.ananta.exceptions;

public class Exceptions {
    public static void main(String[] args) {

        try {
            System.out.println("результат " +calc(0,1));
        }catch (MyException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();


        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("Конец");


    }

    public static int calc(int x, int y) throws MyException {
        try {
            return y/x;
        }catch (Exception error){
            throw new MyException("Не надо делить на ноль x = "+x+" y = "+y, error, x, y);

        }
    }


    public static class MyException extends Exception{
        private int x;
        private int y;

        public MyException(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public MyException(String message, int x, int y) {
            super(message);
            this.x = x;
            this.y = y;
        }

        public MyException(String message, Throwable cause, int x, int y) {
            super(message, cause);
            this.x = x;
            this.y = y;
        }

        public MyException(Throwable cause, int x, int y) {
            super(cause);
            this.x = x;
            this.y = y;
        }

        public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int x, int y) {
            super(message, cause, enableSuppression, writableStackTrace);
            this.x = x;
            this.y = y;
        }
    }
}
