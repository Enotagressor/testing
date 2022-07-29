package pro.sky.testing.exeption;

public class ZeroExeption extends IllegalArgumentException{
    public ZeroExeption() {
    }

    public ZeroExeption(String s) {
        super(s);
    }

    public ZeroExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroExeption(Throwable cause) {
        super(cause);
    }
}
