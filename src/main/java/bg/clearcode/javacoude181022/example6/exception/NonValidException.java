package bg.clearcode.javacoude181022.example6.exception;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public class NonValidException extends Exception {
    public NonValidException() {
    }

    public NonValidException(final String message) {
        super(message);
    }

    public NonValidException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NonValidException(final Throwable cause) {
        super(cause);
    }

    public NonValidException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
