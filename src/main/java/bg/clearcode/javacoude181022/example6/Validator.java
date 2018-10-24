package bg.clearcode.javacoude181022.example6;

import bg.clearcode.javacoude181022.example6.exception.NonValidException;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public interface Validator<T extends Validatable> {
    void validate(T validatable) throws NonValidException;
}
