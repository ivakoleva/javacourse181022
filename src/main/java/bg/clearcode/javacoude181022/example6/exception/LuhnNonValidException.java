package bg.clearcode.javacoude181022.example6.exception;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public class LuhnNonValidException extends NonValidException {
    public LuhnNonValidException() {
    }

    public LuhnNonValidException(String message) {
        super(message);
    }

    public LuhnNonValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public LuhnNonValidException(Throwable cause) {
        super(cause);
    }

    public LuhnNonValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
